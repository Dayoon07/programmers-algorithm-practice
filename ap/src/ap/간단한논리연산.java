package ap;

public class 간단한논리연산 {

    public static void main(String[] args) {
        System.out.println(new 간단한논리연산().solution(false, true, true, true));
        System.out.println(new 간단한논리연산().solution(true, false, false, false));
    }
    
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

}
