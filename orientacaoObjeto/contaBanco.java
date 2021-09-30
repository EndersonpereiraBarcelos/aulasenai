public class contaBanco {

    class bancoConta{

    int numeroDaConta;
    String nomeDoTitula;
    Double saldo = 0.0;

    void setNomeDoTitula(String nomeDoTitula){
        this.nomeDoTitula = nomeDoTitula;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void depositar(Double valorDoDeposito){
        this.saldo = this.saldo + valorDoDeposito;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    void sacar(Double valorDeSacado){
        if (this.verificarSaque(valorDeSacado)){
            this.saldo = this.saldo - valorDeSacado;
        }
    }


    boolean verificarSaque(Double valorHaSacar){
        if (this.saldo >= valorHaSacar){
            return true;
        }else{
            return false;
        }
    }

    void tranferir(Double valorDeSaque,bancoConta destinatario){
        if (this.verificarSaque(valorDeSaque)){
            this.sacar(valorDeSaque);
        }
    }
}
    public static void main(String[] args) {
      
        bancoConta conta1 = new bancoConta();
        bancoConta conta2 = new bancoConta();

        conta1.nomeDoTitula = "Enderson";
        conta1.depositar(1000.00);
        //conta2.nomeDoTitula = "Julia";
        conta2.depositar(1000.00);



    }

}