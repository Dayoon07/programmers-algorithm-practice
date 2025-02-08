package ap2;

public class 주사위의개수 {
    
    public static void main(String[] args) {
        System.out.println(new 주사위의개수().solution(new int[]{1, 1, 1}, 1));
        System.out.println(new 주사위의개수().solution(new int[]{10, 8, 6}, 3));
    }

    public int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }

}
