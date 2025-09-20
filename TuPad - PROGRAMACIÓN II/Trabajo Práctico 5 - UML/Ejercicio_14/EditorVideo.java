
package Ejercicio_14;


public class EditorVideo {
    //EditorVideo->método: void exportar(String formato, Proyecto proyecto)
    //EditorVideo.exportar(String, Proyecto)
    
    public void exportar(String formato, Proyecto proyecto) {
        Render renderizado = new Render(formato, proyecto);
        System.out.println("Proyecto exportado exitosamente.");
        System.out.println(renderizado);
    }

}
