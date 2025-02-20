package ap2;

public class 저주의숫자3 {

    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while (count < n) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                continue;
            }
            count++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 저주의숫자3().solution(15));
        System.out.println(new 저주의숫자3().solution(40));
    }

}