package ap2;

import java.util.Arrays;

public class 이차원으로만들기 {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        System.out.println(Arrays.deepToString(new 이차원으로만들기().solution(arr1, 2)));
        System.out.println(Arrays.deepToString(new 이차원으로만들기().solution(arr2, 3)));
    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length / n; i++) {
            answer[i] = Arrays.copyOfRange(num_list, i * n, (i + 1) * n);
        }

        return answer;
    }

}
