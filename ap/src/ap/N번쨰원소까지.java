package ap;

import java.util.Arrays;

public class N번쨰원소까지 {
    
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6};
        int[] arr2 = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(new N번쨰원소까지().mySolution(arr1, 1)));
        System.out.println(Arrays.toString(new N번쨰원소까지().mySolution(arr2, 3)));
    }

    public int[] mySolution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0 ; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    /*
        public int[] solution(int[] num_list, int n) {
            int[] answer = {};

            answer = Arrays.copyOfRange(num_list,0,n);

            return answer;
        }
    */

}
