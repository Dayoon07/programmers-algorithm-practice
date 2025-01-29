package ap;

public class 숫자1로만들기 {
    
    public static void main(String[] args) {
        int[] arr = {12, 4, 15, 1, 14};
        System.out.println(new 숫자1로만들기().solution(arr));
    }

    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            while (num > 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = (num - 1) / 2;
                }
                answer++;
            }
        }
        return answer;
    }

}
