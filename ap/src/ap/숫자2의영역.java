package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 숫자2의영역 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
        int[] arr2 = {1, 2, 1};
        int[] arr3 = {1, 1, 1};
        int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};
        System.out.println(Arrays.toString(new 숫자2의영역().solution(arr1)));
        System.out.println(Arrays.toString(new 숫자2의영역().solution(arr2)));
        System.out.println(Arrays.toString(new 숫자2의영역().solution(arr3)));
        System.out.println(Arrays.toString(new 숫자2의영역().solution(arr4)));
    }

    public int[] solution(int[] arr) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (first == -1) first = i;
                last = i;
            }
        }

        if (first == -1) {
            List<Integer> list = new ArrayList<>();
            list.add(-1);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = first; i <= last; i++) {
            list.add(arr[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}