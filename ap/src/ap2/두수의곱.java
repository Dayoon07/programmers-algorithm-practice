package ap2;

public class 두수의곱 {

    public static void main(String[] args) {
        System.out.println(new 두수의곱().solution(3, 4));
        System.out.println(new 두수의곱().solution(27, 19));
    }

    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

}
