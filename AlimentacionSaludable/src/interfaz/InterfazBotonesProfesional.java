package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InterfazBotonesProfesional extends javax.swing.JPanel {

    //Atrbutos
    private Sistema sistema;
    private JFrame ventana;
    private JPanel actual;
    private Profesional usuarioActivo;
    
    //Cosntructor
    public InterfazBotonesProfesional(Sistema unSistema, JFrame unaVentana,
            Profesional unProfesional) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActivo = unProfesional;
        actual = new PanelHomeProfesional(unSistema, this, unaVentana);
        ventana.add(this);
        ventana.add(actual);
        actualizarFotoYNombre();
        etiquetaNombreProfesional.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void actualizarFotoYNombre(){
        ImageIcon fotoUsuario = usuarioActivo.getFotoPerfil();
        Icon fotoProfesional = new ImageIcon(fotoUsuario.getImage());
        etiquetaFotoProfesional.setIcon(fotoProfesional);
        etiquetaNombreProfesional.setText(usuarioActivo.getNombreUsuario());
    }
    
    public JPanel getActual() {
        return actual;
    }

    public void setActual(JPanel actual) {
        this.actual = actual;
    }

    public Profesional getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(Profesional usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaNombreProfesional = new javax.swing.JLabel();
        etiquetaFotoProfesional = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnRealizarPlan = new javax.swing.JButton();
        btnConsultaDirecta = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 153));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

        etiquetaNombreProfesional.setBackground(new java.awt.Color(204, 204, 204));
        etiquetaNombreProfesional.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNombreProfesional.setText("nombre");
        etiquetaNombreProfesional.setToolTipText("");
        etiquetaNombreProfesional.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        etiquetaNombreProfesional.setOpaque(true);
        add(etiquetaNombreProfesional);
        etiquetaNombreProfesional.setBounds(0, 640, 260, 50);

        etiquetaFotoProfesional.setBackground(new java.awt.Color(0, 51, 204));
        etiquetaFotoProfesional.setMaximumSize(new java.awt.Dimension(210, 240));
        etiquetaFotoProfesional.setMinimumSize(new java.awt.Dimension(210, 240));
        add(etiquetaFotoProfesional);
        etiquetaFotoProfesional.setBounds(20, 350, 210, 290);

        btnHome.setBackground(new java.awt.Color(255, 0, 102));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setContentAreaFilled(false);
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        add(btnHome);
        btnHome.setBounds(2, 32, 258, 41);

        btnRealizarPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnRealizarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRealizarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPlan.setText("Realizar Plan");
        btnRealizarPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizarPlan.setContentAreaFilled(false);
        btnRealizarPlan.setOpaque(true);
        btnRealizarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPlanActionPerformed(evt);
            }
        });
        add(btnRealizarPlan);
        btnRealizarPlan.setBounds(2, 91, 258, 44);

        btnConsultaDirecta.setBackground(new java.awt.Color(255, 0, 102));
        btnConsultaDirecta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConsultaDirecta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaDirecta.setText("Consulta Directa");
        btnConsultaDirecta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultaDirecta.setContentAreaFilled(false);
        btnConsultaDirecta.setOpaque(true);
        btnConsultaDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDirectaActionPerformed(evt);
            }
        });
        add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(2, 156, 258, 43);

        btnCambiarUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(2, 220, 258, 44);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        add(fondo);
        fondo.setBounds(0, 0, 260, 784);

        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 41, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ventana.remove(actual);
        actual = new PanelHomeProfesional(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
        ventana.remove(actual);
        actual = new PanelConsultaProfesionalDesdeProfesional(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnRealizarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPlanActionPerformed
        ventana.remove(actual);
        actual = new PanelSeleccionarPlanARealizar(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnRealizarPlanActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        ventana.remove(actual);
        actual = new PanelCambioDeUsuario(ventana, sistema, this);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRealizarPlan;
    private javax.swing.JLabel etiquetaFotoProfesional;
    private javax.swing.JLabel etiquetaNombreProfesional;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
