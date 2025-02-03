package ap2;

public class 문자열뒤집기 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열뒤집기().solution("jaron"));
        System.out.println(new 문자열뒤집기().solution("bread"));
    }

    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

}
