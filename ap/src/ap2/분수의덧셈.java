package ap;

import java.util.Arrays;

public class 분수의덧셈 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 분수의덧셈().solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(new 분수의덧셈().solution(9, 2, 1, 3)));
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = (denom1 * denom2) / gcd(denom1, denom2);
        
        int numer = numer1 * (lcm / denom1) + numer2 * (lcm / denom2);
        
        int gcd = gcd(numer, lcm);
        
        return new int[]{numer / gcd, lcm / gcd};
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
