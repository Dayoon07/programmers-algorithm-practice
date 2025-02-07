package ap2;

import java.util.Arrays;

public class 배열회전시키기 {
    
    public static void main(String[] args) {
        int[] numList1 = {1, 2, 3};
        int[] numList2 = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(new 배열회전시키기().solution(numList1, "right")));
        System.out.println(Arrays.toString(new 배열회전시키기().solution(numList2, "left")));
    }

    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
    
        if (direction.equals("right")) {    // 첫번째 값을 앞으로
            answer[0] = numbers[numbers.length - 1];
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
        } else {    // 첫번째 값을 뒤로
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[numbers.length - 1] = numbers[0];
        }
    
        return answer;
    }

}
