package ap;

import java.util.Arrays;

public class 배열만들기3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {
            {1, 3},
            {0, 4}
        };
        System.out.println(Arrays.toString(new 배열만들기3().solution(arr, intervals)));
    }

    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int[] ab1 = Arrays.copyOfRange(arr, a1, b1 + 1);

        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        int[] ab2 = Arrays.copyOfRange(arr, a2, b2 + 1);

        int[] answer = new int[ab1.length + ab2.length];
        System.arraycopy(ab1, 0, answer, 0, ab1.length);
        System.arraycopy(ab2, 0, answer, ab1.length, ab2.length);
        return answer;
    }

}