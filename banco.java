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
    

    public static void main(String[]args){
        banco perfilBanco = new banco();
        banco perfilCliente = new banco();

        //perfil 1
        perfilBanco.titular="Enderson";
        perfilBanco.saldo=600;

        //sacar dinheiro
        perfilBanco.saca(200);

        //depositar 
        perfilCliente.depositar(500);

        //perfil 2
        perfilCliente.titular = "Ana";
        perfilCliente.saldo = 500;

        System.out.println(perfilBanco.titular);
        System.out.println("Saldo da Conta R$: " + perfilBanco.saldo);

        System.out.println(perfilCliente);
        System.out.println("Saldo da conta R$: "  + perfilCliente.saldo);


    }
    
}
