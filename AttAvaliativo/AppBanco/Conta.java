package attAvaliativo;

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
    Cliente perfil1 = new Cliente();

  perfil1.setAlteraNome("Ana");
  perfil1.setAlteraSobrenome(" Alves");
  perfil1.setAlteraCpf(12345678);
  perfil1.setalteraEndereco("Praça 8");

  perfil1.getNome();
  perfil1.getCpf();
  perfil1.getEndereco();
  perfil1.getdeposito(600);
 
   
    
    
    }
    
}
