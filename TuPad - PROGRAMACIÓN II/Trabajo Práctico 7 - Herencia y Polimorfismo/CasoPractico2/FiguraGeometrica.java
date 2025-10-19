
package tp7.herenciaypolimorfismo.CasoPractico2;


public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public abstract double calcularArea();
    
    
    public void mostrarInfo(){
    System.out.println("Nombre: " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
