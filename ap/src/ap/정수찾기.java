package ap;

public class 정수찾기 {
    
    public static void main(String[] args) {
        int[] numList1 = {1, 2, 3, 4, 5};
        int[] numList2 = {15, 98, 23, 2, 15};
        System.out.println(new 정수찾기().solution(numList1, 3));
        System.out.println(new 정수찾기().solution(numList2, 20));
    }

    public int solution(int[] num_list, int n) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                return 1;
            }
        }
        return 0;
    }

}
