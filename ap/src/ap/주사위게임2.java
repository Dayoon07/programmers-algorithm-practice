package ap;

public class 주사위게임2 {
    
    public static void main(String[] args) {
        System.out.println(new 주사위게임2().solution(2, 6, 1));
        System.out.println(new 주사위게임2().solution(5, 3, 3));
        System.out.println(new 주사위게임2().solution(4, 4, 4));
    }

    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && b == c && c == a) {
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c));
        } else if (a == b || b == c || c == a) {
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c));
        } else {
            answer = a + b + c;
        }
        return answer;
    }

}
