package ap;

public class 수조작하기1 {
    
    public static void main(String[] args) {
        System.out.println(new 수조작하기1().solution(0, "wsdawsdassw"));
    }

    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            String str = String.valueOf(control.charAt(i));
            if (str.equals("w")) {
                answer += 1;
            } else if (str.equals("s")) {
                answer -= 1;
            } else if (str.equals("d")) {
                answer += 10;
            } else if (str.equals("a")) {
                answer -= 10;
            }
        }
        return answer;
    }

}
