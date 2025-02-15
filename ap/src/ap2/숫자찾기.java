package ap2;

public class 숫자찾기 {
    
    public int solution(int num, int k) {
        String n = String.valueOf(num);
        String kn = String.valueOf(k);

        int idx = n.indexOf(kn);

        return (idx == -1) ? -1 : idx + 1;
    }

    public static void main(String[] args) {
        System.out.println(new 숫자찾기().solution(29183, 1));
        System.out.println(new 숫자찾기().solution(232443, 4));
        System.out.println(new 숫자찾기().solution(123456, 7));
    }

}
