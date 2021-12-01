package modelo;

import Polifornismo.IPessoa;

public class PessoaFisica extends Pessoa implements IPessoa {
    
    private String cpf;

     
    public void  setcpf(String cpf){
        this.cpf = cpf;

    }
    
    public String getcpf(){
        return cpf;
    }

}
