package ap2;

public class 안전지대 {
    
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] dangerZone = new boolean[n][n]; // 위험지역 표시 배열
        
        // 8방향 이동 (상, 하, 좌, 우, 대각선)
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        // 지뢰 위치 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    dangerZone[i][j] = true; // 지뢰 위치도 위험지역
                    // 주변 8칸을 위험지역으로 표시
                    for (int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                            dangerZone[ni][nj] = true;
                        }
                    }
                }
            }
        }

        // 안전한 지역 개수 세기
        int safeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!dangerZone[i][j] && board[i][j] == 0) {
                    safeCount++;
                }
            }
        }

        return safeCount;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0}
        };
        int[][] arr2 = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0}
        };
        int[][] arr3 = {
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1}
        };
        System.out.println(new 안전지대().solution(arr1));
        System.out.println(new 안전지대().solution(arr2));
        System.out.println(new 안전지대().solution(arr3));
    }

}
