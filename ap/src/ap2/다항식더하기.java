package ap2;

public class 다항식더하기 {
    
    public String solution(String polynomial) {
        // x항의 계수와 상수항을 저장할 변수
        int xCoefficient = 0;
        int constant = 0;
        
        // 다항식을 항별로 분리
        String[] terms = polynomial.split(" \\+ ");
        
        // 각 항을 순회하면서 처리
        for (String term : terms) {
            if (term.contains("x")) {
                // x항인 경우
                if (term.equals("x")) {
                    // 계수가 1인 경우
                    xCoefficient += 1;
                } else {
                    // x 앞의 계수를 추출
                    xCoefficient += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                // 상수항인 경우
                constant += Integer.parseInt(term);
            }
        }
        
        // 결과 문자열 생성
        StringBuilder result = new StringBuilder();
        
        // x항 처리
        if (xCoefficient > 0) {
            if (xCoefficient == 1) {
                result.append("x");
            } else {
                result.append(xCoefficient).append("x");
            }
        }
        
        // 상수항 처리
        if (constant > 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }
        
        // x항과 상수항이 모두 0인 경우 처리
        if (result.length() == 0) {
            return "0";
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new 다항식더하기().solution("3x + 7 + x"));
        System.out.println(new 다항식더하기().solution("x + x + x"));
    }

}
