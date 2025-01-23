package ap;

public class 소문자로바꾸기 {
    
    public static void main(String[] args) {
        System.out.println(new 소문자로바꾸기().solution("aBcDeFg"));
    }

    public String solution(String myString) {
        return myString.toLowerCase();
    }

}
