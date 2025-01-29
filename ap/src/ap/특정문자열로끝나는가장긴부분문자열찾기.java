package ap;

public class 특정문자열로끝나는가장긴부분문자열찾기 {
    
    public static void main(String[] args) {
        System.out.println(new 특정문자열로끝나는가장긴부분문자열찾기().solution("AbCdEFG", "dE"));
        System.out.println(new 특정문자열로끝나는가장긴부분문자열찾기().solution("AAAAaaaa", "a"));
    }

    public String solution(String myString, String pat) {
        int lastIndex = myString.lastIndexOf(pat);
        if (lastIndex == -1) return "";
        return myString.substring(0, lastIndex + pat.length());
    }
    
}
