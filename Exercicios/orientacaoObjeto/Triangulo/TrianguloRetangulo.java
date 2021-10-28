package Exercicios.orientacaoObjeto.Triangulo;
public class TrianguloRetangulo {
    
    double catetoOposto;
    double catetoAdjacento;
    double hipotenusa;
    
    TrianguloRetangulo(double catetoOposto, double catetoAdjacente){
        this.catetoOposto = catetoOposto;
        this.catetoAdjacento = catetoAdjacento;
        
    }
    
      TrianguloRetangulo(double catetoOposto, double catetoAdjacente, double hipotenusa){
        this.catetoOposto = catetoOposto;
        this.catetoAdjacento = catetoAdjacento;
        this.hipotenusa = hipotenusa;
        
    }
    
      void calculo(double catetoOposto, double catetoAdjacente){
          double area = ( catetoOposto * catetoAdjacente) /2;
          System.out.println(area);
      }
      
      void calculo(double catetoOposto, double catetoAdjacente, double hipotenusa){
          double perimetro = ( catetoOposto * catetoAdjacente + hipotenusa) /2;
          System.out.println(perimetro);
      }
    
    
    
}
