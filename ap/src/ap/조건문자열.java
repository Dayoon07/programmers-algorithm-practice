package ap;

public class 조건문자열 {

    public static void main(String[] args) {
        System.out.println(new 조건문자열().solution("<", "=", 2, 50));
        System.out.println(new 조건문자열().solution(">", "!", 41, 78));
    }

    public int solution(String ineq, String eq, int n, int m) {
        if (String.valueOf(ineq.charAt(0)).equals("<")) {
            return n <= m ? 1 : 0;
        } else {
            return n >= m ? 1 : 0;
        }
    }

}