package ap;

public class 문자리스트를문자열로변환하기 {
    
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        System.out.println(new 문자리스트를문자열로변환하기().solution(arr));
    }

    public String solution(String[] arr) {
        String answer = "";
        for (String n : arr) {
            answer += n;
        }
        return answer;
    }

    /*
        public String solution(String[] arr) {
            return String.join("", arr);
        }
    */

}
