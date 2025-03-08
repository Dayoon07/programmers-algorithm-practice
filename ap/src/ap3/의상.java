package ap3;

import java.util.HashMap;
import java.util.Map;

public class 의상 {

    public int solution(String[][] clothes) {
        // 의상 종류별로 개수를 저장할 Map 생성
        Map<String, Integer> map = new HashMap<>();
        
        // 의상 종류별 개수 계산
        for (String[] asdf : clothes) {
            String t = asdf[1]; // 의상의 종류
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        // 조합의 수 계산
        int answer = 1;
        for (int c : map.values()) {
            // 해당 종류의 의상을 입지 않는 경우도 포함하여 + 1
            answer *= (c + 1);
        }
        
        // 아무것도 입지 않는 경우를 제외
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] arr1 = {
            {"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };
        String[][] arr2 = {
            {"crow_mask", "face"},
            {"blue_sunglasses", "face"},
            {"smoky_makeup", "face"}
        };
        System.out.println(new 의상().solution(arr1));
        System.out.println(new 의상().solution(arr2));
    }

}