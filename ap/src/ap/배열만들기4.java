package ap;

import java.util.Arrays;
import java.util.Stack;

public class 배열만들기4 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(new 배열만들기4().solution(arr)));
    }
    
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty() || stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i++;
            } else {
                stk.pop();
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

}
