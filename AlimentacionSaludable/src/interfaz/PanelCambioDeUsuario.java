package interfaz;

import dominio.Persona;
import dominio.Profesional;
import dominio.Usuario;
import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

public class PanelCambioDeUsuario extends javax.swing.JPanel {

    private JFrame ventana;
    private Sistema sistema;
    private InterfazBotonesProfesional interfazProf = null;
    private InterfazBotonesUsuario interfazUsr = null;
    private InterfazBotonesAdministrador interfazAdm = null;

    //constructor desde Profesional
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesProfesional unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazProf = unaInterfaz;
        
        actualizarLista();
    }

    //constructor desde Usuario
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazUsr = unaInterfaz;
        
        actualizarLista();
    }

    //constructor desde Administrador
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesAdministrador unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazAdm = unaInterfaz;
        actualizarLista();
    }

    //constructor para comenzar la aplicacion
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnCambiarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        etiquetaTiposDeUsuarios = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        btnPruebaAdministrador = new javax.swing.JButton();
        cajaContraseña = new javax.swing.JTextField();
        etiquetaContraseña = new javax.swing.JLabel();
        etiquetaErrorContraseña = new javax.swing.JLabel();
        radioProfesional = new javax.swing.JRadioButton();
        radioUsuario = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        btnCambiarUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(670, 370, 210, 45);

        listaUsuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaUsuarios);

        add(jScrollPane1);
        jScrollPane1.setBounds(350, 80, 290, 340);

        etiquetaTiposDeUsuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaTiposDeUsuarios.setText("Tipo de Usuario");
        add(etiquetaTiposDeUsuarios);
        etiquetaTiposDeUsuarios.setBounds(40, 80, 180, 29);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Cambio de Usuario");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(330, 21, 330, 44);

        btnPruebaAdministrador.setBackground(new java.awt.Color(255, 0, 102));
        btnPruebaAdministrador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPruebaAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnPruebaAdministrador.setText("Modo Administrador");
        btnPruebaAdministrador.setContentAreaFilled(false);
        btnPruebaAdministrador.setOpaque(true);
        btnPruebaAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaAdministradorActionPerformed(evt);
            }
        });
        add(btnPruebaAdministrador);
        btnPruebaAdministrador.setBounds(40, 280, 250, 45);

        cajaContraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaContraseñaFocusLost(evt);
            }
        });
        add(cajaContraseña);
        cajaContraseña.setBounds(670, 130, 190, 37);

        etiquetaContraseña.setText("Ingrese su contraseña:");
        add(etiquetaContraseña);
        etiquetaContraseña.setBounds(680, 90, 140, 40);

        etiquetaErrorContraseña.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        etiquetaErrorContraseña.setForeground(new java.awt.Color(51, 51, 51));
        add(etiquetaErrorContraseña);
        etiquetaErrorContraseña.setBounds(670, 190, 300, 50);

        buttonGroup1.add(radioProfesional);
        radioProfesional.setText("Profesional");
        radioProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioProfesionalActionPerformed(evt);
            }
        });
        add(radioProfesional);
        radioProfesional.setBounds(60, 130, 110, 28);

        buttonGroup1.add(radioUsuario);
        radioUsuario.setText("Usuario");
        radioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUsuarioActionPerformed(evt);
            }
        });
        add(radioUsuario);
        radioUsuario.setBounds(60, 180, 111, 28);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        if (listaUsuarios.getSelectedValue() != null) {
            this.limpioInterfaces();
            if ( radioProfesional.isSelected()) {
                Profesional profSeleccionado = (Profesional) listaUsuarios.getSelectedValue();
                if(profSeleccionado.getContraseña().equals(cajaContraseña.getText())){
                    ventana.remove(this);
                    InterfazBotonesProfesional nuevaBotonera = new InterfazBotonesProfesional(sistema, ventana, profSeleccionado);
                    ventana.pack();
                }else{
                    etiquetaErrorContraseña.setText("Contraseña incorrecta");
                }
            }
            if ( radioUsuario.isSelected()) {
                Usuario usuarioSeleccionado = (Usuario) listaUsuarios.getSelectedValue();
                if(usuarioSeleccionado.getContraseña().equals(cajaContraseña.getText())){
                    ventana.remove(this);
                    InterfazBotonesUsuario nuevaBotonera = new InterfazBotonesUsuario(sistema, ventana, usuarioSeleccionado);
                    ventana.pack();
                }else{
                    etiquetaErrorContraseña.setText("Contraseña incorrecta");
                }
            }
        }
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

    private void btnPruebaAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaAdministradorActionPerformed
        if (interfazProf != null) {
            ventana.remove(interfazProf.getActual());
            ventana.remove(interfazProf);
        }
        if (interfazAdm != null) {
            ventana.remove(interfazAdm.getActual());
            ventana.remove(interfazAdm);
        }
        if (interfazUsr != null) {
            ventana.remove(interfazUsr.getActual());
            ventana.remove(interfazUsr);
        }
        ventana.remove(this);
        InterfazBotonesAdministrador nuevaBotonera = new InterfazBotonesAdministrador(sistema, ventana);
        ventana.pack();
    }//GEN-LAST:event_btnPruebaAdministradorActionPerformed

    private void cajaContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaContraseñaFocusLost

    }//GEN-LAST:event_cajaContraseñaFocusLost

    private void radioProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioProfesionalActionPerformed
        actualizarLista();
    }//GEN-LAST:event_radioProfesionalActionPerformed

    private void radioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUsuarioActionPerformed
         actualizarLista();
    }//GEN-LAST:event_radioUsuarioActionPerformed
    void actualizarLista() {
        if (sistema.getListaUsuarios().size() < 1 && radioUsuario.isSelected()) {
            btnCambiarUsuario.setEnabled(false);
        } else {
            if (sistema.getListaProfesionales().size() < 1 && radioProfesional.isSelected()) {
                btnCambiarUsuario.setEnabled(false);
            } else {
                btnCambiarUsuario.setEnabled(true);
            }
        }
        if ( radioProfesional.isSelected()) {
            listaUsuarios.setListData(sistema.getListaProfesionales().toArray());
        }
        if (radioUsuario.isSelected()) {
            listaUsuarios.setListData(sistema.getListaUsuarios().toArray());
        }
    }

    void limpioInterfaces() {
        if (interfazProf != null) {
            ventana.remove(interfazProf.getActual());
            ventana.remove(interfazProf);
        }
        if (interfazAdm != null) {
            ventana.remove(interfazAdm.getActual());
            ventana.remove(interfazAdm);
        }
        if (interfazUsr != null) {
            ventana.remove(interfazUsr.getActual());
            ventana.remove(interfazUsr);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnPruebaAdministrador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cajaContraseña;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaErrorContraseña;
    private javax.swing.JLabel etiquetaTiposDeUsuarios;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaUsuarios;
    private javax.swing.JRadioButton radioProfesional;
    private javax.swing.JRadioButton radioUsuario;
    // End of variables declaration//GEN-END:variables
}
