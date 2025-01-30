package ap;

import java.util.Arrays;

public class 수열과구간쿼리4 {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] qw = {
            {0, 4, 1},
            {0, 3, 2},
            {0, 3, 3}
        };
        System.out.println(Arrays.toString(new 수열과구간쿼리4().solution(arr, qw)));
    }

    public int[] solution(int[] arr, int[][] queries) {
        for (int[] a : queries) {
            int s = a[0];
            int e = a[1];
            int k = a[2];
            
            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }

}
