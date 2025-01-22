package ap;

public class Flag에따라다른값반환하기 {
    
    public static void main(String[] args) {
        System.out.println(new Flag에따라다른값반환하기().solution(-4, 7, false));
    }

    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
    }

}
