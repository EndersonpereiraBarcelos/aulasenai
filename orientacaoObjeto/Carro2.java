public class Carro2{


    String marca;
    String modelo;
    int ano;
    double quilometragem;
    double velocidade;
    boolean estado;
    String velocimetro;
    

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
        this.velocimetro = this.velocimetro + velocidade;

    }

    void getVelocidade(){
        System.out.println("A velocidade do veiculo: "+this.velocidade);

    }
/*
    vid soetEstado(String estado){
        this.estado = estado;

    }
    */
    void getEstado(){
        System.out.println("O veiculo se está ligado ou não: " +this.estado);
    }
 
    boolean ligar(){
        if(this.estado == false){
        this.estado = true;
        this.velocidade = 0;
        return true;
        
        }else{
            return false;
        }
    }

    void desligado(){

        this.estado = false;
        this.velocidade = 0;
        System.out.println("carro desligado");


    }

    void acelerar (double velocidade){
        if(this.estado = true){
            //this.velocidade = 
        }
    }

    public static void main(String[]args){

        Carro perfilCliente = new Carro();
        
        perfilCliente.setMarca("Nissan");
        perfilCliente.getMarca();

        perfilCliente.setModelo("Gtr");
        perfilCliente.getModelo();

        perfilCliente.setAno(2020);
        perfilCliente.getAno();

        perfilCliente.setQuilometragem(0);
        perfilCliente.getQuilometragem();

        perfilCliente.setVelocidade(220);
        perfilCliente.getVelocidade();

        //perfilCliente.setEstado("ligado");
        perfilCliente.getEstado();
   
    }


}
