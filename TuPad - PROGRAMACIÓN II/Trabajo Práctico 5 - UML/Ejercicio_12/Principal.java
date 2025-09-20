
package Ejercicio_12;


public class Principal {
    public static void main(String[] args) {
    
        Contribuyente contribuyente = new Contribuyente ("Melisa ddq","27-55577788-6");
        Impuesto impuesto = new Impuesto(500);
        Calculadora calculadora = new Calculadora();
    
        
        
        impuesto.setContribuyente(contribuyente);
        impuesto.mostrarContribuyente();
        calculadora.calcular(impuesto);
        
    
        
        
    }

}
