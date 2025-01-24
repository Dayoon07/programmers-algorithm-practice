package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N번째원소부터 {
    
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6};
        int[] arr2 = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(new N번째원소부터().solution(arr1, 3)));
        System.out.println(Arrays.toString(new N번째원소부터().solution(arr2, 2)));
    }

    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = n - 1; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for (int a = 0; a < list.size(); a++) {
            answer[a] = list.get(a);
        }
        return answer;
    }

}
