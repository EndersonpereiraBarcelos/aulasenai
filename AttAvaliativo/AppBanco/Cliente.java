package AttAvaliativo.AppBanco;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String endereço;

    //Contrututor
    public Cliente(String nome, String sobrenome, String cpf, String endereço){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereço = endereço;
    }

    //SET
    public void alterarNome(String nome){
        this.nome = nome;

    }

    public void alterarSobrenome(String sobrenome){
        this.sobrenome = sobrenome;


    }

    public void alterarCpf(String cpf){
        this.cpf = cpf;

    }

    public void alterarEndereço(String endereço){
        this.endereço = endereço;

    }

    //GET

    public void getNome(){
        System.out.println("Nome completo " + this.nome + this.sobrenome);

    }

    public void getCpf(){
        System.out.println("CPF: " + this.cpf);
    }

    public void getEndereço(){
        System.out.println("Endereço: " + this.endereço);
    }

    public void dadosCliente(){

        System.out.println("Nome completo " + this.nome + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereço);

    }

    
}
 
