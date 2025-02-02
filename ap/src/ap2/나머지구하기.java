package ap2;

public class 나머지구하기 {
    
    public static void main(String[] args) {
        System.out.println(new 나머지구하기().solution(3, 2));
        System.out.println(new 나머지구하기().solution(10, 5));
    }

    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }

}
