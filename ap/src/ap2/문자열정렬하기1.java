package ap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열정렬하기1 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 문자열정렬하기1().solution("hi12392")));
        System.out.println(Arrays.toString(new 문자열정렬하기1().solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(new 문자열정렬하기1().solution("abcde0")));
    }

    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                list.add(Character.getNumericValue(ch));
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
