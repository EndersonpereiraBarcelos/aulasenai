package model;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

     
    public void  setcnpj(String cnpj){
        this.cnpj = cnpj;

    }
    
    public String getcnpj(){
        return cnpj;
    }
    
}
