package ap;

public class 길이에따른연산 {
    
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] arr2 = {2, 3, 4, 5};
        System.out.println(new 길이에따른연산().solution(arr2));
    }

    public int solution(int[] num_list) {
        int answer = num_list.length >= 11 ? 0 : 1;
        
        for (int num : num_list) {
            if (num_list.length >= 11) {
                answer += num;
            } else {
                answer *= num;
            }
        }
        return answer;
    }

}
