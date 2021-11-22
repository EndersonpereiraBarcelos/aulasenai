package AttAvaliativo.AppBanco;
public class Conta {
    private Cliente titular;
    private int numero;
    private double saldo;
    private tipos tipo;
    enum tipos {
        contaCorrente,
        contaPoupanca;
    }

    public Conta(Cliente titular, int numero, double saldo, String tipo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        if (tipo.equalsIgnoreCase("cC")){
            this.tipo = tipos.contaCorrente;
        }else if(tipo.equalsIgnoreCase("cP")){
            this.tipo = tipos.contaPoupanca;
        }
    }

    public boolean deposita(double valorDeposita){
        if (valorDeposita > 0){
            this.saldo = this.saldo + valorDeposita;
            return true;
        }else{
            return false;
        }
    }

    public Boolean saca(double valorSaca){
        if (verificacao(valorSaca)){
            this.saldo = this.saldo - (valorSaca * taxaConta());
            return true;
        }else{
            return false;
        }
    }

    public boolean verificacao(double valorSaca){
        if ((valorSaca * taxaConta()) <= this.saldo){
            return true;
        }else{
            return false;
        }
    }

    public double taxaConta(){
        if (this.tipo == tipos.contaPoupanca){
            return 1.1;
        }else{
            return 1.0;
        }
    }

    public void alteraTitular(Cliente titular) {
        this.titular = titular;
    }

    public void alteraNumero(int numero) {
        this.numero = numero;
    }

    public void alteraTipo(String tipo) {
        if (tipo.equalsIgnoreCase("cC")){
            this.tipo = tipos.contaCorrente;
        }else if(tipo.equalsIgnoreCase("cP")){
            this.tipo = tipos.contaPoupanca;
        }
    }

    public boolean transfere(Conta contaDestino, double valorTranferencia){
        if (verificacao(valorTranferencia)){
            this.saca(valorTranferencia);
            return true;
        }else{
            return false;
        }
    }

    public String getTitular() {
        return this.titular.getNome() + " " + this.titular.getSobrenome();
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public tipos getTipo() {
        return tipo;
    }

    public String getConta(){//accountData
        String dadosConta ="Titular: " + getTitular() +
                "\nNumero da conta: " + getNumero() +
                "\nSaldo da conta: " + getSaldo() +
                "\nTipo da conta: " + getTipo() + "\n\n";

        return dadosConta;
    }
}