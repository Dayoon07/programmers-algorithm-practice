package ap;

public class 문자열여러번뒤집기 {
    
    public static void main(String[] args) {
        int[][] q = {
            {2, 3},
            {0, 7},
            {5, 9},
            {6, 10}
        };
        System.out.println(new 문자열여러번뒤집기().solution("rermgorpsam", q));
    }

    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            while (s < e) {
                char temp = answer.charAt(s);
                answer.setCharAt(s, answer.charAt(e));
                answer.setCharAt(e, temp);
                s++;
                e--;
            }
        }

        return answer.toString();
    }

}
