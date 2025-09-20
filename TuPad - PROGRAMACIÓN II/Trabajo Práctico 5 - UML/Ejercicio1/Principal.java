
package Ejercicio1;


public class Principal {
    public static void main(String[] args) {
        
    Titular titular1 = new Titular("Melisa ddq","1234567");
    Pasaporte pasap1 = new Pasaporte("AB123456", "25-03-2023", "imagen1","PNG", titular1);
    
    titular1.setPasaporte (pasap1); // SETTEO DESDE TITULAR
    titular1.mostrarPasaporte();
    pasap1.mostrarFoto();
    
    Titular titular2 = new Titular("Juan Vargas","2356897");
    Pasaporte pasap2 = new Pasaporte("CD123457", "05-05-2009", "imagen2", "JPG", titular2);
        
    pasap2.setTitular(titular2); // SETTEO DESDE PASAPORTE
    titular2.mostrarPasaporte(); 
    pasap2.mostrarFoto();
        
    }
}
