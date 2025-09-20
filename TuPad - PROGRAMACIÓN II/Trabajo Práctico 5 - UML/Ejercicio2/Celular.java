
package Ejercicio2;


public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // AGREGACIÓN
    private Usuario usuario; // ASOCIACIÓN BIDIRECCIONAÑ
    
//CONSTRUCTOR    

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

// METODOS
    public void mostrarBateria(){
        if(bateria!=null){
            System.out.println("El celular " + marca + " " + modelo + " tiene bateria " + bateria.getModelo() + " con " + bateria.getCapacidad() + " de capacidad");
        } else {
            System.out.println("El celular " + marca + " " + modelo + " no tiene bateria.");
        }
    }
    
        public void mostrarUsuario(){
        if(usuario!=null){
            System.out.println("El celular " + marca + " " + modelo + " pertenece a: " + usuario);
        } else {
            System.out.println("El celular " + marca + " " + modelo + " se encuentra en stock para la venta.");
        }
    }
        
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        } 
    }
    
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
   

}
