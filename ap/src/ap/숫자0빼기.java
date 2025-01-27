package ap;

public class 숫자0빼기 {
    
    public static void main(String[] args) {
        System.out.println(new 숫자0빼기().solution("0010"));
        System.out.println(new 숫자0빼기().solution("854020"));
    }

    public String solution(String n_str) {
        return n_str.replaceFirst("^0+", "");
    }

}
