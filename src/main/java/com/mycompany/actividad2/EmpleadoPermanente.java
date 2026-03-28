/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;

/**
 *
 * @author Sebass
 */
public class EmpleadoPermanente extends Empleado {

    private double bonoAnual;

    public EmpleadoPermanente(int id, String nombre, String email, double salario, double bonoAnual) {
        super(id, nombre, email, salario);
        this.bonoAnual = bonoAnual;
        }

    public double getBonoAnual() {
        return bonoAnual;
        
    }

    @Override
    public double calcularDesempeno() {
        return getSalario() + bonoAnual;
          }
}