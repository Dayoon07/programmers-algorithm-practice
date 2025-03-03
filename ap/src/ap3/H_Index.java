package ap3;

import java.util.Arrays;

public class H_Index {

    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return  h;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 6, 1, 5};
        System.out.println(new H_Index().solution(arr));
    }

}