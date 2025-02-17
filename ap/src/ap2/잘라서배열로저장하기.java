package ap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 잘라서배열로저장하기 {
    
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i += n) {
            int e = Math.min(i + n, my_str.length());
            list.add(my_str.substring(i, e));
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 잘라서배열로저장하기().solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(new 잘라서배열로저장하기().solution("abcdef123", 3)));
    }

}
