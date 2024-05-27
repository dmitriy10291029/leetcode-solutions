package leetcode;

// https://leetcode.com/problems/validate-binary-search-tree/description/

class Solution098 {

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
  }

    static private class Stat {
        private int min, max;
        private boolean isValid;

        public Stat(int min, int max, boolean isValid) {
            this.min = min;
            this.max = max;
            this.isValid = isValid;
        }

        public int getMin() {return min;};
        public int getMax() {return max;};
        public boolean isValid() {return isValid;};
    }

    static private Stat INVALID = new Stat(0, 0, false);

    private Stat getStat(TreeNode root) {
        if (root.left == null && root.right == null) {
            return new Stat(root.val, root.val, true);
        }

        Stat leftStat  = root.left  == null ? null : getStat(root.left);
        Stat rightStat = root.right == null ? null : getStat(root.right);

        if ((leftStat  == null || leftStat.isValid()  && leftStat.getMax()  < root.val) &&
                (rightStat == null || rightStat.isValid() && rightStat.getMin() > root.val))
        {
            int min, max;
            if (leftStat == null) {
                min = Math.min(rightStat.min,root.val);
                max = Math.max(rightStat.max,root.val);

            } else if (rightStat == null) {
                min = Math.min(leftStat.min, root.val);
                max = Math.max(leftStat.max, root.val);

            } else {
                min = Math.min(Math.min(leftStat.min, rightStat.min),root.val);
                max = Math.max(Math.max(leftStat.max, rightStat.max),root.val);
            }

            return new Stat(min, max, true);

        } else {
            return INVALID;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return getStat(root).isValid;
    }
}
