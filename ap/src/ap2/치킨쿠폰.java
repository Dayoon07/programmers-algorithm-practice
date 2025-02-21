package ap2;

public class 치킨쿠폰 {
    
    public int solution(int chicken) {
        int answer = 0;
        int cp = chicken;
        
        while (cp >= 10) {
            int newChicken = cp / 10;
            answer += newChicken;
            cp = newChicken + (cp % 10);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 치킨쿠폰().solution(100));
        System.out.println(new 치킨쿠폰().solution(1081));
    }

}
