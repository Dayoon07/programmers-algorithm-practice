package ap;

public class 가까운1찾기 {
    
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 1};
        int[] arr2 = {1, 0, 0, 1, 0, 0};
        int[] arr3 = {1, 1, 1, 1, 0};
        System.out.println(new 가까운1찾기().solution(arr1, 1));
        System.out.println(new 가까운1찾기().solution(arr2, 4));
        System.out.println(new 가까운1찾기().solution(arr3,3));
    }

    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

}
