
package Ejercicio3;


public class Principal {
    public static void main(String[] args) {
       
        Editorial editorial1 = new Editorial("CasaJota","Juan José Paso 140");
        Editorial editorial2 = new Editorial("CasitaRobada","Calle 53 n° 35");
        
        Autor autor1 = new Autor("Nicolás Delirio","Argentino");
        Autor autor2 = new Autor("Juan Fernando Quintero","Colombiano");
        
        Libro libro1 = new Libro("El tema de Adrián","1359855746225", editorial1);
        Libro libro2 = new Libro("Caramelo de limón","1587963334445", editorial2);
        
        libro1.setAutor(autor1);
        libro2.setAutor(autor2);
       
        System.out.println(libro1.toString());

        System.out.println(libro2.toString());
              }
       
}
