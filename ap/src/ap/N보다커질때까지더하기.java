package ap;

public class N보다커질때까지더하기 {
    
    public static void main(String[] args) {
        int[] arr1 = {34, 5, 71, 29, 100, 34};
        int[] arr2 = {58, 44, 27, 10, 100};
        System.out.println(new N보다커질때까지더하기().solution(arr1, 123));
        System.out.println(new N보다커질때까지더하기().solution(arr2, 139));
    }

    public int solution(int[] numbers, int n) { 
        int sum = 0;
        for (int number : numbers) {
            sum += number;
            if (sum > n) {
                break;
            }
        }
        return sum;
    }
}
