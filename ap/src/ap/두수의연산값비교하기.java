package ap;

public class 두수의연산값비교하기 {
    
    public static void main(String[] args) {
        System.out.println(new 두수의연산값비교하기().solution(2, 91));
        System.out.println(new 두수의연산값비교하기().solution(91, 2));
    }

    public int solution(int a, int b) {
        int answer = 2 * a * b;
        String str = a + "" + b;
        if (answer > Integer.parseInt(str)) {
            return answer;
        } else {
            return Integer.parseInt(str);
        }
    }

}
