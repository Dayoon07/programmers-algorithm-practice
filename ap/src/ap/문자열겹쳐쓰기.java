package ap;

public class 문자열겹쳐쓰기 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열겹쳐쓰기().solution("He11oWor1d", "lloWorl", 2));
        System.out.println(new 문자열겹쳐쓰기().solution("Program29b8UYP", "merS123", 7));
    }

    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + 
            my_string.substring(s + overwrite_string.length());
    }

}
