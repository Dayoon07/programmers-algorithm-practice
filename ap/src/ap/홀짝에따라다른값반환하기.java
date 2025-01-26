package ap;

public class 홀짝에따라다른값반환하기 {
    
    public static void main(String[] args) {
        System.out.println(new 홀짝에따라다른값반환하기().solution(7));
        System.out.println(new 홀짝에따라다른값반환하기().solution(10));
    }

    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 1) answer += i;
            }
        }
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) answer += i * i;
            }
        }
        return answer;
    }

}
