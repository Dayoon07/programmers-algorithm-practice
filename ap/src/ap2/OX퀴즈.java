package ap2;

import java.util.Arrays;

public class OX퀴즈 {
    
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < answer.length; i++) {
            String[] p = quiz[i].split(" ");
            int x = Integer.parseInt(p[0]);
            String op = p[1];
            int y = Integer.parseInt(p[2]);
            int z = Integer.parseInt(p[4]);

            int calc = op.equals("+") ? x + y : x - y;
            answer[i] = (calc == z) ? "O" : "X";
        }
        
        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] arr2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(new OX퀴즈().solution(arr1)));
        System.out.println(Arrays.toString(new OX퀴즈().solution(arr2)));
    }

}
