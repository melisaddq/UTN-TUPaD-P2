
package Ejercicio5;


public class Principal {
    public static void main(String[] args) {
        
    Computadora computadora = new Computadora ("Samsung","070070007", "MSI MPG ","B550");    
        
    Propietario propietario = new Propietario ("Carlitos Jara", "35.555.244");    
        
    propietario.setComputadora(computadora);
    
    
    System.out.println("---- DESDE PROPIETARIO -----");    
    System.out.println(propietario.toString());
        
    System.out.println("---- DESDE COMPUTADORA -----");   
    System.out.println(computadora.toString());
        
    }
}
