
package tp7.herenciaypolimorfismo.CasoPractico4;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
    ArrayList<Animal> animalitos = new ArrayList<>(); 
    
    animalitos.add(new Perro("Perro"));
    animalitos.add(new Vaca("Vaca"));
    animalitos.add(new Gato("Gato"));
    
    System.out.println("---- LOS ANIMALES HACEN SONIDOS ----");     
    
        for (Animal animalito : animalitos) {
            animalito.describirAnimal();
            System.out.print("y hace: ");
            animalito.hacerSonido();
            
        }
        

        
    }
}
