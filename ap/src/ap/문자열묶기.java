package ap;

import java.util.HashMap;
import java.util.Map;

public class 문자열묶기 {
    
    public static void main(String[] args) {
        String[] arr = {"a", "bc", "d", "efg", "hi"};
        System.out.println(new 문자열묶기().solution(arr));
    }

    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();

        for (String str : strArr) {
            int len = str.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
        }

        int maxGroupSize = 0;
        for (int count : lengthCount.values()) {
            maxGroupSize = Math.max(maxGroupSize, count);
        }

        return maxGroupSize;
    }

}
