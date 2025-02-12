package ap2;

import java.util.Arrays;

public class 한번만등장한문자 {

    public String solution(String s) {
        // 1. 빈도 계산을 위한 배열
        int[] freq = new int[26];  // a부터 z까지의 빈도수
        
        // 2. 문자열을 순회하며 빈도수 계산
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;  // 문자 'a'는 0번 인덱스, 'b'는 1번 인덱스
        }
        
        // 3. 한 번만 등장한 문자를 저장할 배열
        char[] result = new char[26];
        int idx = 0;  // result 배열에 저장된 문자의 수를 추적
        
        // 4. 빈도수가 1인 문자들만 result 배열에 추가
        for (char c = 'a'; c <= 'z'; c++) {
            if (freq[c - 'a'] == 1) {
                result[idx++] = c;  // 빈도수가 1인 문자를 추가
            }
        }
        
        // 5. 한 번만 등장한 문자들을 사전 순으로 정렬
        Arrays.sort(result, 0, idx);  // idx까지가 유효한 문자들
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < idx; i++) {
            sb.append(result[i]);
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(new 한번만등장한문자().solution("abcabcadc"));
        System.out.println(new 한번만등장한문자().solution("abdc"));
        System.out.println(new 한번만등장한문자().solution("hello"));
    }

}
