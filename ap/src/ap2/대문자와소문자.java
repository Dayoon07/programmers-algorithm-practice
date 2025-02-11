package ap2;

public class 대문자와소문자 {
    
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += String.valueOf(c).toLowerCase();
            } else {
                answer += String.valueOf(c).toUpperCase();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 대문자와소문자().solution("cccCCC"));
        System.out.println(new 대문자와소문자().solution("abCdEfghIJ"));
    }

}
