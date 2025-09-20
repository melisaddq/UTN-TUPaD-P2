
package Ejercicio2;


public class Principal {
    public static void main(String[] args) {
    
    Usuario usuario1 = new Usuario ("Oscar", "14.355.689");
    Usuario usuario2 = new Usuario ("Graciela", "16.555.896");    
        
        
    Bateria bat1 = new Bateria("Li-ion","128 GB"); // LAS BATERIAS EXISTEN DE FORMA INDEPENDIENTE
    Bateria bat2 = new Bateria("Li-Po","256 GB");    
    
  
    Celular cel1 = new Celular("03020106", "Samsung", "J7", bat1);
    Celular cel2 = new Celular("0303456", "Motorola", "moto e", bat2);
    Celular cel3 = new Celular("1234567", "Motorola", "moto Z", bat1);
    
    usuario1.setCelular(cel1);
    cel2.setUsuario(usuario2);
    
    cel1.mostrarBateria();
    cel1.mostrarUsuario();
    
    cel2.mostrarBateria();
    cel2.mostrarUsuario();
    
    cel3.mostrarUsuario();
    
    
    }

}
