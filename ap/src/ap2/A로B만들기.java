package ap2;

import java.util.Arrays;

public class A로B만들기 {
    
    public int solution(String before, String after) {
        char[] a1 = before.toCharArray();
        char[] a2 = after.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new A로B만들기().solution("olleh", "hello"));
        System.out.println(new A로B만들기().solution("allpe", "apple"));
    }

}
