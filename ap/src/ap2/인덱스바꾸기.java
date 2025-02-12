package ap2;

public class 인덱스바꾸기 {
    
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();

        char t = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = t;
        
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(new 인덱스바꾸기().solution("hello", 1, 2));
        System.out.println(new 인덱스바꾸기().solution("I love you", 3, 6));
    }

}
