package ap2;

public class 평행 {
    
    public int solution(int[][] dots) {
        return (checkParallel(dots[0], dots[1], dots[2], dots[3]) 
            ||checkParallel(dots[0], dots[2], dots[1], dots[3]) 
            || checkParallel(dots[0], dots[3], dots[1], dots[2])) ? 1 : 0;
    }
    
    private boolean checkParallel(int[] a, int[] b, int[] c, int[] d) {
        return (b[1] - a[1]) * (d[0] - c[0]) == (d[1] - c[1]) * (b[0] - a[0]);
    }
    
    public static void main(String[] args) {
        System.out.println(new 평행().solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(new 평행().solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
    }

}
