package ap;

import java.util.Arrays;

public class 문자개수세기 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 문자개수세기().solution("Programmers")));
    }

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {         // 대문자일 경우
                answer[c - 'A']++;              // 대문자 A는 0번째 인덱스, B는 1번째 인덱스
            } else if (c >= 'a' && c <= 'z') {  // 소문자일 경우
                answer[c - 'a' + 26]++;         // 소문자 a는 26번째 인덱스, b는 27번째 인덱스
            }
        }

        return answer;
    }

}
