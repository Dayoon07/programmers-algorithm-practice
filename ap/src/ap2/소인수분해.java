package ap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 소인수분해 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 소인수분해().solution(12)));
        System.out.println(Arrays.toString(new 소인수분해().solution(17)));
        System.out.println(Arrays.toString(new 소인수분해().solution(420)));
    }

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        
        if (n > 1) list.add(n);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
