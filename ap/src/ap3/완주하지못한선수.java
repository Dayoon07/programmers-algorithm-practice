package ap3;

import java.util.HashMap;

public class 완주하지못한선수 {
    
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String n : participant) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (String b : completion) {
            map.put(b, map.get(b) - 1);
            if (map.get(b) == 0) {
                map.remove(b);
            }
        }
        return map.keySet().iterator().next();
    }

    public static void main(String[] args) {
        String[] a1 = {"leo", "kiki", "eden"};
        String[] a2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] a3 = {"mislav", "stanko", "mislav", "ana"};

        String[] r1 = {"eden", "kiki"};
        String[] r2 = {"josipa", "filipa", "marina", "nikola"};
        String[] r3 = {"stanko", "ana", "mislav"};

        System.out.println(new 완주하지못한선수().solution(a1, r1));
        System.out.println(new 완주하지못한선수().solution(a2, r2));
        System.out.println(new 완주하지못한선수().solution(a3 ,r3));
    }

}
