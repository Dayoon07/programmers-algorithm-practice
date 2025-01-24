package ap;

import java.util.Arrays;

public class 순서바꾸기 {
    
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6};
        int[] arr2 = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(new 순서바꾸기().solution(arr1, 1)));
        System.out.println(Arrays.toString(new 순서바꾸기().solution(arr2, 3)));
    }

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
    
        for (int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }
    
        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }
    
        return answer;
    }

}
