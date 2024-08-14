import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isOpen(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }
        return false;
    }

    public static boolean isPair(char a, char b) {
        if ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}')) {
            return true;
        }
        return false;
    }

    public static boolean isValidParentheses(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        boolean res = true;
        for (int i = 0; i < s.length(); i++) {
            if (isOpen(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty() && isPair(stack.peek(), s.charAt(i))) {
                    stack.pop();
                } else {
                    res = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            res = false;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValidParentheses(s));
    }
}
