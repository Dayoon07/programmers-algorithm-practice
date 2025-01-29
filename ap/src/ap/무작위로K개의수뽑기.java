package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 무작위로K개의수뽑기 {

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 1, 2, 2, 3};
        int[] arr2 = {0, 1, 1, 1, 1};
        System.out.println(Arrays.toString(new 무작위로K개의수뽑기().solution(arr1, 3)));
        System.out.println(Arrays.toString(new 무작위로K개의수뽑기().solution(arr2, 4)));
    }
    
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                list.add(num);
                if (list.size() == k) break;
            }
        }

        while (list.size() < k) {
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
