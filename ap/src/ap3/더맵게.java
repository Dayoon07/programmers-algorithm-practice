package ap3;

import java.util.PriorityQueue;

public class 더맵게 {

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (int food : scoville) {
            q.offer(food);
        }
        
        // 섞은 횟수
        int c = 0;
        
        // 모든 음식의 스코빌 지수를 K 이상으로 만들기
        while (q.peek() < K) {
            // 힙의 크기가 1 이하이면 K 이상으로 만들 수 없음
            if (q.size() <= 1) {
                return -1;
            }
            
            // 가장 맵지 않은 두 음식 꺼내기
            int a = q.poll();
            int b = q.poll();
            
            // 새로운 음식 만들기
            int newFood = a + (b * 2);
            
            // 새로운 음식 힙에 추가
            q.offer(newFood);
            
            // 섞은 횟수 증가
            c++;
        }
        
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new 더맵게().solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

}