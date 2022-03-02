class Solution {
    public boolean isPalindrome(int x) {
        String word = Integer.toString(x);
        StringBuffer stringBuffer = new StringBuffer(word);

        if (stringBuffer.reverse().toString().equals(word)) {
            return true;
        }

        return false;
    }
}