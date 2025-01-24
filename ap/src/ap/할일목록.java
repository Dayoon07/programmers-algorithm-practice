package ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 할일목록 {
    
    public static void main(String[] args) {
        String[] list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] fin = {true, false, true, false};
        System.out.println(Arrays.toString(new 할일목록().solution(list, fin)));
    }

    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                list.add(todo_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        for (int a = 0; a < answer.length; a++) {
            answer[a] = list.get(a);
        }
        return answer;
    }

}
