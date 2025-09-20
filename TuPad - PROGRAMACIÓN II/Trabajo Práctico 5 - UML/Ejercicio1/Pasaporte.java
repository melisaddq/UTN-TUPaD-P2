
package Ejercicio1;


public class Pasaporte {
// ATRIBUTOS    
    private String numero;
    private String fechaEmision;
    private Foto foto; // COMPOSICIÓN
    private Titular titular; // ASOCIACIÓN BIDIRECCIONAL
    
// CONSTRUCTOR
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Creo el objeto foto dentro de la clase pasaporte
        this.titular = titular;
        this.titular.setPasaporte(this);
    }
// MÉTODOS
    
    public void mostrarFoto(){
        System.out.println(foto.getImagen());
        System.out.println(foto.getFormato());
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

// GETTERS
    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

// toString

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }
    









}
