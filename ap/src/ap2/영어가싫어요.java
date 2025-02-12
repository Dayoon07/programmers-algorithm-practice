package ap2;

import java.util.HashMap;

public class 영어가싫어요 {
    
    public long solution(String numbers) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        String t = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numbers.length(); i++) {
            t += numbers.charAt(i);

            if (map.containsKey(t)) {
                sb.append(map.get(t));
                t = "";
            }
        }

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(new 영어가싫어요().solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(new 영어가싫어요().solution("onefourzerosixseven"));
    }

}
