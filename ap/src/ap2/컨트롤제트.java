package ap2;

import java.util.Stack;

public class 컨트롤제트 {

    public static int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = s.split(" ");

        for (String token : tokens) {
            if (token.equals("Z")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }

}