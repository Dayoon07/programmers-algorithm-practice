package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N개간격의원소들 {
    
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 6, 1, 7, 6};
        int[] arr2 = {4, 2, 6, 1, 7, 6};
        System.out.println(Arrays.toString(new N개간격의원소들().solution(arr1, 2)));
        System.out.println(Arrays.toString(new N개간격의원소들().solution(arr2, 4)));
    }

    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
                list.add(num_list[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int a = 0; a < list.size(); a++) {
            answer[a] = list.get(a);
        }
        return answer;
    }

}
