package ap;

import java.util.Arrays;

public class 뒤에서5등까지 {
    
    public static void main(String[] args) {
        int[] examArr = {12, 4, 15, 46, 38, 1, 14};
        System.out.println(Arrays.toString(new 뒤에서5등까지().solution(examArr)));
    }

    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = Arrays.copyOfRange(num_list, 0, 5);
        return answer;
    }

    /*
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = Arrays.copyOf(num_list, num_list.length - 2);
        return answer;
    }
    */

}
