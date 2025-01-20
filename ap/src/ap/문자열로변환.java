package ap;

public class 문자열로변환 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열로변환().solution(123));
    }

    public String solution(int n) {
        String answer = "";
        answer += String.valueOf(n);
        return answer;
    }

}
