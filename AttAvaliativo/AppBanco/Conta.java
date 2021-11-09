package AttAvaliativo.AppBanco;
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

        this.saldo = this.saldo + valorDeposito;

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
        System.out.println("Saldo: " + this.saldo);


    }


    
  public static void main(String[] args) {
      
    Cliente Enderson = new Cliente("Enderson ", "Barcelos", "123.456.789.87", "vitória");

    Enderson.dadosCliente();

    Enderson.alterarNome("Paula ");
    Enderson.getNome();
    Enderson.alterarSobrenome("Bissoli");
    
  }
}
