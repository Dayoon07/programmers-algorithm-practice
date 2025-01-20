package ap;

public class 문자열을정수로변환하기 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열을정수로변환하기().solution("10"));
    }

    public int solution(String n_str) {
        int answer = Integer.parseInt(n_str);
        return answer;
    }

}
