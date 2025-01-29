package ap;

import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {58, 172, 746, 89};
        System.out.println(Arrays.toString(new 배열의길이를2의거듭제곱으로만들기().solution(arr1)));
        System.out.println(Arrays.toString(new 배열의길이를2의거듭제곱으로만들기().solution(arr2)));
    }

    public int[] solution(int[] arr) {
        int len = 1;
        while (len < arr.length) len *= 2;

        int[] answer = new int[len];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }

}
