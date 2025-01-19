package ap;

import java.util.ArrayList;
import java.util.List;

public class 배열의원소삭제하기 {

    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] del_list = {94, 777, 104, 1000, 1, 12};
        int[] result = solution(arr, del_list);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = new ArrayList<>();

        for (int num : arr) {
            arrList.add(num);
        }

        for (int num : delete_list) {
            arrList.remove((Integer) num);
        }

        int[] result = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            result[i] = arrList.get(i);
        }

        return result;
    }

}
