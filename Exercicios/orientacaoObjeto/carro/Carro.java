package Exercicios.orientacaoObjeto.carro;
public class Carro{


    String marca;
    String modelo;
    int ano;
    double quilometragem;
    double velocidade;
    String estado;
    
    

    void setMarca(String marca){
        this.marca = marca;


    }

    void getMarca(){
        System.out.println("Marca do veiculo: " + this.marca);

    }

    void setModelo(String modelo){
        this.modelo = modelo;

    }

    void getModelo(){
        System.out.println("Modelo do veiculo: "+ this.modelo);

    }

    void setAno(int ano){
        this.ano = ano;

    }

    void getAno(){
        System.out.println("Ano do veiculo: " + this.ano);


    }

    void setQuilometragem(double quilometragem){
        this.quilometragem = quilometragem;

    }

    void getQuilometragem(){
        System.out.println("Quilometragem do veiculo: "+this.quilometragem);

    }

    void setVelocidade(double velocidade){
        this.velocidade = velocidade;

    }

    void getVelocidade(){
        System.out.println("A velocidade do veiculo: "+this.velocidade);

    }

    void setEstado(String estado){
        this.estado = estado;

    }

    void getEstado(){
        System.out.println("O veiculo se está ligado ou não: " +this.estado);
    }

    



    public static void main(String[]args){

        Carro perfilCliente = new Carro();

        perfilCliente.setMarca("Honda");
        perfilCliente.getMarca();

        perfilCliente.setModelo("XRE");
        perfilCliente.getModelo();

        perfilCliente.setAno(2020);
        perfilCliente.getAno();

        perfilCliente.setQuilometragem(0);
        perfilCliente.getQuilometragem();

        perfilCliente.setVelocidade(120);
        perfilCliente.getVelocidade();

        perfilCliente.setEstado("ligado");
        perfilCliente.getEstado();

            
       
    }


}
