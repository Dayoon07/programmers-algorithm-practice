package ap2;

public class 중복된숫자개수 {

    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 중복된숫자개수().solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(new 중복된숫자개수().solution(new int[]{0, 2, 3, 4}, 1));
    }

}