package ap;

public class 문자열바꿔서찾기 {
    
    public static void main(String[] args) {
        System.out.println(new 문자열바꿔서찾기().solution("ABBAA", "AABB"));
    }

    public int solution(String myString, String pat) {
        StringBuilder l = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                l.append('B');
            } else if (c == 'B') {
                l.append('A');
            } else {
                l.append(c);
            }
        }

        if (l.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }

}
