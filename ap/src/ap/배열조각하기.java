package ap;

import java.util.Arrays;

public class 배열조각하기 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        System.out.println(Arrays.toString(new 배열조각하기().solution(arr, query)));
    }

    public int[] solution(int[] arr, int[] query) {
        int s = 0;
        int e = arr.length;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                e = s + query[i] + 1;
            } else {
                s += query[i];
            }
        }

        return Arrays.copyOfRange(arr, s, e);
    }
}
