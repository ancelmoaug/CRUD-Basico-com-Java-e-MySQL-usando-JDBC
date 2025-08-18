package controller;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteController {

    private ClienteDAO dao;

    public ClienteController() {
        this.dao = new ClienteDAO();
    }

    // insert
    public boolean inserirCliente(String nome, int idade) throws Exception{
        Cliente cliente = new Cliente(nome, idade);

        try {
            dao.inserirCliente(cliente);
        } catch (Exception e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
        return true;
    }

}
