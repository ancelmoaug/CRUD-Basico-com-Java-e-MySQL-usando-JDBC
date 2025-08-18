package dao;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/teste";
    private static final String USER = "root";
    private static final String PASSWORD = "ifbairece";

    public static String getURL() {
        return URL;
    }
    
    public static String getUSER() {
        return USER;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

}
