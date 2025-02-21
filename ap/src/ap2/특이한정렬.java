package ap2;

import java.util.Arrays;

public class 특이한정렬 {

    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
            .boxed()
            .sorted((a, b) -> {
                int d1 = Math.abs(a - n);
                int d2 = Math.abs(b - n);
                return d1 == d2 ? b - a : d1 - d2;
            })
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {10000,20,36,47,40,6,10,7000};
        System.out.println(Arrays.toString(new 특이한정렬().solution(arr1, 4)));
        System.out.println(Arrays.toString(new 특이한정렬().solution(arr2, 30)));
    }

}
