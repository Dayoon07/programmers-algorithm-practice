package ap;

import java.util.Arrays;

public class 수열과구간쿼리1 {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] q = {
            {0, 1},
            {1, 2},
            {2, 3}
        };
        System.out.println(Arrays.toString(new 수열과구간쿼리1().solution(arr, q)));
    }

    public int[] solution(int[] arr, int[][] queries) {
        for (int[] que : queries) {
            int s = que[0];
            int e = que[1];

            for (int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        return arr;
    }

}
