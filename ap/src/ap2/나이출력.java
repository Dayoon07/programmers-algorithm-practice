package ap2;

public class 나이출력 {
    
    public static void main(String[] args) {
        System.out.println(new 나이출력().solution(40));
        System.out.println(new 나이출력().solution(23));
    }

    public int solution(int age) {
        return 2022 - age + 1;
    }

}
