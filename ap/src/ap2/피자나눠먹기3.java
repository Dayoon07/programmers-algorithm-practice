package ap2;

public class 피자나눠먹기3 {
    
    public static void main(String[] args) {
        System.out.println(new 피자나눠먹기3().solution(7, 10));
        System.out.println(new 피자나눠먹기3().solution(4, 12));
    }

    public int solution(int slice, int n) {
        return (int) Math.ceil((double) n / slice);
    }

}
