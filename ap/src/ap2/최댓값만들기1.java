package ap2;

public class 최댓값만들기1 {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {0, 31, 24, 10, 1, 9};
        System.out.println(new 최댓값만들기1().solution(arr1));
        System.out.println(new 최댓값만들기1().solution(arr2));
    }

    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }

}
