package ap2;

public class 편지 {

    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 편지().solution("happy birthday!"));
        System.out.println(new 편지().solution("I love you~"));
    }

}