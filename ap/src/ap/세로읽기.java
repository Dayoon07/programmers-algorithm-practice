package ap;

public class 세로읽기 {
    
    public static void main(String[] args) {
        System.out.println(new 세로읽기().solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(new 세로읽기().solution("programmers", 1, 1));
    }

    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

}
