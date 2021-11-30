package model;

public class PessoaFisica extends Pessoa {
    
    private String cpf;

     
    public void  setcpf(String cpf){
        this.cpf = cpf;

    }
    
    public String getcpf(){
        return cpf;
    }

}
