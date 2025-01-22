/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Ingrese cuantas operaciones quiere realizar");
            int valor = entrada.nextInt();
            int[] resultados = new int[valor];
            for (int i = 0; i < resultados.length; i++) {
                System.out.println("Ingrese el dividendo");
                int dividendo = entrada.nextInt();
                System.out.println("Ingrese el divisor");
                int divisor = entrada.nextInt();
                resultados[i] = dividendo / divisor;
            }
        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s.\n Ingreso un dato de tipo cadena.", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
    }
}
