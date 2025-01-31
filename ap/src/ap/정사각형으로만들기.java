package ap;

import java.util.Arrays;

public class 정사각형으로만들기 {
    
    public static void main(String[] args) {
        int[][] arr1 = {
            {572, 22, 37}, 
            {287, 726, 384}, 
            {85, 137, 292}, 
            {487, 13, 876}
        };
        int[][] arr2 = {
            {57, 192, 534, 2}, 
            {9, 345, 192, 999}
        };
        int[][] arr3 = {
            {1, 2}, 
            {3, 4}
        };

        System.out.println(Arrays.deepToString(solution(arr1)));
        System.out.println(Arrays.deepToString(solution(arr2)));
        System.out.println(Arrays.deepToString(solution(arr3)));
    }

    public static int[][] solution(int[][] arr) {
        int row = arr.length;           // 행 개수
        int col = arr[0].length;        // 열 개수
        int size = Math.max(row, col);  // 정사각형 크기 결정

        int[][] ar = new int[size][size];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ar[i][j] = arr[i][j];
            }
        }

        return ar;
    }

}
