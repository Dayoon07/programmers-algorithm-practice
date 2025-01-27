package ap;

import java.util.HashSet;
import java.util.Set;

public class 글자지우기 {
    
    public static void main(String[] args) {
        int[] in = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(new 글자지우기().solution("apporoograpemmemprs", in));
    }
    
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        
        Set<Integer> removeIndices = new HashSet<>();
        for (int i : indices) {
            removeIndices.add(i);
        }

        for (int i = 0; i < my_string.length(); i++) {
            if (!removeIndices.contains(i)) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }

}
