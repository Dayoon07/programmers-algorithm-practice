package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 빈배열에추가삭제하기 {
    
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        System.out.println(Arrays.toString(new 빈배열에추가삭제하기().solution(arr, flag)));
    }

    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
