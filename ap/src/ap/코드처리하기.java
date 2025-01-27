package ap;

public class 코드처리하기 {
    
    public static void main(String[] args) {
        System.out.println(new 코드처리하기().solution("abc1abc1abc"));
    }

    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = 1 - mode;
            } else {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                    answer += code.charAt(i);
                }
            }
        }
        return answer;
    }

    /*
         public String solution(String code) {
            StringBuilder answer = new StringBuilder();
            int mode = 0;

            for (int i = 0; i < code.length(); i++) {
                char c = code.charAt(i);

                if (c == '1') {  // '1'이면 모드 변경
                    mode = 1 - mode; // 0 → 1, 1 → 0
                } else {
                    if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                        answer.append(c); // 조건 만족하면 문자 추가
                    }
                }
            }

            return answer.length() == 0 ? "EMPTY" : answer.toString();
        }
    */

}
