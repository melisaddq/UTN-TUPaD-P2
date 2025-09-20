
package Ejercicio_11;


public class Principal {
    public static void main(String[] args) {
    
        Cancion cancion = new Cancion ("Sin darle ya mas vueltas");
        Artista artista = new Artista ("Vox Dei","Rock");
        Reproductor reproductor = new Reproductor();
        
        
        
        cancion.setArtista(artista);
        
        reproductor.reproducir(cancion);
        
        
        
        
        
        
    }
}
