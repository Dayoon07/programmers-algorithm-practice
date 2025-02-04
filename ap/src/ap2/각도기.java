package ap2;

public class 각도기 {
    
    public static void main(String[] args) {
        System.out.println(new 각도기().solution(70));
        System.out.println(new 각도기().solution(91));
        System.out.println(new 각도기().solution(180));
    }

    public int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }

}
