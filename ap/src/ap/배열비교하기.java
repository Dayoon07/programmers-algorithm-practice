package ap;

public class 배열비교하기 {
    
    public static void main(String[] args) {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};
        new 배열비교하기().solution(arr1, arr2);
    }

    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a1 = 0, a2 = 0;
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else if (arr1.length == arr2.length) {
            for (int n : arr1) {
                a1 += n;
            }
            for (int n : arr2) {
                a2 += n;
            }
            if (a1 > a2) {
                answer = 1;
            } else if(a1 < a2) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }

}
