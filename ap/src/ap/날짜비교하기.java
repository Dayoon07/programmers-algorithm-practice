package ap;

public class 날짜비교하기 {
    
    public static void main(String[] args) {
        int[] d1 = {2021, 12, 28};
        int[] d2 = {2021, 12, 29};
        int[] d3 = {1024, 10, 24};
        int[] d4 = {1024, 10, 24};
        System.out.println(new 날짜비교하기().solution(d1, d2));
        System.out.println(new 날짜비교하기().solution(d3, d4));
    }

    public int solution(int[] date1, int[] date2) {
        String a1 = "";
        String a2 = "";
        for (int i = 0; i < date1.length; i++) {
            a1 += String.valueOf(date1[i]);
            a2 += String.valueOf(date2[i]);
        }
        if (Integer.parseInt(a1) < Integer.parseInt(a2)) {
            return 1;
        } else {
            return 0;
        }
    }

}
