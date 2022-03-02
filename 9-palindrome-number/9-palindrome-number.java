class Solution {
    public boolean isPalindrome(int x) {
        Stack<String> stack = new Stack<>();
        String word = Integer.toString(x);
        Boolean result = false;
        
        for (int i = 0; i < word.length(); i++) {
            stack.add(Character.toString(word.charAt(i)));
        }

        
        for (int i = 0; i < word.length(); i++) {
            if (!Character.toString(word.charAt(i)).equals(stack.pop())) {
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }
}