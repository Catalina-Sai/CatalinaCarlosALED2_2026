package com.veterinaria.dao;

import com.veterinaria.conexion.ConexionJDBC;
import com.veterinaria.model.Mascota;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MascotaDAO {

    public boolean insertar(Mascota m) {
        String sql = "INSERT INTO mascotas (nombre, especie, raza, nombre_dueno, telefono) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = ConexionJDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getNombre());
            ps.setString(2, m.getEspecie());
            ps.setString(3, m.getRaza());
            ps.setString(4, m.getNombreDueno());
            ps.setString(5, m.getTelefono());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Mascota> listar() {
        List<Mascota> lista = new ArrayList<>();
        String sql = "SELECT * FROM mascotas";
        try (Connection con = ConexionJDBC.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Mascota m = new Mascota(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("especie"),
                    rs.getString("raza"),
                    rs.getString("nombre_dueno"),
                    rs.getString("telefono")
                );
                lista.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean actualizar(Mascota m) {
        String sql = "UPDATE mascotas SET nombre=?, especie=?, raza=?, nombre_dueno=?, telefono=? WHERE id=?";
        try (Connection con = ConexionJDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getNombre());
            ps.setString(2, m.getEspecie());
            ps.setString(3, m.getRaza());
            ps.setString(4, m.getNombreDueno());
            ps.setString(5, m.getTelefono());
            ps.setInt(6, m.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM mascotas WHERE id=?";
        try (Connection con = ConexionJDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Mascota> buscar(String criterio) {
        List<Mascota> lista = new ArrayList<>();
        String sql = "SELECT * FROM mascotas WHERE nombre LIKE ? OR nombre_dueno LIKE ?";
        try (Connection con = ConexionJDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            String filtro = "%" + criterio + "%";
            ps.setString(1, filtro);
            ps.setString(2, filtro);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mascota m = new Mascota(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("especie"),
                    rs.getString("raza"),
                    rs.getString("nombre_dueno"),
                    rs.getString("telefono")
                );
                lista.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}