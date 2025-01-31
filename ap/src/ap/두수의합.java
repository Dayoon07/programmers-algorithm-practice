package ap;

import java.math.BigInteger;

public class 두수의합 {
    
    public static void main(String[] args) {
        System.out.println(new 두수의합().solution("582", "734"));
        System.out.println(new 두수의합().solution("18446744073709551615", "287346502836570928366"));
        System.out.println(new 두수의합().solution("0", "0"));
    }

    public String solution(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        BigInteger sum = bigA.add(bigB);

        return sum.toString();
    }

}
