package ap2;

import java.util.Arrays;

public class 짝수는싫어요 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 짝수는싫어요().solution(10)));
        System.out.println(Arrays.toString(new 짝수는싫어요().solution(15)));
    }

    public int[] solution(int n) {
        int[] answer;
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[(n + 1) / 2];
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i * 2) + 1;
        }
        return answer;
    }

}
