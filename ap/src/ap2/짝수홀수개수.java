package ap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 짝수홀수개수 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 짝수홀수개수().solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(new 짝수홀수개수().solution(new int[]{1, 3, 5, 7})));
    }

    public int[] solution(int[] num_list) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                list1.add(num_list[i]);
            } else {
                list2.add(num_list[i]);
            }
        }

        int[] answer = new int[2];
        answer[0] = list1.size();
        answer[1] = list2.size();
        return answer;
    }

}
