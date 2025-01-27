package ap;

public class 간단한식계산하기 {
    
    public static void main(String[] args) {
        System.out.println(new 간단한식계산하기().solution("43 + 12"));
        System.out.println(new 간단한식계산하기().solution("0 - 7777"));
        System.out.println(new 간단한식계산하기().solution("40000 * 40000"));
    }

    public int solution(String binomial) {
        String[] answer = binomial.split(" ");
        int a = Integer.parseInt(answer[0]);
        int b = Integer.parseInt(answer[2]);
        int s = 0;
        if (answer[1].equals("+")) {
            s = a + b;
        } else if (answer[1].equals("-")) {
            s = a - b;
        } else if (answer[1].equals("*")) {
            s = a * b;
        } else if (answer[1].equals("/")) {
            s = a / b;
        } else {
            s = a % b;
        }
        return s;
    }

}
