package ap2;

import java.util.Arrays;

public class 등수메기기 {
    
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] averages = new double[score.length];
        
        for (int i = 0; i < score.length; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for (int i = 0; i < score.length; i++) {
            int r = 1;
            for (int j = 0; j < score.length; j++) {
                if (averages[j] > averages[i]) r++;
            }
            answer[i] = r;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {80, 70},
            {90, 50},
            {40, 70},
            {50, 80}
        };
        int[][] arr2 = {
            {80, 70},
            {70, 80},
            {30, 50},
            {90, 100},
            {100, 90},
            {100, 100},
            {10, 30}
        };
        System.out.println(Arrays.toString(new 등수메기기().solution(arr1)));
        System.out.println(Arrays.toString(new 등수메기기().solution(arr2)));
    }

}
