package ap;

import java.util.Arrays;

public class 세개의구분자 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 세개의구분자().solution("baconlettucetomato")));
        System.out.println(Arrays.toString(new 세개의구분자().solution("abcd")));
        System.out.println(Arrays.toString(new 세개의구분자().solution("cabab")));
    }

    public static String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("[abc]"))
            .filter(s -> !s.isEmpty())
            .toArray(String[]::new);
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }

}
