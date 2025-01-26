package ap;

import java.util.Arrays;

public class 조건에맞게수열반환하기3 {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 100, 99, 98};
        int[] arr2 = {1, 2, 3, 100, 99, 98};
        System.out.println(Arrays.toString(new 조건에맞게수열반환하기3().solution(arr1, 3)));
        System.out.println(Arrays.toString(new 조건에맞게수열반환하기3().solution(arr2, 2)));
    }

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        }
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }
        return answer;
    }

}
