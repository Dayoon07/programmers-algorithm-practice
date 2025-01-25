package ap;

public class 접미사인지확인하기 {
    
    public static void main(String[] args) {
        System.out.println(new 접미사인지확인하기().solution("banana", "ana"));
        System.out.println(new 접미사인지확인하기().solution("banana", "nan"));
        System.out.println(new 접미사인지확인하기().solution("banana", "wxyz"));
        System.out.println(new 접미사인지확인하기().solution("banana", "abanana"));
    }

    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) == true ? 1 : 0;
    }

}
