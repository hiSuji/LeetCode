class Solution {
    public boolean isPalindrome(int x) {
        String word = Integer.toString(x);
        StringBuilder stringBuilder = new StringBuilder(word);

        if (stringBuilder.reverse().toString().equals(word)) {
            return true;
        }

        return false;
    }
}