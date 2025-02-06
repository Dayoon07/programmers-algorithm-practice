package ap2;

import java.util.HashMap;
import java.util.Map;

public class 모스부호1 {

    public static void main(String[] args) {
        System.out.println(new 모스부호1().solution(".... . .-.. .-.. ---"));
        System.out.println(new 모스부호1().solution(".--. -.-- - .... --- -."	));
    }

    public String solution(String letter) {
        Map<String, String> morse = new HashMap<>();
        String[] morseArr = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",
            ".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        char alphabet = 'a';
        
        // 모스부호 매핑
        for (String code : morseArr) {
            morse.put(code, String.valueOf(alphabet++));
        }

        // 입력 문자열 해독
        StringBuilder result = new StringBuilder();
        String[] words = letter.split(" ");
        for (String word : words) {
            result.append(morse.get(word));
        }

        return result.toString();
    }

}
