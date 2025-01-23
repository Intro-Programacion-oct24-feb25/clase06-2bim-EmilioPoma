/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "\nListado de Paises que inician con consonante:\n";
        while (bandera) {
            try {
                System.out.println("Ingrese el nombre de un pais: ");
                String nombre = entrada.nextLine();
                char vocal = nombre.toUpperCase().charAt(0);
                String inicial = String.valueOf(vocal);
                if (inicial.equals("A") || inicial.equals("E") || inicial.equals("I") || inicial.equals("O")
                        || inicial.equals("U")) {
                    bandera = false;
                    throw new Exception("Debe ingresar unicamente paises que inicien con consonante");
                }else {
                    cadena = cadena + nombre + "\n";
                }
                
                
                
                

            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }
        System.out.println(cadena);
    }
}
