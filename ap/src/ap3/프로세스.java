package ap3;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : priorities) {
            pq.add(n);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;
                    if (i == location) return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] p1 = {2, 1, 3, 2};
        int[] p2 = {1, 1, 9, 1, 1, 1};
        System.out.println(new 프로세스().solution(p1, 2));
        System.out.println(new 프로세스().solution(p2, 0));
    }

}