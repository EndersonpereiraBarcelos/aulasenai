import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class javaBasico {

    public static void main(String[]args) {
        
        
        PessoaFisica pf = new PessoaFisica();
        
        pf.setNome("enderson");
        pf.setcpf("12312312");

        pf.getNome();
        pf.getcpf();

        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getcpf());


        PessoaJuridica pj = new PessoaJuridica();

        pj.setNome("Programas");
        pj.setcnpj("123456/123213");

        pj.getNome();
        pj.getcnpj();

        System.out.println("Nome Empresa: " + pj.getNome());
        System.out.println("Cnpj: " + pj.getcnpj());

    }
}