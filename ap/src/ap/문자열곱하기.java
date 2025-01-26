package ap;

public class 문자열곱하기 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열곱하기().solution("string", 3));
        System.out.println(new 문자열곱하기().solution("love", 10));
    }

    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }

    /*
        public String solution(String my_string, int k) {
            return my_string.repeat(k);
        }
    */

}
