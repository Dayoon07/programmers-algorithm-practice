package ap2;

public class 삼각형의완성조건2 {
    
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];

        int c1 = Math.min(a, b);
        int c2 = (a + b) - (Math.max(a, b) + 1);

        return c1 + c2;
    }

    public static void main(String[] args) {
        System.out.println(new 삼각형의완성조건2().solution(new int[]{1, 2}));
        System.out.println(new 삼각형의완성조건2().solution(new int[]{3, 6}));
        System.out.println(new 삼각형의완성조건2().solution(new int[]{11, 7}));
    }

}
