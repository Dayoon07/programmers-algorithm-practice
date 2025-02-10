package ap2;

import java.util.HashSet;
import java.util.Set;

public class 중복된문자제거 {
    
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>(); // 이미 나온 문자 저장

        for (char ch : my_string.toCharArray()) {
            if (!seen.contains(ch)) { // 처음 등장한 문자
                seen.add(ch);         // 기록
                result.append(ch);    // 결과에 추가
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new 중복된문자제거().solution("people"));
        System.out.println(new 중복된문자제거().solution("We are the world"));
    }

}
