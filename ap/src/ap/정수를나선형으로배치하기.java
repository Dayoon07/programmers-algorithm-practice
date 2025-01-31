package ap;

import java.util.Arrays;

public class 정수를나선형으로배치하기 {
    public static void main(String[] args) {
        int[][] result = solution(4);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        // 방향: 오른쪽(0,1), 아래(1,0), 왼쪽(0,-1), 위쪽(-1,0)
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0, dir = 0; // 시작점 및 초기 방향
        for (int i = 1; i <= n * n; i++) {
            answer[x][y] = i;

            // 다음 좌표 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 범위를 벗어나거나 이미 값이 채워진 경우 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4; // 방향 변경
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        return answer;
    }

}
