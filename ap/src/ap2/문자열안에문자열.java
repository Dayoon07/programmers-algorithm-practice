package ap2;

public class 문자열안에문자열 {

    public int solution(String str1, String str2) {
        return str1.contains(str2) == true ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(new 문자열안에문자열().solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(new 문자열안에문자열().solution("ppprrrogrammers", "pppp"));
        System.out.println(new 문자열안에문자열().solution("AbcAbcA", "AAA"));
    }

}