package ap;

public class 문자열섞기 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열섞기().solution("aaaaa", "bbbbb"));
    }

    public String solution(String str1, String str2) {
        String answer = "";
        int len = (str1.length() + str2.length()) / 2;
        for (int i = 0; i < len; i++) {
            answer += String.valueOf(str1.charAt(i));
            answer += String.valueOf(str2.charAt(i));
        }
        return answer;
    }
    
}
