
package Ejercicio_11;


public class Reproductor {
    
    // metodo
    //reproductor.reproducir(Cancion)

    public void reproducir(Cancion cancion){
        if ( cancion != null ){
            System.out.println("Se está reproduciendo la canción: " + cancion.getTitulo() + ", del artista: " + cancion.getArtista());
        } else{
            System.out.println("No has seleccionado una canción válida.");
        }
    }
}
