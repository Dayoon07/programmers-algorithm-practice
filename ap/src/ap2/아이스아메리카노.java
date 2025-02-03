package ap2;

import java.util.Arrays;

public class 아이스아메리카노 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 아이스아메리카노().solution(5500)));
        System.out.println(Arrays.toString(new 아이스아메리카노().solution(15000)));
    }

    public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        
        return answer;
    }

}
