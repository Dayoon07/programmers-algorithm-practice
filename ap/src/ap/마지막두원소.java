package ap;

import java.util.Arrays;

public class 마지막두원소 {
    
    public static void main(String[] args) {
        int[] numList1 = {2, 1, 6};
        int[] numList2 = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(new 마지막두원소().solution(numList1)));
        System.out.println(Arrays.toString(new 마지막두원소().solution(numList2)));
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        }
        if (num_list[num_list.length - 1] <= num_list[num_list.length - 2]) {
            answer[answer.length - 1] = num_list[num_list.length - 1] * 2;
        }

        return answer;
    }

}
