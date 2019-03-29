package com.example.alumno.clase2;

/**
 * Created by alumno on 28/03/2019.
 */

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String sexo;

    Persona(String nombre,String apellido,int dni,String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " - Apellido: " + this.getApellido() + " - DNI: " + this.getDni() + " - Sexo: " + this.getSexo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
