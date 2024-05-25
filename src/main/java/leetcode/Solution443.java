package leetcode;

// https://leetcode.com/problems/string-compression/

class Solution443 {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        int newSize = 0; // сжатого массива

        int lengthOfGroup = 1;
        char currSymbol = chars[0];

        for (int oldIter = 1; oldIter <= chars.length; oldIter++) { // по исходному
            // следующий элемент группы
            if (oldIter < chars.length && chars[oldIter] == chars[oldIter - 1]) {
                lengthOfGroup++;

            } else { // переход на следующую группу
                chars[newSize++] = currSymbol;
                if (lengthOfGroup > 1) {
                    if (lengthOfGroup <= 9) {
                        chars[newSize++] = (char)(lengthOfGroup + '0');
                    } else {
                        int i = 10;
                        while (i <= lengthOfGroup) {
                            i *= 10;
                        }
                        i /= 10;
                        while (i > 0) {
                            chars[newSize++] = (char)(lengthOfGroup / i + '0');
                            lengthOfGroup %= i;
                            i /= 10;
                        }
                    }
                }

                // начало новой группы
                if (oldIter < chars.length) {
                    currSymbol = chars[oldIter];
                    lengthOfGroup = 1;
                }
            }
        }
        return newSize;
    }
}