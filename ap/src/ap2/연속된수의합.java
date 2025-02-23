package ap2;

import java.util.Arrays;

public class 연속된수의합 {
    
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int x = (total - (num * (num-1) / 2)) / num;
        
        for(int i = 0; i < num; i++) {
            answer[i] = x + i;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 연속된수의합().solution(3, 12)));
        System.out.println(Arrays.toString(new 연속된수의합().solution(5, 15)));
        System.out.println(Arrays.toString(new 연속된수의합().solution(4, 14)));
        System.out.println(Arrays.toString(new 연속된수의합().solution(5, 5)));
    }

}
