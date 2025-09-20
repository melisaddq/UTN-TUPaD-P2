
package Ejercicio_14;


public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
    
    @Override
    public String toString() {
        String nombreProyecto = (proyecto != null) ? proyecto.getNombre() : "N/A";
        return "Renderizado: " + nombreProyecto + " en formato " + formato;
    }
    
    
}

