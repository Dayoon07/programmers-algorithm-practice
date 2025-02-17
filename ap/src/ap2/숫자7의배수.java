package ap2;

public class 숫자7의배수 {
    
    public int solution(int[] array) {
        int answer = 0;
        for (int n : array) {
            String str = String.valueOf(n);
            for (char c : str.toCharArray()) {
                if (c == '7') answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 숫자7의배수().solution(new int[]{7, 77, 17}));
        System.out.println(new 숫자7의배수().solution(new int[]{10, 29}));
    }

}
