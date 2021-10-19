import java.util.Scanner;

public  class  ElevadorFunction {

    public  static  void  main ( String [] args ) {
    Scanner sc = new Scanner(System.in);
    Elevador pessoa = new Elevador();

    int opcao = 6;
    while(opcao !=6){
        System.out.println("Digite o que deseja fazer\n1 - Entrar uma pessoa\n2 - Sair pessoa\n3 - Subir\n4 - Descer\n5 - inicializar elevador ");
        opcao = sc.nextInt();

        switch(opcao){
            case 1:
            pessoa.entra();
            break;
        case 2:
            pessoa.sai();
            break;
        case 3:
            pessoa.sobe();
            break;
        case 4:
            pessoa.desce();
            break;
        case 5:
        
        int capacidademaxima;
            pessoa.inicializa(10,9);
            break;

            case 6:
                
            }

        }

    }
    
}
