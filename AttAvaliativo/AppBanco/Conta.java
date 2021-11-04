package AttAvaliativo.AppBanco;

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
    Cliente perfil1 = new Cliente("Enderson ", "Pereira Barcelos", 123456789, "Vitória", 400);
    

  perfil1.getDadosCliente();
  //perfil1.getDeposito(600);

  perfil1.setSacar(200);
  perfil1.veriqueSaque(200);
  


    }
    
}
