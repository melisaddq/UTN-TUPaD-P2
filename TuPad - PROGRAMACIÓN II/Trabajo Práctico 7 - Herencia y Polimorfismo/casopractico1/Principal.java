
package tp7.herenciaypolimorfismo.casopractico1;


public class Principal {


    public static void main(String[] args) {
        
    Auto a1 = new Auto(4, "Fiat", "Toro");   
    
        System.out.println("----- MOSTRAR INFO AUTO -----");
        a1.mostrarInfo();
        a1.acelerar();

        
    Vehiculo v1 = new Auto(5, "Ford","Kinetic");
    System.out.println("----- MOSTRAR INFO AUTO POLIMORFICO DESDE VEHÍCULO-----");   
    v1.mostrarInfo();
    // no puede acceder a método acelerar()
    // DOWNCASTING
    System.out.println("----- MOSTRAR INFO AUTO POLIMORFICO APLICADO DOWNCASTING -----");   
    Auto poli = (Auto) v1;
    
    poli.mostrarInfo();
    poli.acelerar();
    
        
        
    }

}
