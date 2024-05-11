/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.*;
import paquete02.Notas;

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
        String nombre;
        double n1, n2, n3;
        int i;

        System.out.println("Digite 1 para ingresar nombre, nota 1 y nota 2");
        System.out.println("Digite 2 para ingresar nombre, nota 1, nota 2 "
                + "y nota 3");
        i = entrada.nextInt();
        entrada.nextLine();

        switch (i) {

            case 1 -> {
                System.out.println("Ingrese el nombre del Estudiante:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese nota 1");
                n1 = entrada.nextDouble();
                System.out.println("Ingrese nota 2");
                n2 = entrada.nextDouble();
                Notas c1 = new Notas(nombre, n1, n2);
                c1.calcularPromedio();
                System.out.printf("%s", c1);
            }
            case 2 -> {
                System.out.println("Ingrese el nombre del Estudiante:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese nota 1");
                n1 = entrada.nextDouble();
                System.out.println("Ingrese nota 2");
                n2 = entrada.nextDouble();
                System.out.println("Ingrese nota 3");
                n3 = entrada.nextDouble();
                Notas c2 = new Notas(nombre, n1, n2, n3);
                c2.calcularPromedio();
                System.out.printf("%s", c2);
            }
            default -> {
                break;
            }
        }

    }
}
