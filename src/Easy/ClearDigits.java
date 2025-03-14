package Easy;

import java.util.Stack;

public class ClearDigits {

    public String clearDigits(String s) {
        Stack<Character> outputStack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char currentElement = s.charAt(i);

            if(!Character.isDigit(currentElement)) {
                outputStack.push(currentElement);
            } else if(Character.isDigit(currentElement) && !outputStack.isEmpty()) {
                outputStack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!outputStack.isEmpty()) {
            result.insert(0, outputStack.pop());
        }
        return result.toString();
    }
}
