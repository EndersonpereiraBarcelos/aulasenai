package AttAvaliativo.AppBanco;
import AttAvaliativo.AppBanco.Cliente;
public class Conta {

    String Clientetitular;
    int numero;
    double saldo;
    int tipo;

    public Conta(String Clientetitular, int numero, double saldo){

        this.Clientetitular = Clientetitular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void Deposito(double valorDeposito){

        this.saldo = saldo + valorDeposito;

    }

    public void alteraTitular(Cliente titular){

    }
    
    public void getTitular(){
        System.out.println(this.Clientetitular);

    }

    public void getNumero(){

        System.out.println(this.numero);
    }

    public void getSaldo(){
        System.out.println(this.saldo);
    }


    public void dadosConta(){
        
        System.out.println("Titular: " + this.Clientetitular);
        System.out.println("Numero: " + this.numero);
        //System.out.println("Saldo: " + this.saldo);


    }


    
  public static void main(String[] args) {
      
    Cliente PerfilCliente = new Cliente("Enderson ", "Barcelos", "123.456.789.87", "vitória");

    //PerfilCliente.dadosCliente();

    PerfilCliente.alterarNome("Paula ");
    //PerfilCliente.getNome();
    PerfilCliente.alterarSobrenome("Bissoli");

    Conta perfilConta = new Conta("José", 459, 500);
    perfilConta.dadosConta();
    
    perfilConta.Deposito(500);
    perfilConta.getSaldo();

    
    
  }
}
