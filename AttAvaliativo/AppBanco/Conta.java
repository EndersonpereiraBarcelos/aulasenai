package AttAvaliativo.AppBanco;

public class Conta {

    String Clientetitular;
    int numero;
    double saldo;
    int tipo;

    enum tiposcontas {
        contaCorrente,
        contaPoupanca;
    }

    public Conta(String Clientetitular, int numero, double saldo){

        this.Clientetitular = Clientetitular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void Deposito(double valorDeposito){

        this.saldo = saldo + valorDeposito;

    }

    public boolean saca(double sacaValor){
        if(verificaSaca(sacaValor)){
            this.saldo = this.saldo - (sacaValor * contaTaxa());
            return true;
        }else{
            return false;
        }

    }

    public boolean verificaSaca(double sacaValor){
        if((sacaValor * contaTaxa()) <= this.saldo){
            return true;

        }else{
                
            return false;
        }

    }

    public double contaTaxa(){
        if (this.tipo == tiposcontas.contaPoupanca){
            return 1.1;
        }else{
            return 1.0;
        }
    }

    public void alteraTipo(String tipo) {
        if (tipo.equalsIgnoreCase("cC")){
            this.tipos = tiposcontas.contaCorrente;
        }else if(tipo.equalsIgnoreCase("cP")){
            this.tipo = tiposcontas.contaPoupanca;
        }
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

     public tiposcontas getTipo() {
        return tiposcontas;
    }


    public void dadosConta(){
        
        System.out.println("Titular: " + this.Clientetitular);
        System.out.println("Numero: " + this.numero);
        //System.out.println("Saldo: " + this.saldo);


    }

    
  public static void main(String[] args) {
      
    Cliente PerfilCliente = new Cliente("Enderson ", "Barcelos", "123.456.789.87", "vitória");

    PerfilCliente.dadosCliente();

    
  }
}
