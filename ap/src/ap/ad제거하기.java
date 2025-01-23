package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ad제거하기 {
    
    public static void main(String[] args) {
        String[] arr = {"and","notad","abcd"};
        System.out.println(Arrays.toString(new ad제거하기().solution(arr)));
    }

    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String n : strArr) {
            if (!n.contains("ad")) list.add(n);
        }
        String[] answer = list.toArray(String[]::new);
        return answer;
    }

    /*
        public String[] solution(String[] strArr) {
            List<String> list = new ArrayList<>();
            for (String n : strArr) {
                list.add(n);
            }
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].contains("ad")) {
                    list.remove(i);
                }
            }
            String[] answer = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    */

}
