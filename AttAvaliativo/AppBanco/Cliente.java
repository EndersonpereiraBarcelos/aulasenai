package attAvaliativo;

public class Cliente {

    String nome;
    String sobrenome;
    int cpf;
    String endereco;
    double saldo = 0;
 

    void setAlteraNome(String nome){
        this.nome = nome;

    }

    void setAlteraSobrenome(String sobrenome){
        this.sobrenome = sobrenome;

    }

    void setAlteraCpf(int cpf){
        this.cpf = cpf;

    }

    void setalteraEndereco(String endereco){
        this.endereco = endereco;

    }

    void getNome(){
        System.out.println("Nome Completo : " + this.nome + this.sobrenome);
    
    }   

    /*
    void getSobrenome() {
        System.out.println("Sobrenome: " + this.sobrenome);
    
    }
        */
    void getCpf(){
        System.out.println("CPF: " +this.cpf);
    }


    void  getEndereco(){
        System.out.println("Endereco: " + this.endereco);
    }

    /*
    public void getSaldo(){
        //System.out.println("Saldo: "+this.saldo);
    }
    */
    void getdeposito(double quantidade){

        this.saldo = saldo += quantidade;

        System.out.println(this.saldo);
    }
    
    
}
