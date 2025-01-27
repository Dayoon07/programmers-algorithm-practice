package ap;

import java.util.Arrays;

public class 문자열잘라서정렬하기 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 문자열잘라서정렬하기().solution("axbxcxdx")));
        System.out.println(Arrays.toString(new 문자열잘라서정렬하기().solution("dxccxbbbxaaaa")));
    }

    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
            .filter(s -> !s.isEmpty())
            .sorted()
            .toArray(String[]::new);
    }

}
