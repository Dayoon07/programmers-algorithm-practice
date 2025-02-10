package ap2;

public class 숨어있는숫자의덧셈1 {
    
    public static void main(String[] args) {
        System.out.println(new 숨어있는숫자의덧셈1().solution("aAb1B2cC34oOp"));
        System.out.println(new 숨어있는숫자의덧셈1().solution("1a2b3c4d123"));
    }

    public int solution(String my_string) {
        int sum = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }

}
