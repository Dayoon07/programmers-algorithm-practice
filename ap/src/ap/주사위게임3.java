package ap;

import java.util.HashMap;
import java.util.Map;

public class 주사위게임3 {
    
    public static void main(String[] args) {
        System.out.println(new 주사위게임3().solution(2, 2, 2, 2));
        System.out.println(new 주사위게임3().solution(4, 1, 4, 4));
        System.out.println(new 주사위게임3().solution(6, 3, 3, 6));
        System.out.println(new 주사위게임3().solution(2, 5, 2, 6));
        System.out.println(new 주사위게임3().solution(6, 4, 2, 5));
    }

    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(a, countMap.getOrDefault(a, 0) + 1);
        countMap.put(b, countMap.getOrDefault(b, 0) + 1);
        countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        countMap.put(d, countMap.getOrDefault(d, 0) + 1);

        if (countMap.size() == 1) {
            int p = countMap.keySet().iterator().next();
            return 1111 * p;
        } else if (countMap.size() == 2) {
            if (countMap.containsValue(3)) {
                int p = countMap.keySet().stream().filter(key -> countMap.get(key) == 3).findFirst().get();
                int q = countMap.keySet().stream().filter(key -> countMap.get(key) == 1).findFirst().get();
                return (10 * p + q) * (10 * p + q);
            }
            if (countMap.containsValue(2)) {
                int p = countMap.keySet().stream().filter(key -> countMap.get(key) == 2).findFirst().get();
                int q = countMap.keySet().stream().filter(key -> countMap.get(key) == 2).skip(1).findFirst().get();
                return (p + q) * Math.abs(p - q);
            }
        } else if (countMap.size() == 3) {
            int p = countMap.keySet().stream().filter(key -> countMap.get(key) == 2).findFirst().get();
            int q = countMap.keySet().stream().filter(key -> countMap.get(key) == 1).findFirst().get();
            int r = countMap.keySet().stream().filter(key -> countMap.get(key) == 1).skip(1).findFirst().get();
            return q * r;
        }

        return countMap.keySet().stream().min(Integer::compare).get();
    }

}
