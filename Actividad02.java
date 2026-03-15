/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividad02;
import java.util.Date;
/**
 *
 * @author Sebass
 */
public class Actividad02 {

   public static void main(String[] args) {

        try {

            Departamento sistemas = new Departamento(1, "Sistemas");

            Empleado emp1 = new Empleado(101, "Esteban Salazar", "Esteban.salazar1@gmail.com", 3000);
            Empleado emp2 = new Empleado(102, "Valeria Gomez", "Valeria.gomez2@gmail.com", 2500);

            sistemas.agregarEmpleado(emp1);
            sistemas.agregarEmpleado(emp2);

            ReporteDesempeno reporte = new ReporteDesempeno(
                    1, new Date(), 0, "Buen desempeño");

            reporte.generarReporteEmpleado(emp1);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}