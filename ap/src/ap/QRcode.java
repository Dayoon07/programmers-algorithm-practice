package ap;

public class QRcode {
    
    public static void main(String[] args) {
        System.out.println(new QRcode().solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(new QRcode().solution(1, 0, "programmers"));
    }

    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer += code.charAt(i);
            }
        }
        return answer;
    }

}
