package com.cibertec.edu.Example.Model;

public class Mes {
	
	private String nombre;
    private int dias;

    public Mes(String nombre, int dias) {
        this.nombre = nombre;
        this.dias = dias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDias() {
        return dias;
    }
}
