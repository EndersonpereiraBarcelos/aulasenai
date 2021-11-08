package attAvaliativo;

public class Cliente {

    String nome;
    String sobrenome;
    String cpf;
    String endereco;
    double saldo;
    double Deposito;

    public Cliente (String nome, String sobrenome, String cpf, String endereco){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        

    }
    /*
    void Nome(){

        System.out.println("Nome Completo : " + this.nome + this.sobrenome);
    
    }   

    void Cpf(){

        System.out.println("CPF: " +this.cpf);

    }

    void Endereco(){

        System.out.println("Endereco: " + this.endereco);

    }
*/

    public void sacar(double valorSacar){

        this.saldo = saldo -= valorSacar;
    }

    public void saldo(double saldo){
        System.out.println("Saldo: "+this.saldo);
    }
    public void getsaldo(){
        System.out.println(this.saldo);
    }
   
    public void Deposito(double quantidade){

        this.saldo = saldo += quantidade;

    }

    public void transferir(Conta Destino, double valorTransferir){
        if(valorTransferir <= this.saldo){
            this.Deposito = Deposito += valorTransferir;
            System.out.println(this.saldo);
        }else{
            System.out.println(this.saldo);
        }
    }






    void DadosCliente(){

        System.out.println("Nome Completo: " + this.nome + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco);
        //System.out.println("Saldo: " + this.saldo);
        //System.out.println("Valor transferido: "+this.transferir);
       
    }

}
 
