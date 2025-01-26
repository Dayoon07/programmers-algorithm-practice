package ap;

public class 주사위게임1 {
    
    public static void main(String[] args) {
        System.out.println(new 주사위게임1().solution(3, 5));
        System.out.println(new 주사위게임1().solution(6, 1));
        System.out.println(new 주사위게임1().solution(2, 4));
    }

    public int solution(int a, int b) {
        if ((a % 2 == 1) && (b % 2 == 1)) {
            return (a * a) + (b * b);
        } else if ((a % 2 == 1) || (b % 2 == 1)) {
            return 2 * (a + b);
        } else {
            return Math.abs(a - b);
        }
    }

}
