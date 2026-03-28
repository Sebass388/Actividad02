/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;
import java.util.Date;
/**
 *
 * @author Sebass
 */
public class ReporteDesempeno {
    private int id;
    private Date fechaGeneracion;
    private double puntuacion;
    private String observaciones;

    public ReporteDesempeno(int id, Date fechaGeneracion, double puntuacion, String observaciones) {
        this.id = id;
        this.fechaGeneracion = fechaGeneracion;
        this.puntuacion = puntuacion;
        this.observaciones = observaciones;
    }

    public void generarReporteEmpleado(Empleado empleado) throws Exception {

        if (empleado == null) {
            throw new Exception("No se puede generar reporte de un empleado nulo");
        }

        double desempeno = empleado.calcularDesempeno();

        System.out.println("REPORTE DE DESEMPENO");
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("ID: " + empleado.getId());
        System.out.println("Desempeno calculado: " + desempeno);
        System.out.println("Fecha: " + fechaGeneracion);
        System.out.println("Observaciones: " + observaciones);
    }

}
