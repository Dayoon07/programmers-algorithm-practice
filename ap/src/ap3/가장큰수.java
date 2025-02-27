package ap3;

import java.util.PriorityQueue;

public class 가장큰수 {
    
    public String solution(int[] numbers) {
        // 우선순위 큐, 내림차순 정렬
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> (b + a).compareTo((a + b)));

        for (int num : numbers) {
            pq.add(String.valueOf(num));
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append(pq.poll());
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new 가장큰수().solution(new int[]{6, 10, 2}));
        System.out.println(new 가장큰수().solution(new int[]{3, 30, 34, 5, 9}));
    }

}
