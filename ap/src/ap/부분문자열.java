package ap;

public class 부분문자열 {
    
    public static void main(String[] args) {
        System.out.println(new 부분문자열().solution("abc", "aabcc"));
    }

    public int solution(String str1, String str2) {
        int answer = 0;

        if (str2.contains(str1)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

}