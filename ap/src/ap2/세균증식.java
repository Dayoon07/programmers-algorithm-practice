package ap2;

public class 세균증식 {
    
    public int solution(int n, int t) {
        return n * (int) Math.pow(2, t);
    }

    public static void main(String[] args) {
        System.out.println(new 세균증식().solution(2, 10));   
        System.out.println(new 세균증식().solution(7, 15));   
    }

}
