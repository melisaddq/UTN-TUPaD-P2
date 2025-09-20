
package Ejercicio_10;


public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    
    

}
