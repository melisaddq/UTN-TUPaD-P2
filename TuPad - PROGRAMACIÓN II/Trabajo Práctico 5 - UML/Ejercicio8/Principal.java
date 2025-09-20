
package Ejercicio8;


public class Principal {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario ("Laura","lalal@rerere.com");
        
        Documento documento = new Documento ("Contrato", "contenidolala", "76FB8A73C42","25/03/2020", usuario);
        

        
        documento.mostrarFirmaDigital();
        System.out.println(documento.toString());
        
        
    }
}    
        
        

