package ap;

import java.util.Arrays;

public class 조건에맞게수열변환하기2 {
    
    public static void main(String[] args) {
        System.out.println(new 조건에맞게수열변환하기2().solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

    public int solution(int[] arr) {
        int count = 0;
        int[] prevArr;

        while (true) {
            prevArr = Arrays.copyOf(arr, arr.length);
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            count++;

            if (Arrays.equals(prevArr, arr)) {
                return count - 1;
            }
        }
    }

}
