package ap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열자르기 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 배열자르기().solution(new int[]{1, 2, 3, 4, 5}, 1,3)));
        System.out.println(Arrays.toString(new 배열자르기().solution(new int[]{1, 3, 5}, 1,2)));
    }

    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> list = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}