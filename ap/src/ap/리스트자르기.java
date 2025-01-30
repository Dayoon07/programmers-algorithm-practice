package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 리스트자르기 {
    
    public static void main(String[] args) {
        int[] numList1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numList2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] slicer1 = {1, 5, 2};
        int[] slicer2 = {1, 5, 2};
        System.out.println(Arrays.toString(new 리스트자르기().solution(3, slicer1, numList1)));
        System.out.println(Arrays.toString(new 리스트자르기().solution(4, slicer2, numList2)));
    }

    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if (n == 1) {
            for (int i = 0; i <= b; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = a; i <= b; i += c) {
                list.add(num_list[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
