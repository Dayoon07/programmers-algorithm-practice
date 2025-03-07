package ap3;

public class 타겟넘버 {
    
    public int solution(int[] numbers, int target) {
        // DFS 방식으로 모든 +/- 경우의 수를 탐색
        return dfs(numbers, target, 0, 0);
    }
    
    /**
     * DFS를 이용한 재귀 함수
     * @param numbers 사용할 수 있는 숫자 배열
     * @param target 만들어야 하는 타겟 넘버
     * @param index 현재 처리 중인 숫자의 인덱스
     * @param sum 지금까지 계산된 합계
     * @return 타겟 넘버를 만드는 방법의 수
     */
    private int dfs(int[] numbers, int target, int index, int sum) {
        // 모든 숫자를 다 사용했을 때
        if (index == numbers.length) {
            // 현재 합계가 타겟 넘버와 일치하면 1을 반환, 아니면 0을 반환
            return sum == target ? 1 : 0;
        }
        
        // 현재 숫자를 더하는 경우의 수
        int a = dfs(numbers, target, index + 1, sum + numbers[index]);
        
        // 현재 숫자를 빼는 경우의 수
        int b = dfs(numbers, target, index + 1, sum - numbers[index]);
        
        // 두 경우의 수를 합쳐서 반환
        return a + b;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = {4, 1, 2, 1};
        int t1 = 3, t2 = 4;

        System.out.println(new 타겟넘버().solution(arr1, t1));
        System.out.println(new 타겟넘버().solution(arr2, t2));
    }

}
