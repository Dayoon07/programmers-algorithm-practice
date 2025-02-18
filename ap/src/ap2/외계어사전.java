package ap2;

import java.util.Arrays;

public class 외계어사전 {
    
    public int solution(String[] spell, String[] dic) {
        // spell을 하나의 문자열로 만들고 정렬
        String target = String.join("", spell);
        char[] targetArr = target.toCharArray();
        Arrays.sort(targetArr);
        String sortedTarget = new String(targetArr);

        // dic의 각 단어를 정렬한 후, target과 비교
        for (String word : dic) {
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            if (new String(wordArr).equals(sortedTarget)) {
                return 1; // 일치하는 단어가 있으면 1 반환
            }
        }
        return 2; // 없으면 2 반환
    }

    public static void main(String[] args) {
        String[] s1 = {"p", "o", "s"};
        String[] s2 = {"z", "d", "x"};
        String[] s3 = {"s", "o", "m", "d"};
        String[] d1 = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] d2 = {"def", "dww", "dzx", "loveaw"};
        String[] d3 = {"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.println(new 외계어사전().solution(s1, d1));
        System.out.println(new 외계어사전().solution(s2, d2));
        System.out.println(new 외계어사전().solution(s3, d3));
    }

}
