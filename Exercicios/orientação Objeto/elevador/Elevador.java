public class Elevador {
 
    int totalAndares;
    int andaratual;
    int capacidademaxima;
    int capacidadeatual;

    void inicializa( int capacidademaxima,int totalAndares ){
        this.capacidademaxima = capacidademaxima;
        this.totalAndares = totalAndares;
        this.capacidadeatual = 0;
        this.andaratual = 0; 

    }

    void entra(){
        if(this.capacidadeatual < this.capacidademaxima){
        this.capacidadeatual++;

        }else{
            System.out.println("capacidade maxima");
        }
    }

    void sai(){
        if(this.capacidadeatual > 0){
        this.capacidadeatual--;
    }else{
        System.out.println("Nao a pessoa para sair");
    }

    }

    void sobe(){
        if(this.andaratual < this.totalAndares){ 
        this.andaratual++;

        }else{
            System.out.println("Ja se encontra no ultimo andar");
        } 
    }

    void desce(){
        if(this.andaratual >0){
            this.andaratual--;
        }
    }

    void gedCapacidadeAtual(){
        System.out.println(this.capacidadeatual);
    }

    void getAndarAtual(){
        System.out.println(this.andaratual);
    }

    void getCapacidadeMaxima(){
        System.out.println(this.totalAndares);
    }
}
