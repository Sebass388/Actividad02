/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2;
import java.util.Date;
/**
 *
 * @author Sebass
 */
public class Actividad2 {

 public static void main(String[] args) {

  try {

            Departamento sistemas = new Departamento(1, "Sistemas");

            EmpleadoPermanente emp1 = new EmpleadoPermanente(
                    101, "Sebastian Lopez", "sebastian.lopez@claryicon.com", 3000, 500);

            EmpleadoTemporal emp2 = new EmpleadoTemporal(
                    102, "Valeria Alcaraz", "Valeria.alcaraz@claryicon.com", 2000, new Date());

            sistemas.agregarEmpleado(emp1);
            sistemas.agregarEmpleado(emp2);

            ReporteDesempeno reporte = new ReporteDesempeno(
                    1, new Date(), 0, "Buen rendimiento");

            reporte.generarReporteEmpleado(emp1);
            reporte.generarReporteEmpleado(emp2);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}    