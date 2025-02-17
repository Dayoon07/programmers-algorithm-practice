package ap2;

public class 머쓱이보다키큰사람 {
    
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 머쓱이보다키큰사람().solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(new 머쓱이보다키큰사람().solution(new int[]{180, 120, 140}, 190));
    }

}
