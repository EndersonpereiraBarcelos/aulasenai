package AttAvaliativo.AppBanco;
public class Cliente {

    String nome;
    String sobrenome;
    int cpf;
    String endereco;
    double saldo = 0;


    public Cliente(String nome, String sobrenome, int cpf, String endereco, double saldo){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.saldo = saldo;

    }
    void getNome(){
        System.out.println("Nome Completo : " + this.nome + this.sobrenome);
    
    }   

    void getCpf(){
        System.out.println("CPF: " +this.cpf);
    }


    void  getEndereco(){
        System.out.println("Endereco: " + this.endereco);
    }

/*
    void getDeposito(double quantidade){

        this.saldo = saldo += quantidade;

        System.out.println(this.saldo);
    }
*/

public void setSacar(double valorSacado){
    if(this.veriqueSaque(valorSacado)){
        this.saldo = this.saldo - valorSacado;
    }

}

boolean veriqueSaque(double valorASacar){
    if(this.saldo >= valorASacar){
        return true;
    }else{
        return false;
    }
}
    void getDadosCliente(){
        System.out.println("Nome Completo : " + this.nome + this.sobrenome);
        System.out.println("CPF: " +this.cpf);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Saldo: " + this.saldo);
    }
    
    
}
