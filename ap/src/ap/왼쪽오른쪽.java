package ap;

import java.util.Arrays;

public class 왼쪽오른쪽 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 왼쪽오른쪽().solution(new String[]{"u", "u", "l", "r"})));
        System.out.println(Arrays.toString(new 왼쪽오른쪽().solution(new String[]{"l"})));
    }

    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return new String[]{};
    }

}
