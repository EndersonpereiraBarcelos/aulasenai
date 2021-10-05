package orientacaoObjeto;
public class ContaBanco {

    

        String nome;
        int numero;
        String agencia;
        double saldo;
        String dataabertura;
        double valordepositado;//gabiarra ln:74

        void setNome(String nome){
            this.nome = nome;

        }

        void getNome(){
            System.out.println(this.nome);

        }

        void setNumero(int numero){
            this.numero = numero;

        }

        void getNumero(){
            System.out.println(this.numero);

        }

        void setAgencia(String agencia){
            this.agencia = agencia;

        }

        void getAgencia(){
            System.out.println(this.agencia);

        }

        void setDataabertura(String dataabertura){
            this.dataabertura = dataabertura;


        }

        void getDataabertura(){
            System.out.println(this.dataabertura);
        }

        void setSaldo(double saldo){
            this.saldo = saldo;
        }

        void getSaldo(){
            System.out.println(this.saldo);
        }

        public void setSacar(double valorSacado){
            if(this.veriqueSaque(valorSacado)){
                this.saldo = this.saldo - valorSacado;
            }

        }
        boolean veriqueSaque(double valorASacar){
            if(this.saldo >= valorASacar){
                return true;
            }else{
                return false;
            }
        }

        public void depositar (double valordepositado){
            this.saldo = this.saldo + valordepositado;
        }

        public void CalcularRendimento(){
            this.valordepositado = this.saldo * 0.1;

        }  
        
        
        public static void main(String[]args){
            
            ContaBanco perfilbanco = new ContaBanco();
            
            perfilbanco.setNome("Enderson");
            perfilbanco.getNome();

            perfilbanco.setNumero(5523);
            perfilbanco.getNumero();;

            perfilbanco.setAgencia("picpay");
            perfilbanco.getAgencia();

            perfilbanco.setSaldo(1500);
            perfilbanco.getSaldo();

            perfilbanco.setDataabertura("Maio");
            perfilbanco.getDataabertura();
            
            
            
            
            
        }
}
