package ap;

public class 문자열정수의합 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열정수의합().solution("123456789"));
    }

    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }
        return answer;
    }

}
