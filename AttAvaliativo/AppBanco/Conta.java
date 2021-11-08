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
}
