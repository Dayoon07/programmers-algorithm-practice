package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기6 {
    
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 1, 1, 0};
        int[] arr2 = {0, 1, 0, 1, 0};
        int[] arr3 = {0, 1, 1, 0};
        System.out.println(Arrays.toString(new 배열만들기6().solution(arr1)));   
        System.out.println(Arrays.toString(new 배열만들기6().solution(arr2)));   
        System.out.println(Arrays.toString(new 배열만들기6().solution(arr3)));   
    }

    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!stk.isEmpty() && stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
            } else {
                stk.add(arr[i]);
            }
        }

        if (stk.isEmpty()) return new int[]{-1};
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

}
