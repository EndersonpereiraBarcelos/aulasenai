package Exercicios.orientacaoObjeto.banco;

public class Conta {

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

    void tranferir(Double valorDeSaque, Conta destinatario){
        if (this.verificarSaque(valorDeSaque)){
            this.sacar(valorDeSaque);
        }
    }

    public static void main(String[] args) {
        Conta Conta1 = new Conta();
        Conta Conta2 = new Conta();

        Conta1.nomeDoTitula = "Enderson";
        Conta1.depositar(1000.00);
        Conta2.nomeDoTitula = "Ana";
        Conta2.depositar(1000.00);



    }

}