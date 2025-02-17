package ap2;

import java.util.Arrays;

public class 캐릭터의좌표 {
    
    // 문제 중에 헷갈려서 적어놓음
    // up, down, left, right 이렇게 4개,
    // up, down은 오른쪽
    // left, right은 왼쪽
    public int[] solution(String[] keyinput, int[] board) {
        // 시작 위치는 항상 [0, 0]
        int x = 0;
        int y = 0;
        
        // board의 가로, 세로 범위
        int maxX = board[0] / 2;  // 가로의 절반
        int maxY = board[1] / 2;  // 세로의 절반
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                if (y < maxY) y++;  // y 좌표가 세로 범위를 벗어나지 않도록 제한
            } else if (keyinput[i].equals("down")) {
                if (y > -maxY) y--;  // y 좌표가 세로 범위를 벗어나지 않도록 제한
            } else if (keyinput[i].equals("left")) {
                if (x > -maxX) x--;  // x 좌표가 가로 범위를 벗어나지 않도록 제한
            } else if (keyinput[i].equals("right")) {
                if (x < maxX) x++;  // x 좌표가 가로 범위를 벗어나지 않도록 제한
            }
        }
        
        return new int[] {x, y};
    }

    public static void main(String[] args) {
        String[] arr1 = {"left", "right", "up", "right", "right"};
        String[] arr2 = {"down", "down", "down", "down", "down"};
        int[] b1 = {11, 11};
        int[] b2 = {7, 9};
        System.out.println(Arrays.toString(new 캐릭터의좌표().solution(arr1, b1)));
        System.out.println(Arrays.toString(new 캐릭터의좌표().solution(arr2, b2)));
    }

}
