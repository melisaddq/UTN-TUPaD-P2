
package tp7.herenciaypolimorfismo.CasoPractico4;


public class Perro extends Animal {

    public Perro(String especie) {
        super(especie);
    }
    
    
    @Override
    public void hacerSonido() {
        System.out.println("Guau! Guau!");
    }

}
