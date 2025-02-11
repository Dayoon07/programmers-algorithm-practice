package ap2;

import java.util.Arrays;

public class 가까운수 {
    
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int c = array[0];
        int min = Math.abs(n - c);
        
        for (int i = 1; i < array.length; i++) {
            int d = Math.abs(n - array[i]);
            if (d < min) {
                min = d;
                c = array[i];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new 가까운수().solution(new int[]{3, 10, 28}, 20));
        System.out.println(new 가까운수().solution(new int[]{10, 11, 12}, 13));
    }

}
