package ap;

public class 원소들의곱과합 {
    
    public static void main(String[] args) {
        int[] numList1 = {3, 4, 5, 2, 1};
        int[] numList2 = {5, 7, 8, 3};
        System.out.println(new 원소들의곱과합().solution(numList1));
        System.out.println(new 원소들의곱과합().solution(numList2));
    }

    public int solution(int[] num_list) {
        int sum = 0, t = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            t *= num_list[i];
        }
        if (sum * sum > t) {
            return 1;
        } else {
            return 0;
        }
    }

}
