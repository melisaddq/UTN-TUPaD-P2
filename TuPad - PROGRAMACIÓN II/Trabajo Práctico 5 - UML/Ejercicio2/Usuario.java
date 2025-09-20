
package Ejercicio2;


public class Usuario {
    
    private String nombre;
    private String dni;
    private Celular celular; // ASOCIACIÓN BIDIRECCIONAÑ
    
    // CONSTRUCTOR

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // MÉTODOS
    
    // ESTABLECE LA RELACION BIDIRECCIONAL 
    
    public void setCelular(Celular celular) { 
        this.celular = celular;
        if (celular != null && celular.getUsuario()!= this){
            celular.setUsuario(this);
        }        
    }
    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
