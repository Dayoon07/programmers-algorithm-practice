package ap2;

public class 종이자르기 {
    
    public int solution(int M, int N) {
        if (M == 1 && N == 1) {
            return 0;
        } else {
            return (M * N) - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new 종이자르기().solution(2, 2));
        System.out.println(new 종이자르기().solution(2, 5));
        System.out.println(new 종이자르기().solution(1, 1));
    }

}
