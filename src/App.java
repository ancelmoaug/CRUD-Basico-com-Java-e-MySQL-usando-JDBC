import java.util.ArrayList;

import controller.ClienteController;
import model.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        ClienteController clientController = new ClienteController();

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Victor Hugo Teixeira de Carvalho", 19));
        clientes.add(new Cliente("Lucas Medrado Santos", 20));
        clientes.add(new Cliente("Anna Clara Barbos Soares", 19));

        for(Cliente c : clientes) {
            try {
                clientController.inserirCliente(c.getNome(), c.getIdade());
            } catch (Exception e) {
                System.out.println("Erro ao inserir " + c.getNome() + ": " + e.getMessage());
            }
        }

    }
}
