package ap;

import java.util.Arrays;

public class 조건에맞게수열반환하기1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98, 49};
        System.out.println(Arrays.toString(new 조건에맞게수열반환하기1().solution(arr)));
    }

    public int[] solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
    
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }

}