package ap2;

public class 양꼬치 {
    
    public static void main(String[] args) {
        System.out.println(new 양꼬치().solution(10, 3));
        System.out.println(new 양꼬치().solution(64, 6));
    }

    public int solution(int n, int k) {
        int answer = (n * 12000) + ((k - (n / 10)) * 2000);
        return answer;
    }

}
