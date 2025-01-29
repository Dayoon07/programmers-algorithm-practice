package ap;

public class 문자열뒤집기 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열뒤집기().solution("Progra21Sremm3", 6, 12));
        System.out.println(new 문자열뒤집기().solution("Stanley1yelnatS", 4, 10));
    }

    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        String ans = my_string.substring(e + 1);
        String str = "";
        for (int i = e; i >= s; i--) {
            str += String.valueOf(my_string.charAt(i));
        }
        return answer + str + ans;
    }

}
