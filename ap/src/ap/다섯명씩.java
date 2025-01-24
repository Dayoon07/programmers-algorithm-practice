package ap;

import java.util.Arrays;

public class 다섯명씩 {
    
    public static void main(String[] args) {
        String[] arr = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(new 다섯명씩().solution(arr)));
    }

    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 4) / 5];
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[index];
            index += 5;
        }
        return answer;
    }

}
