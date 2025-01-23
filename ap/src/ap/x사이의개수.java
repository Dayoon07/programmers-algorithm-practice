package ap;

import java.util.Arrays;

public class x사이의개수 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new x사이의개수().solution("oxooxoxxox")));
    }

    public int[] solution(String myString) {
        String[] p = myString.split("x", -1);
        int[] answer = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            answer[i] = p[i].length();
        }
        return answer;
    }

}
