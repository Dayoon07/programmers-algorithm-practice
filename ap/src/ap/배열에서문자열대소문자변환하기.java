package ap;

import java.util.Arrays;

public class 배열에서문자열대소문자변환하기 {

    public static void main(String[] args) {
        String[] arr1 = {"AAA","BBB","CCC","DDD"};
        String[] arr2 = {"aBc","AbC"};
        System.out.println(Arrays.toString(new 배열에서문자열대소문자변환하기().solution(arr2)));
    }

    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.clone().length];
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 1) {
                answer[i] = strArr[i].toUpperCase();
            }
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            }
        }
        return answer;
    }

}