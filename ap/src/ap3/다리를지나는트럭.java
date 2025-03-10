package ap3;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 경과 시간을 저장할 변수
        int t = 0;
        
        // 다리 위에 있는 트럭의 무게와 위치를 저장하는 큐
        Queue<Integer> q = new LinkedList<>();
        
        // 다리에 진입할 수 있는 최대 트럭 수만큼 0을 채워 다리 초기화
        // 0은 트럭이 없음을 의미
        for (int i = 0; i < bridge_length; i++) {
            q.add(0);
        }
        
        // 다리 위에 있는 트럭들의 총 무게
        int cw = 0;
        
        // 다음에 다리에 진입할 트럭의 인덱스
        int ti = 0;
        
        // 모든 트럭이 다리를 지날 때까지 반복
        while (!q.isEmpty()) {
            // 시간 증가
            t++;
            
            // 다리에서 나가는 트럭의 무게를 현재 다리 무게에서 제외
            cw -= q.poll();
            
            // 아직 다리에 진입해야 하는 트럭이 남아 있는 경우
            if (ti < truck_weights.length) {
                // 다음 트럭의 무게
                int n = truck_weights[ti];
                
                // 다음 트럭이 다리에 진입할 수 있는지 확인 (무게 제한 조건)
                if (cw + n <= weight) {
                    // 다리에 트럭 추가
                    q.add(n);
                    // 현재 다리 무게 업데이트
                    cw += n;
                    // 다음 트럭 인덱스 증가
                    ti++;
                } else {
                    // 다음 트럭이 다리에 진입할 수 없으면 0(빈 공간) 추가
                    q.add(0);
                }
            }
            
            // 모든 트럭이 다리에 진입했고, 다리가 비었다면 반복 종료
            if (ti >= truck_weights.length && cw == 0) {
                break;
            }
        }
        
        return t;
    }

    public static void main(String[] args) {
        int[] t1 = {7, 4, 5, 6};
        int[] t2 = {10};
        int[] t3 = {10,10,10,10,10,10,10,10,10,10};

        System.out.println(new 다리를지나는트럭().solution(2, 10, t1));
        System.out.println(new 다리를지나는트럭().solution(100, 100, t2));
        System.out.println(new 다리를지나는트럭().solution(100, 100, t3));
    }

}