package ap;

public class 문자열이몇번등장하는지세기 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열이몇번등장하는지세기().solution("banana", "ana"));
        System.out.println(new 문자열이몇번등장하는지세기().solution("aaaa", "aa"));
    }

    public int solution(String myString, String pat) {
        int c = 0, idx = 0;
        while ((idx = myString.indexOf(pat, idx)) != -1) {
            c++;
            idx++;
        }
        return c;
    }

}
