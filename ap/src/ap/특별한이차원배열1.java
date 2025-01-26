package ap;

import java.util.Arrays;

public class 특별한이차원배열1 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new 특별한이차원배열1().solution(3)));
        System.out.println(Arrays.deepToString(new 특별한이차원배열1().solution(6)));
        System.out.println(Arrays.deepToString(new 특별한이차원배열1().solution(1)));
    }

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }

}
