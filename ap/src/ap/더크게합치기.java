package ap;

public class 더크게합치기 {
    
    public static void main(String[] args) {
        System.out.println(new 더크게합치기().solution(89, 8));
    }

    public int solution(int a, int b) {
        String answer1 = String.valueOf(a) + String.valueOf(b);
        String answer2 = String.valueOf(b) + String.valueOf(a);
        int realValue1 = Integer.parseInt(answer1);
        int realValue2 = Integer.parseInt(answer2);
        if (Integer.parseInt(answer1) > Integer.parseInt(answer2)) {
            return realValue1;
        } else {
            return realValue2;
        }
    }

}
