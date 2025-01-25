package ap;

import java.util.Arrays;

public class 배열만들기1 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 배열만들기1().solution(10, 3)));
        System.out.println(Arrays.toString(new 배열만들기1().solution(15, 5)));
    }

    public int[] solution(int n, int k) {
        int[] answer = new int[(n / k)];
        int idx = 0;
        for (int i = k; i <= n; i += k) {
            answer[idx++] = i;
        }
        return answer;
    }

}
