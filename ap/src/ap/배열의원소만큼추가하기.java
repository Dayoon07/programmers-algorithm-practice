package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열의원소만큼추가하기 {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4};
        System.out.println(Arrays.toString(new 배열의원소만큼추가하기().solution(arr)));
    }

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            for (int i = 0; i < n; i++) {
                list.add(n);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}