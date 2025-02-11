package ap2;

public class 삼육구게임 {
    
    public int solution(int order) {
        int c = 0;
        String o = String.valueOf(order);

        for (char h : o.toCharArray()) {
            if (h == '3' || h == '6' || h == '9') {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new 삼육구게임().solution(3));
        System.out.println(new 삼육구게임().solution(29423));
    }

}
