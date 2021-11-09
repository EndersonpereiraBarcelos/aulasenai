package AttAvaliativo.AppBanco;
public class Conta {

    Cliente Titular;
    int numero;
    double saldo;
    int tipo;
    

    public Conta(Cliente Titular, int numero, double saldo, int tipo){

        this.Titular = Titular;
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;

    }

    public void alteraTitulo(Cliente Titular){
        this.Titular = Titular;

    }

    public void alteraNumero(int numero){
        this.numero = numero;

    }

    public void alteratipo(int tipo){

    }
/*
    public String getTitular(){
        return = this.Titular;
    }
    */

    public int getNumero(){

        return this.numero;
    }

    public int getTipo(){

        return this.tipo;
    }


    public void main(String [] agrs){

        Cliente Enderson = new Cliente("Enderson ", "Barcelos", "123.456.789.90", "Vitória");

        Enderson.dadosCliente();
    }
}
