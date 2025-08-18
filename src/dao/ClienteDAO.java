package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Cliente;

public class ClienteDAO {
    private String url;
    private String user;
    private String password;

    public ClienteDAO() {
        this.url = Conexao.getURL();
        this.user = Conexao.getUSER();
        this.password = Conexao.getPASSWORD();
    }

    public boolean inserirCliente(Cliente cliente) throws Exception {
        String sql = "INSERT INTO cliente(nome, idade) VALUES (?, ?);";
        try {
            Connection conexao = DriverManager.getConnection(this.url, this.user, this.password);
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setInt(2, cliente.getIdade());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        return true;
    }

}
