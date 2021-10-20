import java.util.Scanner;
public  class  ElevadorResult {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int capacidadeMaxima = 0;
            int totaldeAndares = 0;
            System.out.print("Digite a capacidade máxima do elevador: ");
            capacidadeMaxima = scanner.nextInt();
            System.out.print("Digite o total de andares: ");
            totaldeAndares = scanner.nextInt();
                      
                       
            Elevador elevador = new Elevador(capacidadeMaxima, totaldeAndares);
           
           int opcao = 0;
           
           
           while(opcao != 6){
               System.out.print("Digite o que deseja fazer:\n1 - Entrar pessoa\n2 - Sair pessoa\n3 - Subir\n4 - Descer\n5 - Chamar elevador\n6 - Sair\nOpção desejada: ");
               opcao = scanner.nextInt();
               
               switch(opcao){
                   case 1:
                       elevador.entra();
                       elevador.getSituacao();
                       break;
                   case 2:
                       elevador.sai();
                       elevador.getSituacao();
                       break;
                   case 3:
                       elevador.sobe();
                       elevador.getSituacao();
                       break;
                   case 4:
                       elevador.desce();
                       elevador.getSituacao();
                       break;
                   case 5:
                       System.out.println("Qual andar desejado: ");
                       int andar = scanner.nextInt();
                       elevador.chamarElevador(andar);
                       elevador.getSituacao();
                       break;
                   case 6:
                       System.out.println("Obrigado por usar nosso elevador");
                       break;
                   default:
                       System.out.println("Opção inválida");
               }
           }
           
    }
        
}