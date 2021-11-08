package attAvaliativo;

public class Conta {

    String ClienteTitular;
    int numero;
    double saldo = 0;
    int tipo;
    double transferir;
    double Deposito;

    public Conta(String ClienteTitular, int numero, double saldo  ){
        this.ClienteTitular = ClienteTitular;
        this.numero = numero;
        this.saldo = saldo;
        //this.tipo = tipo;
        //this.sacar = sacar;

    }

    public void DadosConta(){
        System.out.println("Nome titular: "+this.ClienteTitular);
        //System.out.println("numero da conta: "+this.numero);
        System.out.println("Saldo: " + this.saldo);
        //System.out.println("Tipo da conta: " + this.tipo);

    }

    public void getSaldo(){
        System.out.println(this.saldo);
    }

    
    public void getTitular(){
        System.out.println(this.ClienteTitular);
    }

    public void getNumero(){
        System.out.println(this.numero);

    }

    public void Deposito(double quantidade){

        this.saldo = saldo += quantidade;

    }

    public void transferir(Conta Destino, double valorTransferir){
        if(valorTransferir <= this.saldo){
            this.Deposito = Deposito += valorTransferir;
            System.out.println("Valor transferido");
        }else{
            System.out.println("Valor nao transferido");
        }
    }
public static void main(String[]args){

    Cliente Enderson = new Cliente("Enderson ", "Barcelos", "123456", "Vitoria");
    //Cliente George = new Cliente("Geoge ", "silva", "9019090090", "Centro");
    //Conta Emerson = new Conta("Emerson", 9012, 1000);
    //Conta Scyhteer = new Conta("Syctheer", 9012, 1000);
    //Conta wanderson = new Conta("wanderson", 912, 1000);

    Enderson.DadosCliente();
    //George.DadosCliente();
    //Emerson.DadosConta();
    //Scyhteer.DadosConta();  

   //Enderson.transferir(Emerson, 200);
   //Emerson.transferir(Scyhteer, 500);
   //Emerson.getSaldo();
   //Scyhteer.getSaldo();

   //Enderson.sacar(200);
   Enderson.saldo(400);
   
   Enderson.Deposito(600);
    
   Enderson.getsaldo();
    

    }
    
}
