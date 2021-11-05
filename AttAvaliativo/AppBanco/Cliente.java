package attAvaliativo;

public class Cliente {

    String nome;
    String sobrenome;
    String cpf;
    String endereco;
    double saldo;


    public Cliente (String nome, String sobrenome, String cpf, String endereco){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;

    }
    void Nome(){

        System.out.println("Nome Completo : " + this.nome + this.sobrenome);
    
    }   

    void Cpf(){

        System.out.println("CPF: " +this.cpf);

    }

    void Endereco(){

        System.out.println("Endereco: " + this.endereco);

    }

    void Deposito(double quantidade){

        this.saldo = saldo += quantidade;

    }
    
    void Sacar(double quantidade) {

        double	novoSaldo =	this.saldo - quantidade;	
        this.saldo = novoSaldo;
        System.out.println("Saldo atual: "+ this.saldo);

    }
    
    void Saldo(){

        System.out.println("Saldo: " + this.saldo);
    }

    public void transfere(Conta destino, double valor){

        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }

    

    void getDadosCliente(){

        System.out.println("Nome Completo : " + this.nome + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco);
       
    }

}
