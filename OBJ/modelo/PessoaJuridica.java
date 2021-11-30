package modelo;

import modelo.Polifornismo.IPessoa;

public class PessoaJuridica extends Pessoa implements IPessoa{

    private String cnpj;

     
    public void  setcnpj(String cnpj){
        this.cnpj = cnpj;

    }
    
    public String getcnpj(){
        return cnpj;
    }
    
}
