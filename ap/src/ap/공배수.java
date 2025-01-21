package ap;

public class 공배수 {
    
    public static void main(String[] args) {
        System.out.println(new 공배수().solution(55, 10, 5));
    }

    public int solution(int number, int n, int m) {
        int answer = number;
        if (answer % n == 0 && answer % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
