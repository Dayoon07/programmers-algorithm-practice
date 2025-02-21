package ap2;

public class 옹알이1 {
    
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            boolean p = true;
            for (String sound : possible) {
                if (word.contains(sound + sound)) {
                    p = false;
                    break;
                }
                word = word.replace(sound, "*");
            }
            
            if (p && word.replace("*", "").length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] arr2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(new 옹알이1().solution(arr1));
        System.out.println(new 옹알이1().solution(arr2));
    }

}
