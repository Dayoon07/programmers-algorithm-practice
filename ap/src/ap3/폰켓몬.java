package ap3;

import java.util.HashSet;

public class 폰켓몬 {
    
    public int solution(int[] nums) {
        int l = nums.length / 2;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums) {
            hashSet.add(n);
        }
        return Math.min(hashSet.size(), l);
    }

    public static void main(String[] args) {
        System.out.println(new 폰켓몬().solution(new int[]{3, 1, 2, 3}));
        System.out.println(new 폰켓몬().solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(new 폰켓몬().solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

}
