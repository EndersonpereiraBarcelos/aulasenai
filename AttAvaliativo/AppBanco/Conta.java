package AttAvaliativo.AppBanco;
public class Conta {

    Cliente Titular;
    int numero;
    double saldo;
    int tipo;
    

  public static void main(String[] args) {
      
    Cliente Enderson = new Cliente("Enderson ", "Barcelos", "123.456.789.87", "vitória");

    Enderson.dadosCliente();

  }
}
