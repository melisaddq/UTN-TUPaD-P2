
package Ejercicio4;


public class Principal {
    public static void main(String[] args) {
        
    Banco provincia = new Banco("Provincia","30-45678988-7");
    Banco nacion = new Banco("Nación","30-112233445-7");
    
    
    
    Cliente carlos = new Cliente("Carlos López","23.555.777");
    Cliente analia = new Cliente("Analia Aranda","25.222.444");
    
    TarjetaDeCredito mastershark = new TarjetaDeCredito("123456789555555","10/01/2028", provincia);
    TarjetaDeCredito brisa = new TarjetaDeCredito("98765432111111","26/07/2026", nacion);
    
    
    
    carlos.setTarjetaDeCredito(mastershark);
    analia.setTarjetaDeCredito(brisa);
    
    
        System.out.println("---------------------DESDE TARJETA------------------------");
        System.out.println(mastershark.toString()); 
        System.out.println(brisa.toString()); 
        
        
        System.out.println("---------------------DESDE CLIENTE------------------------"); 
        System.out.println(carlos.toString()); 
        System.out.println(analia.toString()); 
    }
}
