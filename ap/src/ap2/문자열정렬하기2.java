package ap2;

import java.util.Arrays;

public class 문자열정렬하기2 {
    
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(new 문자열정렬하기2().solution("Bcad"));
        System.out.println(new 문자열정렬하기2().solution("heLLo"));
        System.out.println(new 문자열정렬하기2().solution("Python"));
    }

}
