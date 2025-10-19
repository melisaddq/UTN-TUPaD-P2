
package tp7.herenciaypolimorfismo.CasoPractico2;


public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    
    @Override
    public double calcularArea(){
        return Math.PI * this.radio * this.radio;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Radio: " + this.radio);
    }
    
}
