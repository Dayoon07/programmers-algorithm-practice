package ap2;

public class 개미군단 {

    public static void main(String[] args) {
        System.out.println(new 개미군단().solution(23));
        System.out.println(new 개미군단().solution(24));
        System.out.println(new 개미군단().solution(999));
    }

    public int solution(int hp) {
        int answer = hp / 5;
        hp %= 5;
        
        answer += hp / 3;
        hp %= 3;
        
        answer += hp / 1;
        
        return answer;
    }

}