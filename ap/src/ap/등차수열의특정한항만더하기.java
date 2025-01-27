package ap;

public class 등차수열의특정한항만더하기 {
    
    public static void main(String[] args) {
        boolean[] include1 = {true, false, false, true, true};
        boolean[] include2 = {false, false, false, true, false, false, false};
        System.out.println(new 등차수열의특정한항만더하기().solution(3, 4, include1));
        System.out.println(new 등차수열의특정한항만더하기().solution(7, 1, include2));
    }

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            int t = a + (i * d);
            if (included[i]) {
                answer += t;
            }
        }
        return answer;
    }

}
