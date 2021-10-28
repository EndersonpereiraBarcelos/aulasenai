package Exercicios.orientacaoObjeto.aluno;

class Aluno2 {

    private  String nome;
    private int matricula;
    private String situacao;

    void setNome(String nome){
        this.nome = nome;

    }

    void getNome(){
        System.out.println(this.nome);
    }

    void setMatricula(int matricula){
        this.matricula = matricula;

    }

    void getMatricula(){
        System.out.println(this.matricula);

        

    }

    void getSituacao(){
        System.out.println(this.situacao);
    }

    private String calculaMedia(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3);

        if(media >= 6){
            return " aprovado";
        }else{
            return "reprovado";
        }

    }
    
    void situacao(double nota1, double nota2, double nota3){
        this.situacao = calculaMedia( nota1,  nota2,  nota3);

    } 
    void getDetalhes(){
        getNome();
        getMatricula();
        getSituacao();
    }

}
