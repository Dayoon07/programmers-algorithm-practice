package ap2;

public class 두수의합 {
    
    public static void main(String[] args) {
        System.out.println(new 두수의합().solution(2, 3));
        System.out.println(new 두수의합().solution(100, 2));
    }

    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

}
