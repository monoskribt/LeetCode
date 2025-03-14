package Easy;

import java.util.Stack;

public class RemoveOutermostParentheses {

    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int howDeep = 0;

        for(char el : s.toCharArray()) {

            if(el == '(') {
                if(howDeep > 0) {
                    sb.append(el);
                }
                howDeep++;
            }
            else {
                howDeep--;
                if(howDeep > 0) {
                    sb.append(el);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String result = removeOuterParentheses("(()())(())");
        System.out.println(result);

    }
}
