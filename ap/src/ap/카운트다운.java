package ap;

import java.util.Arrays;

public class 카운트다운 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 카운트다운().solution(10, 3)));
    }

    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[(start_num - end_num) + 1];
        int a = 0;
        for (int i = start_num; i >= end_num; i--) {
            answer[a++] = i;
        }
        return answer;
    }

}