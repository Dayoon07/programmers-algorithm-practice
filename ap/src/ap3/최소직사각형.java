package ap3;

public class 최소직사각형 {

    public int solution(int[][] sizes) {
        int a = 0;  // 가장 긴 쪽 중 최대값
        int b = 0; // 가장 짧은 쪽 중 최대값
        
        for (int[] card : sizes) {
            // 각 명함에서 더 긴 쪽과 짧은 쪽 결정
            int aa = Math.max(card[0], card[1]);
            int bb = Math.min(card[0], card[1]);
            
            // 긴 쪽 중 최대값 갱신
            a = Math.max(a, aa);
            
            // 짧은 쪽 중 최대값 갱신
            b = Math.max(b, bb);
        }
        
        // 최종 지갑 크기 반환 (넓이)
        return a * b;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] arr2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] arr3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(new 최소직사각형().solution(arr1));
        System.out.println(new 최소직사각형().solution(arr2));
        System.out.println(new 최소직사각형().solution(arr3));
    }

}