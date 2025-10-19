
package tp7.herenciaypolimorfismo.CasoPractico2;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
    
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();        


        figuras.add(new Rectangulo( 10.0, 5.2, "Rectángulo A"));
        figuras.add(new Circulo( 7.16, "Círculo B"));
        figuras.add(new Circulo(3.5, "Círculo C"));
        figuras.add(new Rectangulo(3.1, 6, "Cuadrado D"));

        
        
        System.out.println("---- CÁLCULO DE AREAS DEL ARRAY ----");
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área del " + figura.getNombre() + ": " + figura.calcularArea());
            
        }
        
     
        
}
}