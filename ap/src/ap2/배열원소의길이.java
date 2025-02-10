package ap2;

import java.util.Arrays;

public class 배열원소의길이 {
    
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"We", "are", "the", "world!"};
        String[] arr2 = {"I", "Love", "Programmers."};
        System.out.println(Arrays.toString(new 배열원소의길이().solution(arr1)));
        System.out.println(Arrays.toString(new 배열원소의길이().solution(arr2)));
    }

}
