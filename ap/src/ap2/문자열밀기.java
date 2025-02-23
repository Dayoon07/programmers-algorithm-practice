package ap2;

public class 문자열밀기 {

    public int solution(String A, String B) {
        if (A.length() != B.length()) return -1;
        if (A.equals(B)) return 0;
        
        for (int i = 1; i <= A.length(); i++) {
            String rotated = A.substring(A.length() - i) + A.substring(0, A.length() - i);
            
            if (rotated.equals(B)) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new 문자열밀기().solution("hello", "ohell"));
        System.out.println(new 문자열밀기().solution("apple", "elppa"));
        System.out.println(new 문자열밀기().solution("atat", "tata"));
        System.out.println(new 문자열밀기().solution("abc", "abc"));
    }

}