package ap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N의배수고르기 {
    
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int a = 0; a < list.size(); a++) {
            answer[a] = list.get(a);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numList1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] numList2 = {1, 9, 3, 10, 13, 5};
        int[] numList3 = {2, 100, 120, 600, 12, 12};
        System.out.println(Arrays.toString(new N의배수고르기().solution(3, numList1)));
        System.out.println(Arrays.toString(new N의배수고르기().solution(5, numList2)));
        System.out.println(Arrays.toString(new N의배수고르기().solution(12, numList3)));
    }

}
