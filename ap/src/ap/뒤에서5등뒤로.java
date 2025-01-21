package ap;

import java.util.Arrays;

public class 뒤에서5등뒤로 {

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        System.out.println(Arrays.toString(new 뒤에서5등뒤로().solution(num_list)));
    }

    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        return answer;
    }
}
