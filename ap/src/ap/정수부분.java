package ap;

public class 정수부분 {

    public static void main(String[] args) {
        System.out.println(new 정수부분().solution(69.32));
    }

    public int solution(double flo) {
        int answer = (int) flo;
        return answer;
    }

}