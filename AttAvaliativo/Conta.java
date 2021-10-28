package AttAvaliativo;

public class Conta {
    String ClienteTitular;
    int numero;
    double saldo = 0;
    int tipo;
    
    void setAlteraTitular(String ClienteTitular){
        this.ClienteTitular = ClienteTitular;
    }


    void getTitular(){
        System.out.println(this.ClienteTitular);
    }

    void setAlteraNumero(int numero){
        this.numero = numero;

    }

    void getNumero(){
        System.out.println(this.numero);

    }

    void setAlteraTipo(int tipo){
        this.tipo = tipo;

    }

public static void main(String[]args){
    Cliente perfilcliente = new Cliente();

    perfilcliente.setAlteraNome("Enderson");
    perfilcliente.setAlteraSobrenome("Pereira Barcelos");
    perfilcliente.setAlteraCpf(12345678);
    perfilcliente.setalteraEndereco("praca 8");

    perfilcliente.getNome();
   // perfilcliente.getSobrenome();
    perfilcliente.getCpf();
    perfilcliente.getEndereco();

 
    perfilcliente.setSaldo(500);
    perfilcliente.getSaldo();
  

    }
    
}
