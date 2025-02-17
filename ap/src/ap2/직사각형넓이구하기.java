package ap2;

import java.util.Arrays;

public class 직사각형넓이구하기 {

    public int solution(int[][] dots) {
        int[] x = new int[4];
        int[] y = new int[4];

        for (int i = 0; i < dots.length; i++) {
            x[i] = dots[i][0];
            y[i] = dots[i][1];
        }

        Arrays.sort(x);
        Arrays.sort(y);

        return (x[3] - x[0]) * (y[3] - y[0]);
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 1},
            {2, 1},
            {2, 2},
            {1, 2}
        };
        int[][] arr2 = {
            {-1, -1},
            {1, 1},
            {1, -1},
            {-1, 1}
        };
        System.out.println(new 직사각형넓이구하기().solution(arr1));
        System.out.println(new 직사각형넓이구하기().solution(arr2));
    }

}