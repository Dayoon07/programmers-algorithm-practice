package ap2;

public class 피자나눠먹기1 {

    public static void main(String[] args) {
        System.out.println(new 피자나눠먹기1().solution(7));
        System.out.println(new 피자나눠먹기1().solution(1));
        System.out.println(new 피자나눠먹기1().solution(15));
    }

    public int solution(int n) {
        int answer = 0;
        
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }
        
        return answer;
    }

}