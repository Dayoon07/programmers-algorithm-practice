package ap;

public class 접두사인지확인하기 {
    
    public static void main(String[] args) {
        System.out.println(new 접두사인지확인하기().solution("banana", "ban"));
        System.out.println(new 접두사인지확인하기().solution("banana", "nan"));
        System.out.println(new 접두사인지확인하기().solution("banana", "abcd"));
        System.out.println(new 접두사인지확인하기().solution("banana", "bananan"));
    }

    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) == true ? 1 : 0;
    }

}
