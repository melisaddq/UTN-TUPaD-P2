
package tp7.herenciaypolimorfismo.CasoPractico2;


public class Rectangulo extends FiguraGeometrica {
    private double altura;
    private double base;

    public Rectangulo(double altura, double base, String nombre) {
        super(nombre);
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double calcularArea(){
        return (this.altura * this.base);
    }

    @Override
    public void mostrarInfo(){
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Alto: " + this.altura);
    System.out.println("Ancho: " + this.base);
    }
    

}
