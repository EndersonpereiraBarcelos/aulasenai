package Exercicios.orientacaoObjeto.banco;
public class banco {

        String titular;
        int numeroConta;
        double saldo;

        boolean saca(double valor){
            if(this.saldo < valor){
                return false;
            }else{
                this.saldo = this.saldo - valor;
                return true;
            }
        }

        void depositar(double quantidade){
            this.saldo += quantidade;
        }

        boolean transfere(banco destino, double valor){
            boolean retirou = this.saca(valor);
            if(retirou == false){
                return false;
            }else {
                destino.depositar(valor);
                return true;
            }
        }
    

    public static void main(String[]args){
        banco perfilBanco = new banco();
        banco perfilCliente = new banco();

        //perfil 1
        perfilBanco.titular="Enderson";
        perfilBanco.saldo=400;

        
        //sacar dinheiro perfilBanco
        //perfilBanco.saca(200);
        if(perfilBanco.saca(200)){
            System.out.println("Consegui Sacar");
        }else {
            System.out.println("Não consegui sacar");
        }

        //depositar  perfil Banco
        perfilBanco.depositar(0);

        //perfil 2
        perfilCliente.titular = "Ana";
        perfilCliente.saldo = 500;

        //Sacar perfil cliente
        if(perfilCliente.saca(200)){
            System.out.println("Consegui Sacar");
        }else {
            System.out.println("Não consegui sacar");
        }

        System.out.println(perfilBanco.titular);
        System.out.println("Saldo da Conta R$: " + perfilBanco.saldo);

        //System.out.println(perfilCliente);
        //System.out.println("Saldo da conta R$: "  + perfilCliente.saldo);


    }
    
}
