package ap2;

public class 다음에올숫자 {

    public int solution(int[] common) {
        int a = common[1] - common[0];
        int b = common[2] - common[1];
        
        if (a == b) {
            return common[common.length - 1] + a;
        } else {
            int c = common[1] / common[0];
            return common[common.length - 1] * c;
        }
    }

    public static void main(String[] args) {
        System.out.println(new 다음에올숫자().solution(new int[]{1, 2, 3, 4}));
        System.out.println(new 다음에올숫자().solution(new int[]{2, 4, 8}));
    }

}
