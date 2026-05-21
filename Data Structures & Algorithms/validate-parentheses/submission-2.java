class Solution {
    public boolean isValid(String s) {
        int j = s.length() - 1;

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty()) {
                char ch = stack.peek();
            if(ch == '{' && s.charAt(i) == '}') {
                stack.pop();
            } else if(ch == '(' && s.charAt(i) == ')') {
                stack.pop();
            } else if(ch == '[' && s.charAt(i) == ']') {
                stack.pop();
            } else stack.push(s.charAt(i));
            } else stack.push(s.charAt(i));
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
