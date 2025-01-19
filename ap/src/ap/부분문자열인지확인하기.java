package ap;

public class 부분문자열인지확인하기 {
    
    public static void main(String[] args) {
        System.out.println(new 부분문자열인지확인하기().solution("banana", "ana"));
    }

    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

}
