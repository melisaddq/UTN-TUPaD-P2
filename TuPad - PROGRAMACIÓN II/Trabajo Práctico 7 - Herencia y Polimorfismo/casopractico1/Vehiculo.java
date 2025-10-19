
package tp7.herenciaypolimorfismo.casopractico1;


public abstract  class Vehiculo {
    
    protected String marca;
    protected String modelo;
    

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
        
}
