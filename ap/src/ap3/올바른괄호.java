package ap3;

import java.util.*;

public class 올바른괄호 {

    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new 올바른괄호().solution("()()"));
        System.out.println(new 올바른괄호().solution("(())()"));
        System.out.println(new 올바른괄호().solution(")()("));
        System.out.println(new 올바른괄호().solution("(()("));
    }

}