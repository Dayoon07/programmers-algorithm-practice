package ap;

public class 첫번째로나오는음수 {
    
    public static void main(String[] args) {
        int[] arr1 = {12, 4, 15, 46, 38, -2, 15};
        int[] arr2 = {13, 22, 53, 24, 15, 6};
        System.out.println(new 첫번째로나오는음수().solution(arr1));
        System.out.println(new 첫번째로나오는음수().solution(arr2));
    }

    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

}
