package AttAvaliativo.AppBanco;

public class Conta {
    
    String ClienteTitular;
    int numero;
    double saldo = 0;
    int tipo;



    public static void main(String [] args){

        Cliente perfilCliente = new Cliente();

        perfilCliente.setAlteraNome("Enderson Pereira Barcelos");
        perfilCliente.setAlteraCpf(123456789);
        perfilCliente.setAlteraEndereco("José cupertino");

        perfilCliente.getNome();
        perfilCliente.getCpf();
        perfilCliente.getEndereco();
    }
}
