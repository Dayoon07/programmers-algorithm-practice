package ap2;

public class 몫구하기 {

    public static void main(String[] args) {
        System.out.println(new 몫구하기().solution(10, 5));
        System.out.println(new 몫구하기().solution(7, 2));
    }

    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
    
}
