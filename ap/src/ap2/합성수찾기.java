package ap2;

public class 합성수찾기 {
    
    public static void main(String[] args) {
        System.out.println(new 합성수찾기().solution(10));
        System.out.println(new 합성수찾기().solution(15));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                c += (i % j == 0) ? 1 : 0;
            }
            answer += (c >= 3) ? 1 : 0;
        }
        return answer;
    }

}
