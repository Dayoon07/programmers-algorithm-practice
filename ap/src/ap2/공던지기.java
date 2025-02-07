package ap2;

public class 공던지기 {
    
    public static void main(String[] args) {
        System.out.println(new 공던지기().solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(new 공던지기().solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(new 공던지기().solution(new int[]{1, 2, 3}, 3));
    }

    public int solution(int[] numbers, int k) {
        int index = ((k - 1) * 2) % numbers.length;
        return numbers[index];
    }

}
