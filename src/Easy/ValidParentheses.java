package Easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character el : s.toCharArray()) {
            if(el.equals('(') || el.equals('[') || el.equals('{')) {
                stack.push(el);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if((el == ')' && top == '(') || (el == ']' && top == '[') || (el == '}' && top == '{')) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean result = isValid("()[)");
        System.out.println(result);
    }
}
