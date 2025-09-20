
package Ejercicio7;


public class Principal {
    public static void main(String[] args) {
        
    Motor motor1 = new Motor("GNC","123456");    
    Motor motor2 = new Motor("NAFTA","456789");    
    Vehiculo auto1 = new Vehiculo("AB456CD","Etios",motor1);
    Vehiculo auto2 = new Vehiculo("FGH789","Corsa",motor2);
    
    Conductor conductor1 = new Conductor("Pepe", "007");
    Conductor conductor2 = new Conductor("Pepa", "009");
    
    
    
    auto1.setConductor(conductor1);
    auto2.setConductor(conductor2);
    
    
    auto1.mostrarMotor();

    
    System.out.println(auto1.toString());
    System.out.println(auto2.toString());

    
    
    
    
    
    
        
        
        
        
        
    }

}
