package com.veterinaria.controller;

import com.veterinaria.dao.MascotaDAO;
import com.veterinaria.model.Mascota;
import java.util.List;

public class MascotaController {
    private final MascotaDAO dao;

    public MascotaController() {
        this.dao = new MascotaDAO();
    }

    public String registrarMascota(String nombre, String especie, String raza, String dueno, String telefono) {
        if (nombre.trim().isEmpty() || especie.trim().isEmpty() || 
            raza.trim().isEmpty() || dueno.trim().isEmpty() || telefono.trim().isEmpty()) {
            return "Todos los campos son obligatorios.";
        }
        
        Mascota m = new Mascota(nombre.trim(), especie.trim(), raza.trim(), dueno.trim(), telefono.trim());
        return dao.insertar(m) ? "OK" : "Error al guardar en la base de datos.";
    }

    public String actualizarMascota(int id, String nombre, String especie, String raza, String dueno, String telefono) {
        if (id <= 0) return "Seleccione una mascota válida.";
        if (nombre.trim().isEmpty() || especie.trim().isEmpty() || 
            raza.trim().isEmpty() || dueno.trim().isEmpty() || telefono.trim().isEmpty()) {
            return "Todos los campos son obligatorios.";
        }

        Mascota m = new Mascota(id, nombre.trim(), especie.trim(), raza.trim(), dueno.trim(), telefono.trim());
        return dao.actualizar(m) ? "OK" : "Error al actualizar los datos.";
    }

    public String eliminarMascota(int id) {
        if (id <= 0) return "Seleccione una mascota para eliminar.";
        return dao.eliminar(id) ? "OK" : "Error al eliminar el registro.";
    }

    public List<Mascota> listarMascotas() {
        return dao.listar();
    }

    public List<Mascota> buscarMascotas(String criterio) {
        if (criterio == null || criterio.trim().isEmpty()) {
            return dao.listar();
        }
        return dao.buscar(criterio.trim());
    }
}