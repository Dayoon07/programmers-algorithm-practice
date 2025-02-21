package ap2;

public class 로그인성공 {
    
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        boolean idFound = false;
        
        for (int i = 0; i < db.length; i++) {
            String db_id = db[i][0];
            String db_pw = db[i][1];
            
            if (id.equals(db_id)) {
                idFound = true;
                if (pw.equals(db_pw)) return "login";
            }
        }
        
        if (idFound) return "wrong pw";
        
        return "fail";
    }

    public static void main(String[] args) {
        String[] id1 = {"meosseugi", "1234"};
        String[] id2 = {"programmer01", "15789"};
        String[] id3 = {"rabbit04", "98761"};
    
        String[][] db1 = {
            {"rardss", "123"},
            {"yyoom", "1234"},
            {"meosseugi", "1234"}
        };
        String[][] db2 = {
            {"programmer02", "111111"},
            {"programmer00", "134"},
            {"programmer01", "1145"}
        };
        String[][] db3 = {
            {"jaja11", "98761"},
            {"krong0313", "29440"},
            {"rabbit00", "111333"}
        };
    
        System.out.println(new 로그인성공().solution(id1, db1));
        System.out.println(new 로그인성공().solution(id2, db2));
        System.out.println(new 로그인성공().solution(id3, db3));
    }

}
