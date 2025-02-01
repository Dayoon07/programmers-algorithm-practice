package ap2;

public class 두수의나눗셈 {
    
    public static void main(String[] args) {
        System.out.println(new 두수의나눗셈().solution(3, 2));
        System.out.println(new 두수의나눗셈().solution(7, 3));
        System.out.println(new 두수의나눗셈().solution(1, 16));
    }

    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int)answer;
    }

}
