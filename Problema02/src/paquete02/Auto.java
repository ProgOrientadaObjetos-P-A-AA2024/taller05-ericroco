/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author StarMedia
 */
public class Auto {

    private String cedula;
    private String marcaV;
    private int fabricationYear;
    private double valorV;
    private double valorM;

    public Auto(String a, String b, int c, double d) {
        cedula = a;
        marcaV = b;
        fabricationYear = c;
        valorV = d;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerMarcaV(String x) {
        marcaV = x;
    }

    public void establecerFabricationYear(int x) {
        fabricationYear = x;
    }

    public void establecerValorV(double x) {
        valorV = x;
    }

    public void calcularValorM() {
        valorM = ((valorV * 0.002) / 100)
                * (2024 - fabricationYear);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarcaV() {
        return marcaV;
    }

    public int obtenerFabricationYear() {
        return fabricationYear;
    }

    public double obtenerValorV() {
        return valorV;
    }

    public double obtenerValorM() {
        return valorM;
    }

    @Override
    public String toString() {
        String cadena = String.format("Automotor\n"
                + "Cedula: %s\nMarca del Vehiculo: %s\n"
                + "Año de Fabricación del Vehiculo: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                cedula,
                marcaV,
                fabricationYear,
                valorV,
                valorM);
        return cadena;
    }
}
