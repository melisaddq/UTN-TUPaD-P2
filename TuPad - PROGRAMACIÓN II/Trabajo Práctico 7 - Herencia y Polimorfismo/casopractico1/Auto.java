
package tp7.herenciaypolimorfismo.casopractico1;


public class Auto extends Vehiculo {
    private int cantidadPuertas;
    


    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

     
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Puertas: " + this.cantidadPuertas);
        
    }
    
    public void acelerar(){
        System.out.println("Acelerando...");
    }

}
