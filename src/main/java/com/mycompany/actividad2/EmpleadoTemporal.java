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
public class EmpleadoTemporal extends Empleado {

    private Date fechaFinContrato;

    public EmpleadoTemporal(int id, String nombre, String email, double salario, Date fechaFinContrato) {
        super(id, nombre, email, salario);
        this.fechaFinContrato = fechaFinContrato;
          }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
        
    }

    @Override
    public double calcularDesempeno() {
        return getSalario() * 0.8;
           }
}