package ap2;

public class 제곱수판별하기 {
    
    public int solution(int n) {
        int s = (int) Math.sqrt(n);
        return (s * s == n) ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(new 제곱수판별하기().solution(144));
        System.out.println(new 제곱수판별하기().solution(976));
    }

}
