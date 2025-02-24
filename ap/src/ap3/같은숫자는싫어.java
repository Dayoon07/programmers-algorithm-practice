package ap3;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {
    
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if (stack.peek() != arr[i]) stack.push(arr[i]);
        }

        int[] answer = new int[stack.size()];
        for (int a = stack.size() - 1; a >= 0; a--) {
            answer[a] = stack.pop();
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 같은숫자는싫어().solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(new 같은숫자는싫어().solution(new int[]{4, 4, 4, 3, 3})));
    }

}
