
package tp7.herenciaypolimorfismo.CasoPractico4;


public class Vaca extends Animal {

    public Vaca(String especie) {
        super(especie);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("MUUUUUUUU");
    }

}
