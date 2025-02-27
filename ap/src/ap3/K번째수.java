package ap3;

import java.util.Arrays;

public class K번째수 {
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0] - 1;
            int b = commands[i][1] - 1;
            int c = commands[i][2] - 1;
        
            int[] s = new int[b - a + 1];
            for (int j = 0; j < s.length; j++) {
                s[j] = array[a + j];
            }

            Arrays.sort(s);

            answer[i] = s[c];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] c = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };
        System.out.println(Arrays.toString(new K번째수().solution(arr, c)));
    }

}
