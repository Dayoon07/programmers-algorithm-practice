package ap;

import java.util.Arrays;

public class 카운트업 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 카운트업().solution(3, 10)));
    }

    public int[] solution(int start_num, int end_num) {
        int l = end_num - start_num;
        int[] answer = new int[l + 1];
        for (int i = 0; i < l + 1; i++) {
            answer[i] = start_num++;
        }
        return answer;
    }

}
