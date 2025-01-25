package ap;

import java.util.Arrays;

public class 접미사배열 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 접미사배열().solution("banana")));
        System.out.println(Arrays.toString(new 접미사배열().solution("programmers")));
    }

    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }

}
