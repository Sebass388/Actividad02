/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sebass
 */
public class Departamento {
    private int id;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
      }

    public void agregarEmpleado(Empleado empleado) throws Exception {

        if (empleado == null) {
            throw new Exception("El empleado no puede ser nulo");
            }

        empleados.add(empleado);
        empleado.setDepartamento(this);
       }

    public void eliminarEmpleado(Empleado empleado) throws Exception {

        if (!empleados.contains(empleado)) {
            throw new Exception("El empleado no pertenece al departamento");
               }

        empleados.remove(empleado);
        
        
    }

    public List<Empleado> getEmpleados() {
        return empleados;
        }

}
