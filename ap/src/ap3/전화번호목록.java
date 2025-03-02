package ap3;

import java.util.HashMap;

public class 전화번호목록 {
    
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : phone_book) map.put(str, 1);

        for (String p : phone_book) {
            for (int i = 1; i < p.length(); i++) {
                String a = p.substring(0, i);
                if (map.containsKey(a)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] s1 = {"119", "97674223", "1195524421"};
        String[] s2 = {"123","456","789"};
        String[] s3 = {"12","123","1235","567","88"};

        System.out.println(new 전화번호목록().solution(s1));
        System.out.println(new 전화번호목록().solution(s2));
        System.out.println(new 전화번호목록().solution(s3));
    }

}
