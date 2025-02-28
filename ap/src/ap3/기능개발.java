package ap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {
    
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int a = 100 - progresses[i];
            int b = (int) Math.ceil((double) a / speeds[i]);
            queue.add(b);
        }

        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            int v = queue.poll();
            int c = 1;

            while (!queue.isEmpty() && queue.peek() <= v) {
                queue.poll();
                c++;
            }
            list.add(c);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] p1 = {93, 30, 55};
        int[] p2 = {95, 90, 99, 99, 80, 99};

        int[] s1 = {1, 30, 5};
        int[] s2 = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(new 기능개발().solution(p1, s1)));   
        System.out.println(Arrays.toString(new 기능개발().solution(p2, s2)));   
    }

}
