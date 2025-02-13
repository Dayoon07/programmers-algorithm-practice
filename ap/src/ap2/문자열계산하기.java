package ap2;

public class 문자열계산하기 {
    
    public int solution(String my_string) {
        String[] one = my_string.split(" ");
        int answer = Integer.parseInt(one[0]);
    
        for (int i = 1; i < one.length; i += 2) {
            String op = one[i];
            int num = Integer.parseInt(one[i + 1]);
    
            if (op.equals("+")) {
                answer += num;
            } else if (op.equals("-")) {
                answer -= num;
            }
        }
    
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 문자열계산하기().solution("3 + 4"));
    }

}
