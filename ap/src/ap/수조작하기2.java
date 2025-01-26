package ap;

public class 수조작하기2 {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(new 수조작하기2().solution(arr));
    }

    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            int e = numLog[i] - numLog[i - 1];

            if (e == 1) {
                answer += "w";
            } else if (e == -1) {
                answer += "s";
            } else if (e == 10) {
                answer += "d";
            } else if (e == -10) {
                answer += "a";
            }
        }
        return answer;
    }

}
