package ap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 전국대회선발고사 {
    
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 2, 5, 4, 6, 1};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {6, 1, 5, 2, 3, 4};
        boolean[] at1 = {false, true, true, true, true, false, false};
        boolean[] at2 = {true, true, true};
        boolean[] at3 = {true, false, true, false, false, true};
        System.out.println(new 전국대회선발고사().solution(arr1, at1));
        System.out.println(new 전국대회선발고사().solution(arr2, at2));
        System.out.println(new 전국대회선발고사().solution(arr3, at3));
    }

    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) list.add(new int[]{rank[i], i});
        }
        
        list.sort(Comparator.comparingInt(a -> a[0]));
        return 10000 * list.get(0)[1] + 100 * list.get(1)[1] + list.get(2)[1];
    }

}
