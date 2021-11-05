package attAvaliativo;

public class Conta {
    String ClienteTitular;
    int numero;
    double saldo = 0;
    int tipo;
    double Sacar;

    public Conta(String ClienteTitular, int numero, double saldo, int tipo ){
        this.ClienteTitular = ClienteTitular;
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        //this.sacar = sacar;

    }

    public void getDadosConta(){
        System.out.println("Nome titular: "+this.ClienteTitular);
        System.out.println("numero da conta: "+this.numero);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("Tipo da conta: " + this.tipo);
        
    }

    void getSaldo(){
        System.out.println(this.saldo);
    }

    
    void getTitular(){
        System.out.println(this.ClienteTitular);
    }

    void getNumero(){
        System.out.println(this.numero);

    }
    
public static void main(String[]args){

    Cliente Enderson = new Cliente("Enderson ", "Barcelos", "123.456.780-9", "Vitória");
    Cliente Anna = new Cliente("Anna"," Soares", "123.456.789-0", "Centro");

    Enderson.getDadosCliente();
    Enderson.Deposito(500);
    Enderson.Saldo();
    //Enderson.Sacar(100);
    
    Anna.getDadosCliente();
    Anna.Deposito(500);
    Anna.Saldo();
    //Anna.Sacar(250);

   // Enderson.transfere(Anna, 150);

    }
    
}
