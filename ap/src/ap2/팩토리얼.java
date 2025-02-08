package ap2;

public class 팩토리얼 {
    
    public static void main(String[] args) {
        System.out.println(new 팩토리얼().solution(3628800));
        System.out.println(new 팩토리얼().solution(7));
    }

    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int k = 1;
        
        while (true) {
            num *= k;
            if(num > n) {
                answer = k;
                break;
            }
            k++;
        }
        return answer - 1;
    }

}
