package ap;

public class 특정한문자를대문자로바꾸기 {
    
    public static void main(String[] args) {
        System.out.println(new 특정한문자를대문자로바꾸기().solution("programmers", "p"));
    }

    public String solution(String my_string, String alp) {
        String answer = my_string.replaceAll(alp, alp.toUpperCase());
        return answer;
    }

}
