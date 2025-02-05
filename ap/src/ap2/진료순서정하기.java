package ap2;

import java.util.Arrays;

public class 진료순서정하기 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 진료순서정하기().solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(new 진료순서정하기().solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(new 진료순서정하기().solution(new int[]{30, 10, 23, 6, 100})));
    }

    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = emergency.length - Arrays.binarySearch(sorted, emergency[i]);
        }
        
        return answer;
    }

}
