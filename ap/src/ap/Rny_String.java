package ap;

public class Rny_String {
    
    public static void main(String[] args) {
        System.out.println(new Rny_String().solution("programmers"));
    }

    public String solution(String rny_string) {
        String[] a = new String[rny_string.length()];
        for (int i = 0; i < rny_string.length(); i++) {
            if (String.valueOf(rny_string.charAt(i)).equals("m")) {
                a[i] = "rn";
            } else {
                a[i] = String.valueOf(rny_string.charAt(i));
            }
        }
        String answer = "";
        for (String n : a) {
            answer += n;
        }
        return answer;
    }

}
