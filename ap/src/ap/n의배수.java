package ap;

public class n의배수 {
    
    public static void main(String[] args) {
        System.out.println(new n의배수().solution(34, 3));
    }

    public int solution(int num, int n) {
        int answer = num;
        if (answer % n == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
