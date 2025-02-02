package ap2;

public class 최빈값구하기 {
    
    public static void main(String[] args) {
        System.out.println(new 최빈값구하기().solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(new 최빈값구하기().solution(new int[]{1, 1, 2, 2}));
        System.out.println(new 최빈값구하기().solution(new int[]{1}));
    }

    public int solution(int[] array) {
        int[] freq = new int[1000];
    
        // 입력 배열에서 각 숫자의 빈도를 증가시킴
        for (int num : array) freq[num]++;
    
        int maxFreq = 0;  // 최댓값 빈도 (가장 많이 나온 숫자의 출현 횟수)
        int mode = -1;    // 최빈값 (가장 자주 등장한 숫자)
        int count = 0;    // 최빈값 후보 개수 (여러 개면 -1 리턴하기 위함)
    
        // 0부터 999까지 모든 숫자의 빈도를 확인
        for (int i = 0; i < 1000; i++) {
            if (freq[i] > maxFreq) {    // 더 높은 빈도를 찾았을 때
                maxFreq = freq[i];      // 최댓값 빈도 업데이트
                mode = i;               // 해당 숫자를 최빈값으로 설정
                count = 1;              // 새로운 최빈값이므로 후보 개수 초기화
            } else if (freq[i] == maxFreq) {    // 동일한 빈도의 숫자가 있을 경우
                count++;            // 후보 개수 증가 (최빈값이 여러 개 존재)
            }
        }
    
        // 최빈값이 여러 개 존재하면 -1, 아니면 최빈값 반환
        return count > 1 ? -1 : mode;
    }

}
