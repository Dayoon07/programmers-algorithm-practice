package ap2;

public class 피자나눠먹기2 {
    
    public static void main(String[] args) {
        System.out.println(new 피자나눠먹기2().solution(6));
        System.out.println(new 피자나눠먹기2().solution(10));
        System.out.println(new 피자나눠먹기2().solution(4));
    }

    public int solution(int n) {
        return ((n * 6) / gcd(n, 6)) / 6;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
