
package com.veterinaria.view;

import com.veterinaria.controller.MascotaController;
import com.veterinaria.model.Mascota;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MascotaViewB extends javax.swing.JFrame {

public MascotaViewB() {
    initComponents();
    setTitle("Gestión de Veterinaria - Registro de Mascotas");
    setLocationRelativeTo(null);
    configurarModeloTabla();
    cargarTabla(controller.listarMascotas());
    agregarEventoSeleccionTabla();
}

private final MascotaController controller = new MascotaController();
    private int idSeleccionado = -1;
    private DefaultTableModel modelTabla;


    private void configurarModeloTabla() {
        modelTabla = new javax.swing.table.DefaultTableModel(new String[]{"ID", "Nombre", "Especie", "Raza", "Dueño", "Teléfono"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };tablaMascotas.setModel(modelTabla);
    }
    private void cargarTabla(java.util.List<com.veterinaria.model.Mascota> lista) {
        modelTabla.setRowCount(0);
        for (com.veterinaria.model.Mascota m : lista) {
            modelTabla.addRow(new Object[]{
                m.getId(), m.getNombre(), m.getEspecie(), m.getRaza(), m.getNombreDueno(), m.getTelefono()
            });
        }
    }

 
    private void agregarEventoSeleccionTabla() {
        tablaMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = tablaMascotas.getSelectedRow();
                if (fila >= 0) {
                    idSeleccionado = Integer.parseInt(modelTabla.getValueAt(fila, 0).toString());
                    txtNombre.setText(modelTabla.getValueAt(fila, 1).toString());
                    txtEspecie.setText(modelTabla.getValueAt(fila, 2).toString());
                    txtRaza.setText(modelTabla.getValueAt(fila, 3).toString());
                    txtDueno.setText(modelTabla.getValueAt(fila, 4).toString());
                    txtTelefono.setText(modelTabla.getValueAt(fila, 5).toString());
                }
            }
        });
    }
    
    private void limpiarFormulario() {
        idSeleccionado = -1;
        txtNombre.setText("");
        txtEspecie.setText("");
        txtRaza.setText("");
        txtDueno.setText("");
        txtTelefono.setText("");
        txtBuscar.setText("");
        tablaMascotas.clearSelection();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtRaza = new javax.swing.JTextField();
        txtDueno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Dueño");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel6.setText("Buscar (Por Dueño/Nombre)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 110, -1));
        getContentPane().add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 90, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });
        getContentPane().add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, -1));
        getContentPane().add(txtDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, -1));

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 90, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        jLabel2.setText("Especie");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));

        jLabel3.setText("Raza");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, -1));

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaMascotas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 17, 417, 281));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed

    }//GEN-LAST:event_txtRazaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
 
                                        
    String res = controller.registrarMascota(
        txtNombre.getText(), txtEspecie.getText(), txtRaza.getText(), txtDueno.getText(), txtTelefono.getText()
    );
    if (res.equals("OK")) {
        JOptionPane.showMessageDialog(this, "Mascota guardada con éxito.");
        limpiarFormulario();
        cargarTabla(controller.listarMascotas());
    } else {
        JOptionPane.showMessageDialog(this, res, "Error de validación", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

                                         
    String res = controller.actualizarMascota(
        idSeleccionado, txtNombre.getText(), txtEspecie.getText(), txtRaza.getText(), txtDueno.getText(), txtTelefono.getText()
    );
    if (res.equals("OK")) {
        JOptionPane.showMessageDialog(this, "Registro actualizado correctamente.");
        limpiarFormulario();
        cargarTabla(controller.listarMascotas());
    } else {
        JOptionPane.showMessageDialog(this, res, "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
    if (idSeleccionado <= 0) {
        JOptionPane.showMessageDialog(this, "Seleccione un registro de la tabla para eliminar.", "Atención", JOptionPane.WARNING_MESSAGE);
        return;
    }
    int confirm = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la mascota seleccionada?", "Confirmar", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        String res = controller.eliminarMascota(idSeleccionado);
        if (res.equals("OK")) {
            JOptionPane.showMessageDialog(this, "Registro eliminado.");
            limpiarFormulario();
            cargarTabla(controller.listarMascotas());
        } else {
            JOptionPane.showMessageDialog(this, res, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
                                       
    limpiarFormulario();
    cargarTabla(controller.listarMascotas());

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
  
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                                  
    List<Mascota> resultados = controller.buscarMascotas(txtBuscar.getText());
    cargarTabla(resultados);

    }//GEN-LAST:event_btnBuscarActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MascotaViewB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MascotaViewB().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaMascotas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDueno;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}