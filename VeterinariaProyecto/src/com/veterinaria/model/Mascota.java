package com.veterinaria.model;

public class Mascota {
    private int id;
    private String nombre;
    private String especie;
    private String raza;
    private String nombreDueno;
    private String telefono;

    public Mascota() {}

    public Mascota(int id, String nombre, String especie, String raza, String nombreDueno, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.nombreDueno = nombreDueno;
        this.telefono = telefono;
    }

    public Mascota(String nombre, String especie, String raza, String nombreDueno, String telefono) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.nombreDueno = nombreDueno;
        this.telefono = telefono;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public String getNombreDueno() { return nombreDueno; }
    public void setNombreDueno(String nombreDueno) { this.nombreDueno = nombreDueno; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}