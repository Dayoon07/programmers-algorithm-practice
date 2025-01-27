package ap;

import java.util.Arrays;

public class 공백으로구분하기1 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 공백으로구분하기1().solution("i love you")));
        System.out.println(Arrays.toString(new 공백으로구분하기1().solution("programmers")));
    }

    public String[] solution(String my_string) {
        return my_string.split(" ");
    }

}
