package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("\nCliente salvo no sistema de CRM:");
        System.out.println("Cliente: " + nome);
        System.out.println("Cep: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estaado: " + estado);
    }
}
