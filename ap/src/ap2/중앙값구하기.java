package ap2;

import java.util.Arrays;

public class 중앙값구하기 {
    
    public static void main(String[] args) {
        System.out.println(new 중앙값구하기().solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(new 중앙값구하기().solution(new int[]{9, -1, 0}));
    }

    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        answer = array[array.length / 2];
        
        return answer;
    }

}
