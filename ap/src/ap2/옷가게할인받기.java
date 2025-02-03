package ap2;

public class 옷가게할인받기 {

    public static void main(String[] args) {
        System.out.println(new 옷가게할인받기().solution(150000));
        System.out.println(new 옷가게할인받기().solution(580000));
    }

    public int solution(int price) {
        if (price >= 500000) {
            return (int)(price * 0.8);
        } else if (price >= 300000) {
            return (int)(price * 0.9);
        } else if (price >= 100000) {
            return (int)(price * 0.95);
        } else {
            return price;
        }
    }

}