class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length > 1) {
            for (int i = 0; i < (strs.length - 1); i++) {
                for (int j = 0; j < strs[i].length(); j++) {
                    if (strs[i + 1].indexOf(strs[i].charAt(j), j) == j) {
                        result += strs[i].charAt(j);
                    } else {
                        break;
                    }
                }

                if (i + 1 < (strs.length - 1)) {
                    strs[i + 1] = result;
                    result = "";
                }
            }
        } else {
            result = strs[0];
        }

        return result;
    }
}