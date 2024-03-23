package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        ans.add(row);

        ArrayList<Integer> lastRow;
        for (int i = 2; i <= numRows; ++i) {
            lastRow = row;
            row = new ArrayList<>();
            row.add(1);
            for (int j = 2; j <= i - 1; ++j) {
                row.add(lastRow.get(j - 2) + lastRow.get(j - 1));
            }
            row.add(1);
            ans.add(row);
        }

        return ans;
    }
}
