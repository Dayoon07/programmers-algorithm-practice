package ap2;

public class 이진수더하기 {
    
    public String solution(String bin1, String bin2) {
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);

        String answer = Integer.toBinaryString(a + b);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 이진수더하기().solution("10", "11"));
        System.out.println(new 이진수더하기().solution("1001", "1111"));
    }

}
