package modelo.Polifornismo;
import modelo;
import abstrata;

public class IPessoa extends interagir{

    private String endereço;

    public void  setendereço(String endereço){
        this.endereço = endereço;

    }
    
    public String getendereço(){
        return endereço;
    }

       
    
}