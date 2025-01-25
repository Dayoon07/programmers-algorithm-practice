package ap;

public class 문자열의뒤의N글자 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열의뒤의N글자().solution("ProgrammerS123", 11));
        System.out.println(new 문자열의뒤의N글자().solution("He110W0r1d", 5));
    }

    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

}
