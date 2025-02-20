package ap2;

import java.util.Map;
import java.util.TreeMap;

public class 겹치는선분의길이 {
    
    public int solution(int[][] lines) {
        Map<Integer, Integer> coords = new TreeMap<>();
        
        // 모든 선분의 시작점과 끝점을 처리
        for (int[] line : lines) {
            int start = line[0];
            int end = line[1];
            
            // 시작점부터 끝점 직전까지의 모든 좌표를 카운트
            for (int i = start; i < end; i++) {
                coords.put(i, coords.getOrDefault(i, 0) + 1);
            }
        }
        
        // 두 개 이상의 선분이 겹치는 좌표의 개수 계산
        int overlappingLength = 0;
        for (int count : coords.values()) {
            if (count >= 2) overlappingLength++;
        }
        
        return overlappingLength;
    }
    
    public static void main(String[] args) {
        System.out.println(new 겹치는선분의길이().solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(new 겹치는선분의길이().solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(new 겹치는선분의길이().solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }

}
