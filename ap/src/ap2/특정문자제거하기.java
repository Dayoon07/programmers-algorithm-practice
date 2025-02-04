package ap2;

public class 특정문자제거하기 {
    
    public static void main(String[] args) {
        System.out.println(new 특정문자제거하기().solution("abcdef", "f"));
        System.out.println(new 특정문자제거하기().solution("BCBdbe", "B"));
    }

    public String solution(String my_string, String letter) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (!String.valueOf(my_string.charAt(i)).equals(letter)) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

}
