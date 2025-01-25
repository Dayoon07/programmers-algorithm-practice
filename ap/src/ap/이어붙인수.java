package ap;

public class 이어붙인수 {
    
    public static void main(String[] args) {
        int[] numList1 = {3, 4, 5, 2, 1};
        int[] numList2 = {5, 7, 8, 3};
        System.out.println(new 이어붙인수().solution(numList1));
        System.out.println(new 이어붙인수().solution(numList2));
    }

    public int solution(int[] num_list) {
        String x = "", y = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                x += String.valueOf(num_list[i]);
            } else {
                y += String.valueOf(num_list[i]);
            }
        }
        return Integer.parseInt(x) + Integer.parseInt(y);
    }

}
