package ap;

import java.util.Arrays;

public class 배열의길이에따라다른연산하기 {
    
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        System.out.println(Arrays.toString(new 배열의길이에따라다른연산하기().solution(arr, 27)));
    }

    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] += n;
                }
            }
        }
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 1) {
                    answer[i] += n;
                }
            }
        }
        return answer;
    }

}
