public class Elevador {
    
    int andarAtual;
    int totalAndaresPredio = 15;
    int capacidadeElevador = 120;
    int totalPessoaElevador;
    
    void setInicializar(int capacidadeElevador, int totalAndaresElevador){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndaresPredio = totalAndaresPredio;
    }
    void getInicializar(){
        System.out.println("Peso maximo elevador é " + this.capacidadeElevador);
        System.out.println("Total de andadres " + this.totalAndaresPredio);
    }
    
    
    void getEntra(){
        if(totalPessoaElevador <= 15){
            System.out.println("Elevador Disponivel");
            for(int totalPessoaElevador = 1; totalPessoaElevador <= 15;totalPessoaElevador++){
                
            }
            
        }else{
            System.out.println("Elevador indisponivel");
        }

    
    }
}
