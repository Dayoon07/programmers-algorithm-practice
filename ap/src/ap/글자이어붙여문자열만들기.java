package ap;

public class 글자이어붙여문자열만들기 {

    public static void main(String[] args) {
        int[] idxList1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        int[] idxList2 = {1, 2, 0, 0, 3};
        System.out.println(new 글자이어붙여문자열만들기().solution("cvsgiorszzzmrpaqpe", idxList1));
        System.out.println(new 글자이어붙여문자열만들기().solution("zpiaz", idxList2));
    }

    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }

}