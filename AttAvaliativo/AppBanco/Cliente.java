package AttAvaliativo.AppBanco;

public class Cliente {

    String nome;
    String sobrenome;
    int cpf;
    String endereco;

    void setAlteraNome(String nome){
        this.nome = nome;

    }

    void setAlteraSobrenome(String sobrenome){
        this.sobrenome = sobrenome;

    }

    void setAlteraCpf(int cpf){
        this.cpf = cpf;

    }

    void setAlteraEndereco(String endereco){
        this.endereco = endereco;

    }

    void getNome(){
        System.out.println("Nome completo: " + this.nome + this.sobrenome);

    }

    void getCpf(){
        System.out.println("CPF: " + this.cpf);

    }

    void getEndereco(){
        System.out.println("Endereço: " + this.endereco);
    }
    
}
