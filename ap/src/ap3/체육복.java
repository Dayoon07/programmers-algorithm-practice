package ap3;

import java.util.HashSet;

public class 체육복 {
    
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> rs = new HashSet<>();
        
        for (int l : lost) {
            set.add(l);
        }
        
        for (int r : reserve) {
            if (set.contains(r)) {
                set.remove(r); // 도난당했지만 여벌이 있는 경우 제외
            } else {
                rs.add(r);
            }
        }
        
        for (int r : rs) {
            if (set.contains(r - 1)) {
                set.remove(r - 1);
            } else if (set.contains(r + 1)) {
                set.remove(r + 1);
            }
        }
        
        return n - set.size();
    }

    public static void main(String[] args) {
        System.out.println(new 체육복().solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(new 체육복().solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(new 체육복().solution(3, new int[]{3}, new int[]{1}));
    }

}
