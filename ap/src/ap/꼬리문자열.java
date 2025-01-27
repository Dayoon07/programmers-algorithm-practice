package ap;

public class 꼬리문자열 {
    
    public static void main(String[] args) {
        String[] strList1 = {"abc", "def", "ghi"};
        String[] strList2 = {"abc", "bbc", "cbc"};
        System.out.println(new 꼬리문자열().solution(strList1, "ef"));
        System.out.println(new 꼬리문자열().solution(strList2, "c"));
    }

    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        return answer;
    }

}
