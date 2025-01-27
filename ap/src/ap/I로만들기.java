package ap;

public class I로만들기 {
    
    public static void main(String[] args) {
        System.out.println(new I로만들기().solution("abcdevwxyz"));
        System.out.println(new I로만들기().solution("jjnnllkkmm"));
    }

    public String solution(String myString) {
        return myString.replaceAll("[abcdefghijk]", "l");
    }

}
