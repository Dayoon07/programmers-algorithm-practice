package ap;

public class A강조하기 {
    
    public static void main(String[] args) {
        System.out.println(new A강조하기().solution("abstract algebra"));
    }

    public String solution(String myString) {
        String answer = myString.toLowerCase().replaceAll("a", "A");
        return answer;
    }

}
