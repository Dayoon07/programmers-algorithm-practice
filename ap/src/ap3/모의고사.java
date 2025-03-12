package ap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

    public int[] solution(int[] answers) {
        // 각 수포자들의 찍는 패턴 정의
        int[] p1 = {1, 2, 3, 4, 5};                    // 1번 수포자 패턴
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};          // 2번 수포자 패턴
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};    // 3번 수포자 패턴
        
        // 각 수포자들의 정답 개수를 저장할 배열 
        int[] s = new int[3];
        
        // 문제별로 각 수포자의 답과 정답을 비교
        for (int i = 0; i < answers.length; i++) {
            // 패턴의 길이로 나눈 나머지를 인덱스로 사용하여 순환 접근
            if (answers[i] == p1[i % p1.length]) {
                s[0]++;  // 1번 수포자 정답 개수 증가
            }
            
            if (answers[i] == p2[i % p2.length]) {
                s[1]++;  // 2번 수포자 정답 개수 증가
            }
            
            if (answers[i] == p3[i % p3.length]) {
                s[2]++;  // 3번 수포자 정답 개수 증가
            }
        }
        
        // 최고 점수 찾기
        int m = Math.max(s[0], Math.max(s[1], s[2]));
        
        // 최고 점수를 받은 수포자 목록 만들기
        List<Integer> ts = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == m) {
                // 수포자 번호는 인덱스 + 1
                ts.add(i + 1);
            }
        }
        
        // List를 배열로 변환 (이미 정렬된 상태)
        int[] answer = new int[ts.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ts.get(i);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {1, 3, 2, 4, 2};

        System.out.println(Arrays.toString(new 모의고사().solution(list1)));
        System.out.println(Arrays.toString(new 모의고사().solution(list2)));
    }
    
}
