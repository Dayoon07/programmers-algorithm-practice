package ap;

public class 커피심부름 {
    
    public static void main(String[] args) {
        String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        String[] order2 = {"americanoice", "americano", "iceamericano"};
        System.out.println(new 커피심부름().solution(order1));
        System.out.println(new 커피심부름().solution(order2));
    }

    public int solution(String[] order) {
        int answer = 0;
        
        // 가격 상수
        final int AMERICANO_PRICE = 4500;
        final int LATTE_PRICE = 5000;
        
        for (String drink : order) {
            // 아메리카노 계열 확인
            if (drink.equals("anything") || 
                drink.equals("americano") ||
                drink.equals("iceamericano") ||
                drink.equals("americanoice") ||
                drink.equals("hotamericano") ||
                drink.equals("americanohot")) {
                answer += AMERICANO_PRICE;
            }
            // 카페라테 계열 확인
            else if (drink.equals("cafelatte") ||
                     drink.equals("icecafelatte") ||
                     drink.equals("cafelatteice") ||
                     drink.equals("hotcafelatte") ||
                     drink.equals("cafelattehot")) {
                answer += LATTE_PRICE;
            }
        }
        
        return answer;
    }

}
