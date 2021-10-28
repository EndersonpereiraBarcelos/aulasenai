package Exercicios.orientacaoObjeto.elevador;


public class Elevador {
    //atributos
    int totaldeAndares;
    int andarAtual;
    int capacidadeMaxima;
    int capacidadeAtual;
 
    
    //métodos
    Elevador(int capacidadeMaxima, int totaldeAndares){
        this.capacidadeMaxima = capacidadeMaxima;
        this.totaldeAndares = totaldeAndares;
        this.capacidadeAtual = 0;
        this.andarAtual = 0;
        
    }
    
    void entra(){
        
        if(this.capacidadeAtual < this.capacidadeMaxima){
            this.capacidadeAtual = this.capacidadeAtual + 1;
        }else{
            System.out.println("Capacida máxima já atingida");
        }
    }
    
    void sai(){
        if(this.capacidadeAtual > 0){
            this.capacidadeAtual--;
        }else{
            System.out.println("Não há nínguem para sair");
        }
    }
    
    void sobe(){
        if(this.andarAtual < this.totaldeAndares && this.capacidadeAtual > 0){
            this.andarAtual++;
        }else{
            System.out.println("Já se encontra no último andar OU não existe pessoas no elevador");
        }
    }
    
    void sobeChamada(){
        if(this.andarAtual < this.totaldeAndares){
            this.andarAtual++;
        }else{
            System.out.println("Já se encontra no último andar");
    }
    }
    
    void desce(){
        if(this.andarAtual > 0 && this.capacidadeAtual > 0){
            this.andarAtual--;
        }else{
            System.out.println("Já se encontra no primeiro andar OU não existe pessoas no elevador");
        }
    }
    
    void desceChamada(){
        if(this.andarAtual > 0){
            this.andarAtual--;
        }else{
            System.out.println("Já se encontra no primeiro andar");
    }
    }
    
    void getCapacidadeAtual(){
        System.out.println(this.capacidadeAtual);
    }
    
    void getAndarAtual(){
        System.out.println(this.andarAtual);
    }
    
    void getCapacidadeMaxima(){
        System.out.println(this.capacidadeMaxima);
    }
    
    void getTotalDeAndares(){
        System.out.println(this.totaldeAndares);
    }
    
    void getSituacao(){
        System.out.print("Andar atual: ");
        getAndarAtual();
        System.out.print("Capacidade Atual: ");
        getCapacidadeAtual();
    }
    
    void chamarElevador(int andar){
        int diferenca = andar - this.andarAtual;
        if(diferenca > 0){
            for(int i = 1; i <= diferenca; i++){
                this.sobeChamada();
            }
        }else if(diferenca < 0){
            diferenca = diferenca*(-1);
            for(int i = 1; i <= diferenca; i++){
                this.desceChamada();
            }
        }else{
            System.out.println("Elevador já encontra no andar");
        }
    }
}