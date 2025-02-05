package ap2;

public class 외계행성의나이 {
    
    public static void main(String[] args) {
        System.out.println(new 외계행성의나이().solution(23));
        System.out.println(new 외계행성의나이().solution(51));
        System.out.println(new 외계행성의나이().solution(100));
    }

    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);

        for (char abc : str.toCharArray()) {
            answer += (char) ('a' + (abc - '0'));
        }

        return answer;
    }

}
