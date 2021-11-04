package AttAvaliativo.AppBanco;

public class Conta {
    String ClienteTitular;
    int numero;
    double saldo = 0;
    int tipo;

    
    void deposito(double quantidade){

        this.saldo = saldo += quantidade;

        System.out.println(this.saldo);
    }
   /*
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

        */

    void setAlteraTitular(String ClienteTitular){
        this.ClienteTitular = ClienteTitular;
    }


    void getTitular(){
        System.out.println(this.ClienteTitular);
    }

    void setAlteraNumero(int numero){
        this.numero = numero;

    }

    void getNumero(){
        System.out.println(this.numero);

    }

    void setAlteraTipo(int tipo){
        this.tipo = tipo;

    }


public static void main(String[]args){
    Cliente perfil1 = new Cliente("Enderson ", "Pereira Barcelos", 123456789, "Vitória", 900);
    

  perfil1.getDadosCliente();
  perfil1.getDeposito(600);

    }
    
}
