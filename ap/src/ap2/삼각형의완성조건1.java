package ap2;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(new 삼각형의완성조건1().solution(new int[]{1, 2, 3}));
        System.out.println(new 삼각형의완성조건1().solution(new int[]{3, 6, 2}));
        System.out.println(new 삼각형의완성조건1().solution(new int[]{199, 72, 222}));
    }

}
