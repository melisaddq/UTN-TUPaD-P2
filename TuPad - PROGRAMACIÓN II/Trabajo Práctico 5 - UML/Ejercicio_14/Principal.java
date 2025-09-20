
package Ejercicio_14;


public class Principal {
    public static void main(String[] args) {
        
    Proyecto proyecto = new Proyecto("Brasil 2023", 180);

        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);    
        
        
        
        
        
    }

}
