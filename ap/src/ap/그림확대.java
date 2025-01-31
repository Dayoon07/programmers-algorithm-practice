package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class 그림확대 {
    public static void main(String[] args) {
        String[] picture1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k1 = 2;
        System.out.println(Arrays.toString(new 그림확대().solution(picture1, k1)));

        String[] picture2 = {"x.x", ".x.", "x.x"};
        int k2 = 3;
        System.out.println(Arrays.toString(new 그림확대().solution(picture2, k2)));
    }

    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();

        for (String row : picture) {
            // 1. 가로 확대 (각 문자 k번 반복)
            StringBuilder newRow = new StringBuilder();
            for (char c : row.toCharArray()) {
                newRow.append(String.valueOf(c).repeat(k));
            }
            
            // 2. 세로 확대 (각 행을 k번 추가)
            for (int i = 0; i < k; i++) {
                result.add(newRow.toString());
            }
        }
        
        return result.toArray(new String[0]);
    }
}
