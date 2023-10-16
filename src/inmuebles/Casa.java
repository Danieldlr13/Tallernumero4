/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author Daniel
 */
public class Casa extends InmuebleVivienda {
    protected int numeroPisos;
    public Casa(int identificadorInmobiliario, int area, String direccion,
    int numeroHabitaciones, int numeroBaños, int numeroPisos) {
    super(identificadorInmobiliario, area, direccion,numeroHabitaciones, numeroBaños);
    this.numeroPisos = numeroPisos;
    }
    void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos = " + numeroPisos);
    }
}