/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;

/**
 *
 * @author Sebass
 */
public abstract class Empleado {

    private int id;
    private String nombre;
    private String email;
    private double salario;
    private Departamento departamento;

    public Empleado(int id, String nombre, String email, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.salario = salario;
       }

    public int getId() {
        return id;
     }

    public String getNombre() {
        return nombre;
     }
 
    public String getEmail() {
        return email;
             }

    public double getSalario() {
        return salario;
      }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Metodo abstracto 
    public abstract double calcularDesempeno();

   
}