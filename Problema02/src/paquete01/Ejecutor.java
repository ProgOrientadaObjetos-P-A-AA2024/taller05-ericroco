/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.*;
import paquete02.Auto;

/**
 *
 * @author StarMedia
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        String cedula;
        String marca;
        String cadena = "";
        int fabYear;
        double valorV;

        System.out.println("¿Cuantas veces desea realizar el proceso?");
        num = entrada.nextInt();
        entrada.nextLine();
        for (int i = 1; i <= num; i++) {
            System.out.println("Automotor " + (i));
            System.out.println("Ingrese la cedula del dueño:");
            cedula = entrada.nextLine();
            System.out.println("Ingrese la marca del Vehiculo:");
            marca = entrada.nextLine();
            System.out.println("Ingrese el año de Fabricacion:");
            fabYear = entrada.nextInt();
            System.out.println("Ingrese el valor de el Vehiculo");
            valorV = entrada.nextDouble();
            entrada.nextLine();
            Auto auto1 = new Auto(cedula, marca, fabYear, valorV);
            auto1.calcularValorM();
            cadena = String.format("%s\n%s", cadena, auto1);
        }
        System.out.println(cadena);
    }
}
