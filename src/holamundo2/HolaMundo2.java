/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo2;

import java.util.Scanner;

/**
 *
 * @author gmgud_ita4nrw
 */
public class HolaMundo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre; // variable sin iniacilizar al momento. Declarada
        nombre = "Maria";
        System.out.println("Hola Mundo!");
        System.out.println(nombre);
        int edad = 12; // variable declarada e inicializada
        System.out.println(edad); //sout
        
        // ingresar valor por consola.
        // Debo definir un objeto llamado Scanner.
        /* Para ello definimos una variable llamada input (o como queramos),
        que es de tipo Scanner y que va a guardar una referencia a un objeto 
        scanner que se esta definiendo en ese momento.
        En otras palabras: input sera la variable que contiene una referencia
        al objeto Scanner que nos permite leer datos via teclado.
        */
        Scanner input = new Scanner(System.in);
        
        edad = input.nextInt(); // Este metodo permite leer un dato de la conso-
                                // la y devolverlo como int.
        double salario;
        salario = input.nextDouble(); // lee double.
        
        boolean tieneHijos;
        tieneHijos = input.nextBoolean(); // lee boolean.
        
        String nombre;
        nombre = input.nextLine(); // lee string.
        
        char letra;
        letra = input.nextLine().charAt(0); // con el metodo charAt me devuelve el primer caracter de input.
        
        
        // Concatenación de caracteres
        
        System.out.println("Hola " + nombre);
                                     
    }
    
}
