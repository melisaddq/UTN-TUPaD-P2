
package tp7.herenciaypolimorfismo.CasoPractico4;


public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
    
    public void describirAnimal() {
        System.out.println("Este animal es un/a: " + this.especie);
    }  
    
    public void hacerSonido() {
        System.out.println("El animal hace sonido");
    }

    public String getEspecie() {
        return especie;
    }

    
    
    

}
