package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 콜라츠수열만들기 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 콜라츠수열만들기().solution(10)));
    }

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }
        int[] answer = new int[list.size()];
        for (int b = 0; b < list.size(); b++) {
            answer[b] = list.get(b);
        }
        return answer;
    }

    /*
        public int[] solution(int n) {
            List<Integer> list = new ArrayList<>();
            list.add(n);
            
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                list.add(n);
            }
            
            return list.stream().mapToInt(i -> i).toArray();
        }
    */

}
