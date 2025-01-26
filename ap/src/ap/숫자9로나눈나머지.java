package ap;

public class 숫자9로나눈나머지 {
    
    public static void main(String[] args) {
        System.out.println(new 숫자9로나눈나머지().solution("123"));
        System.out.println(new 숫자9로나눈나머지().solution("78720646226947352489"));
    }

    public int solution(String number) {
        int n = 0;
        for (int i = 0; i < number.length(); i++) {
            n += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return n % 9;
    }

}
