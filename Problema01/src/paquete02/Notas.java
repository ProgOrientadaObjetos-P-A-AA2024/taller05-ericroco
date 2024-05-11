/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author StarMedia
 */
public class Notas {

    private String nombre;
    private double m1;
    private double m2;
    private double m3;
    private double promedio;

    public Notas(String n, double n1, double n2) {
        nombre = n;
        m1 = n1;
        m2 = n2;
        m3 = (m1 + m2) / 2;
    }

    public Notas(String name, double n1, double n2, double n3) {
        nombre = name;
        m1 = n1;
        m2 = n2;
        m3 = n3;
    }

    public void establecerNombreEstudiante(String x) {
        nombre = x;
    }

    public void establecerM1(double x) {
        m1 = x;
    }

    public void establecerM2(double x) {
        m2 = x;
    }

    public void establecerM3(double x) {
        m3 = x;
    }

    public void calcularPromedio() {
        promedio = (m1 + m2 + m3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerM1() {
        return m1;
    }

    public double obtenerM2() {
        return m2;
    }

    public double obtenerM3() {
        return m3;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tabla de Calificaciones\n"
                + "Nombre: %s"
                + "\nNota Materia 1 %.2f\n"
                + "Nota Materia 2 %.2f\n"
                + "Nota Materia 3 %.2f\n"
                + "Promedio: %.2f\n",
                nombre,
                m1,
                m2,
                m3,
                promedio);
        return cadena;
    }
}
