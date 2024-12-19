package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class AddBinary {

    public static String addBinary(String a, String b) {
        LinkedList<String> queue = new LinkedList<>();

        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;

        while (indexA >= 0 || indexB >= 0) {
            if(indexA >= 0) {
                carry += a.charAt(indexA) - '0';
                indexA--;
            }
            if(indexB >= 0) {
                carry += b.charAt(indexB) - '0';
                indexB--;
            }
            queue.addFirst(String.valueOf(carry % 2));
            carry = carry / 2;
        }
        if(carry > 0) {
            queue.addFirst(String.valueOf(carry));
        }

        StringBuilder sb = new StringBuilder();

        for(String el : queue) {
            sb.append(el);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        String result = addBinary(a, b);
        System.out.println(result);
    }
}
