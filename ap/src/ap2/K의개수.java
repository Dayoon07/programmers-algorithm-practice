package ap2;

public class K의개수 {
    
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int num = i; num <= j; num++) {
            String numStr = String.valueOf(num);
            
            for (int idx = 0; idx < numStr.length(); idx++) {
                if (numStr.charAt(idx) - '0' == k) answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new K의개수().solution(1, 13, 1));
        System.out.println(new K의개수().solution(10, 50, 5));
        System.out.println(new K의개수().solution(3, 10, 2));
    }

}
