package ap2;

public class 모음제거 {

    public static void main(String[] args) {
        System.out.println(new 모음제거().solution("bus"));
        System.out.println(new 모음제거().solution("nice to meet you"));
    }

    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += String.valueOf(my_string.charAt(i)).replaceAll("[aeiou]", "");
        }
        return answer;
    }

}