package ap2;

import java.math.BigInteger;

public class 구슬을나누는경우의수 {
    
    public long solution(int balls, int share) {
        return combination(balls, share);
    }

    // 조합 계산 메서드
    private long combination(int n, int r) {
        if (r == 0 || n == r) return 1; // 0개를 고르거나 모두 고를 경우 1가지

        BigInteger numerator = factorial(n);            // n!
        BigInteger denominator = factorial(r).multiply(factorial(n - r)); // r! * (n - r)!

        return numerator.divide(denominator).longValue();
    }

    // 팩토리얼 메서드
    private BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new 구슬을나누는경우의수().solution(3, 2));
        System.out.println(new 구슬을나누는경우의수().solution(5, 3));
    }

}
