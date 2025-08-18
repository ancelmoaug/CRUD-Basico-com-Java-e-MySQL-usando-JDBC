import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste", "root", "ifbairece");

            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM cliente");
            while (rsCliente.next()) {
                System.out.println("Nome: " + rsCliente.getString("nome"));
                System.out.println("Idade: " + rsCliente.getInt("idade"));
            }
        } catch (ClassNotFoundException e){
            System.out.println("Driver do BD não localizado!");
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco: " + e.getMessage());
        }
    }
}
