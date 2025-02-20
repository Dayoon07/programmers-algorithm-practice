package ap2;

public class 유한소수판별하기 {
    
    public int solution(int a, int b) {
        int answer = f(a, b);
        b /= answer;
        
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        
        return (b == 1) ? 1 : 2;
    }
    
    private int f(int a, int b) {
        return b == 0 ? a : f(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(new 유한소수판별하기().solution(7, 20));
        System.out.println(new 유한소수판별하기().solution(11, 22));
        System.out.println(new 유한소수판별하기().solution(12, 21));
    }

}
