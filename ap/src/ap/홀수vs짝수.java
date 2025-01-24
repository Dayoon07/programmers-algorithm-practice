package ap;

public class 홀수vs짝수 {
    
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 6, 1, 7, 6};
        int[] arr2 = {-1, 2, 5, 6, 3};
        홀수vs짝수 a = new 홀수vs짝수();
        System.out.println(a.solution(arr2));
    }

    public int solution(int[] num_list) {
        int a = 0, b = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 1) {
                a += num_list[i];
            } else {
                b += num_list[i];
            }
        }
        return a > b ? a : b;
    }

}
