
package tp8.excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
     
        
        // EJERCICIO 1 DIVISIÓN SEGURA
        
        System.out.println("\n--- EJERCICIO 1 DIVISIÓN SEGURA ---");

        System.out.print("Ingrese el dividendo: ");
        String dividendoString = scanner.nextLine();
        System.out.print("Ingrese el divisor: ");
        String divisorString = scanner.nextLine();

        try {
            int a = Integer.parseInt(dividendoString);
            int b = Integer.parseInt(divisorString);

            int resultado = a / b;
            System.out.println("El resultado es: " + resultado);

        } catch (NumberFormatException nfe) { // si no ingresa numeros
            System.out.println("Error: Debe ingresar números enteros válidos.");

        } catch (ArithmeticException ae) { // si ingresa 0 como divisor
            System.out.println("Error: no se puede dividir por cero.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace(System.out);
        }         
        
        

        // EJERCICIO 2 CONVERSION CADENA A NÚMERO
        
        System.out.println("\n--- EJERCICIO 2 CONVERSIÓN CADENA A NÚMERO ---");
        System.out.println("Ingrese un número: ");
        String cadena = scanner.nextLine();

        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("El número ingresado es: " + numero);
            System.out.println("GRACIAS");

        } catch (NumberFormatException nfe) {
            System.out.println("Error: El texto " + cadena + " no se puede convertir a un número entero.");

            nfe.printStackTrace(System.out);
        }         
        
        
        
        // EJERCICIO 3 LECTURA DE ARCHIVO
        
        System.out.println("Ingrese el nombre del archivo y su extensión: ");
        String nombreArchivo = scanner.nextLine();
        
        Scanner lectorArchivo = null;

        try {
            File archivo = new File(nombreArchivo);
            lectorArchivo = new Scanner(archivo);
            
            System.out.println("--- Contenido del archivo: " + nombreArchivo + " ---");
            while (lectorArchivo.hasNextLine()) {
                System.out.println(lectorArchivo.nextLine());
            }
            System.out.println("--- Fin del archivo ---");
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: El archivo " + nombreArchivo + " no fue encontrado.");
            fnfe.printStackTrace(System.out);
            scanner.nextLine();
            
        } finally {

            if (lectorArchivo != null) {
                lectorArchivo.close();
            }
        }

            
            

        // EJERCICIO 4 EDAD INVALIDA 
    
        try {
            System.out.print("Ingrese su edad: ");
            String edadComoTexto = scanner.nextLine();
            int edadIngresada = Integer.parseInt(edadComoTexto);

            ExcepcionPersonalizada.validarEdad(edadIngresada);
            System.out.println("Edad registrada correctamente: " + edadIngresada);

        } catch (NumberFormatException nfe) {
            System.out.println("Error: debe ingresar un número.");
        } catch (IllegalArgumentException iae) {
            System.out.println("Error: " + iae.getMessage());
        } 
    
   
        
        
        // EJERCICIO 5 USO DE TRY WITH RESOURCES
        System.out.print("Ingrese el nombre del archivo y extensión: ");
        String nombreArchivo2 = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo2))) {

            System.out.println("--- Contenido del archivo: " + nombreArchivo2 + " ---");
            String linea;
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
            System.out.println("--- Fin del archivo ---");

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo2 + "' no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida al leer el archivo: " + e.getMessage());
        }

        
        
        
        
        
        
        scanner.close();
        
    }
       
    public static void validarEdad(int edad) throws IllegalArgumentException {
            if (edad < 0 || edad > 120) {  // s al edad no es valida lanza la excepción
                throw new IllegalArgumentException("La edad " + edad + " está fuera del rango etario");
            }
    }        
        
}
