package ap2;

import java.util.Arrays;

public class 가장큰수찾기 {
    
    public int[] solution(int[] array) {
        int max = 0;
        int idx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                idx = i;
            }
        }

        return new int[]{max, idx};
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 3};
        int[] arr2 = {9, 10, 11, 8};
        System.out.println(Arrays.toString(new 가장큰수찾기().solution(arr1)));
        System.out.println(Arrays.toString(new 가장큰수찾기().solution(arr2)));
    }

}
