package ap2;

public class 자릿수더하기 {

    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            answer += Integer.parseInt(String.valueOf(n).substring(i, i + 1));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 자릿수더하기().solution(1234));
        System.out.println(new 자릿수더하기().solution(930211));
    }

}