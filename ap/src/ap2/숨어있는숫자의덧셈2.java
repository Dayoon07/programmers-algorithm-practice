package ap2;

public class 숨어있는숫자의덧셈2 {

    public int solution(String my_string) {
        int answer = 0;
        String t = "";
    
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
    
            if (Character.isDigit(ch)) {
                t += ch;
            } else {
                if (!t.isEmpty()) {
                    answer += Integer.parseInt(t);
                    t = "";
                }
            }
        }
    
        if (!t.isEmpty()) answer += Integer.parseInt(t);
    
        return answer;
    }

        public static void main(String[] args) {
        System.out.println(new 숨어있는숫자의덧셈2().solution("aAb1B2cC34oOp"));
        System.out.println(new 숨어있는숫자의덧셈2().solution("1a2b3c4d123Z"));
    }

}