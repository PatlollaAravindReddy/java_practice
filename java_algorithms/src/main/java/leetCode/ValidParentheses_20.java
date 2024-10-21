package leetCode;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String data = "){";
        System.out.println(isValid(data));
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> ss = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                ss.push(s.charAt(i));
            } else if(ss.size() > 0 && ss.peek() == '(' &&  s.charAt(i) == ')' || ss.size() > 0 && ss.peek() == '{' && s.charAt(i) == '}' ||ss.size() > 0 && ss.peek() == '[' && s.charAt(i) == ']') {
                ss.pop();
            } else {
                return false;
            }
        }
        if(ss.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
