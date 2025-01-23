package ap;

import java.util.Arrays;

public class 공백으로구분하기2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 공백으로구분하기2().solution("i  love you")));
    }

    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }

}
