package ap;

import java.util.Arrays;

public class 수열과구간쿼리2 {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] q = {
            {0, 4, 2},
            {0, 3, 2},
            {0, 2, 2}
        };
        System.out.println(Arrays.toString(new 수열과구간쿼리2().solution(arr, q)));
    }

    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            int minValue = Integer.MAX_VALUE;
            boolean found = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < minValue) {
                    minValue = arr[i];
                    found = true;
                }
            }

            result[q] = found ? minValue : -1;
        }

        return result;
    }

}
