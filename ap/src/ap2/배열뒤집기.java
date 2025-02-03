package ap2;

import java.util.Arrays;

public class 배열뒤집기 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 배열뒤집기().solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(new 배열뒤집기().solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(new 배열뒤집기().solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }

}
