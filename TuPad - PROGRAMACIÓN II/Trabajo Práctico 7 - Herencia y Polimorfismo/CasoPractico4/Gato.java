
package tp7.herenciaypolimorfismo.CasoPractico4;


public class Gato extends Animal {

    public Gato(String especie) {
        super(especie);
    }


    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }

}
