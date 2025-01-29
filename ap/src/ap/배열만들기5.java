package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기5 {
    
    public static void main(String[] args) {
        String[] arr = {"0123456789","9876543210","9999999999999"};
        System.out.println(Arrays.toString(new 배열만들기5().solution(arr, 50000, 5, 5)));
    }

    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
