
package Ejercicio_10;


public class Principal {
    public static void main(String[] args) {
        
        CuentaBancaria cuentaNueva = new CuentaBancaria("123456789","$40.000","ABM456","15/09/2025");
        CuentaBancaria cuentaNueva1 = new CuentaBancaria("789465123","$90.000","AA4568","01/09/2025");
        
        Titular titular = new Titular("Juan Pérez","40.000.222");
        Titular titular1 = new Titular("Margarita Walks","20.666.989");
        
        titular.setCuentaBancaria(cuentaNueva);
        titular1.setCuentaBancaria(cuentaNueva1);
        
        
        System.out.println(titular.toString());
        System.out.println(titular1.toString());
        
        
        
        
        
        
    }

}
