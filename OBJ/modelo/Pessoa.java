package modelo;

import modelo.Polifornismo.IPessoa;

public class Pessoa implements IPessoa {
    

    private String nome;

    
    public void  setNome(String nome){
        this.nome = nome;

    }
    
    public String getNome(){
        return nome;
    }


}
