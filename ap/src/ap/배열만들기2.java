package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기2 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 배열만들기2().solution(5, 555)));
        System.out.println(Arrays.toString(new 배열만들기2().solution(10, 20)));

    }

    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        
        for (int num = l; num <= r; num++) {
            if (isValid(num)) {
                result.add(num);
            }
        }
        
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }

    private boolean isValid(int num) {
        String str = String.valueOf(num);
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }

}
