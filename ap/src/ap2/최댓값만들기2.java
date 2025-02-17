package ap2;

import java.util.Arrays;

public class 최댓값만들기2 {
    
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }

    public static void main(String[] args) {
        System.out.println(new 최댓값만들기2().solution(new int[]{1, 2, -3, 4, -5}));
        System.out.println(new 최댓값만들기2().solution(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println(new 최댓값만들기2().solution(new int[]{10, 20, 30, 5, 5, 20, 5}));
    }

}
