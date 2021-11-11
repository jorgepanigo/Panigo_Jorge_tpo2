
package igu;



import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import logica.ControladoraLogica;




public class Pantalla extends javax.swing.JFrame{
    
    ControladoraLogica control = new ControladoraLogica();
  
    //Constructor de la IGU
    public Pantalla(ControladoraLogica control) {
        this.control = control;
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVioleta = new javax.swing.JPanel();
        btnMInimizar = new javax.swing.JLabel();
        lblCanina = new javax.swing.JLabel();
        lblNroCliente = new javax.swing.JLabel();
        txtNroCliente = new javax.swing.JTextField();
        lblNombreCliente = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        lblRaza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblAlergico = new javax.swing.JLabel();
        lblAtencionEspecial = new javax.swing.JLabel();
        lblNombreDuenio = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        lblCeluDuenio = new javax.swing.JLabel();
        txtCelularDuenio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        lblObservaciones = new javax.swing.JLabel();
        cboAlergia = new javax.swing.JComboBox<>();
        cboAtencionEspecial = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JLabel();
        lblImagenbyn = new javax.swing.JLabel();
        lblPeluqueria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peluqueria Canina");
        setUndecorated(true);
        setResizable(false);

        pnlVioleta.setBackground(new java.awt.Color(153, 0, 153));
        pnlVioleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMInimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize.png"))); // NOI18N
        btnMInimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMInimizarMouseClicked(evt);
            }
        });
        pnlVioleta.add(btnMInimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, 40));

        lblCanina.setFont(new java.awt.Font("Yu Gothic Light", 0, 48)); // NOI18N
        lblCanina.setForeground(new java.awt.Color(255, 255, 255));
        lblCanina.setText("Canina");
        pnlVioleta.add(lblCanina, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 60));

        lblNroCliente.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblNroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNroCliente.setText("Cliente Nro");
        pnlVioleta.add(lblNroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 107, 94, -1));

        txtNroCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNroCliente.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtNroCliente.setForeground(new java.awt.Color(51, 51, 51));
        pnlVioleta.add(txtNroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 105, 310, 34));

        lblNombreCliente.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setText("Nombre");
        pnlVioleta.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 153, -1, -1));

        txtNombreMascota.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreMascota.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtNombreMascota.setForeground(new java.awt.Color(51, 51, 51));
        pnlVioleta.add(txtNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 151, 310, 34));

        lblRaza.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(255, 255, 255));
        lblRaza.setText("Raza");
        pnlVioleta.add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 199, -1, -1));

        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(51, 51, 51));
        pnlVioleta.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 197, 310, 34));

        lblColor.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Color");
        pnlVioleta.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 245, -1, -1));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtColor.setForeground(new java.awt.Color(51, 51, 51));
        pnlVioleta.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 243, 310, 34));

        lblAlergico.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblAlergico.setForeground(new java.awt.Color(255, 255, 255));
        lblAlergico.setText("Alergico");
        pnlVioleta.add(lblAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 290, -1, -1));

        lblAtencionEspecial.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblAtencionEspecial.setForeground(new java.awt.Color(255, 255, 255));
        lblAtencionEspecial.setText("Atencion Especial");
        pnlVioleta.add(lblAtencionEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 335, -1, -1));

        lblNombreDuenio.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblNombreDuenio.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDuenio.setText("Nombre Dueño");
        pnlVioleta.add(lblNombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 381, -1, -1));

        txtNombreDuenio.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreDuenio.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtNombreDuenio.setForeground(new java.awt.Color(51, 51, 51));
        pnlVioleta.add(txtNombreDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 379, 310, 34));

        lblCeluDuenio.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblCeluDuenio.setForeground(new java.awt.Color(255, 255, 255));
        lblCeluDuenio.setText("Celular Dueño");
        pnlVioleta.add(lblCeluDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 40));

        txtCelularDuenio.setBackground(new java.awt.Color(255, 255, 255));
        txtCelularDuenio.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtCelularDuenio.setForeground(new java.awt.Color(51, 51, 51));
        pnlVioleta.add(txtCelularDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 425, 310, 34));

        btnLimpiar.setBackground(new java.awt.Color(153, 0, 153));
        btnLimpiar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlVioleta.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 615, 151, 40));

        lblObservaciones.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblObservaciones.setText("Observaciones");
        pnlVioleta.add(lblObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 471, -1, -1));

        cboAlergia.setBackground(new java.awt.Color(255, 255, 255));
        cboAlergia.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        cboAlergia.setForeground(new java.awt.Color(51, 51, 51));
        cboAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        pnlVioleta.add(cboAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 289, 310, 33));

        cboAtencionEspecial.setBackground(new java.awt.Color(255, 255, 255));
        cboAtencionEspecial.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        cboAtencionEspecial.setForeground(new java.awt.Color(51, 51, 51));
        cboAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cboAtencionEspecial.setToolTipText("");
        pnlVioleta.add(cboAtencionEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 334, 310, 33));

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(51, 51, 51));
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        pnlVioleta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 471, 310, 126));

        btnGuardar.setBackground(new java.awt.Color(153, 0, 153));
        btnGuardar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlVioleta.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 615, 141, 40));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        pnlVioleta.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 10, 40, 40));

        lblImagenbyn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        pnlVioleta.add(lblImagenbyn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 470, -1));

        lblPeluqueria.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        lblPeluqueria.setForeground(new java.awt.Color(255, 255, 255));
        lblPeluqueria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        lblPeluqueria.setText(" Peluqueria");
        pnlVioleta.add(lblPeluqueria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlVioleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlVioleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Limpia el formulario
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    //Cierra la ventana
    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked
    
    //Guarda los datos cargado en la base de datos
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Capturaremos las excepciones de PK duplicada para dar tratamiendo
        try {
            //Verificaremos previo a la carga que el campo Nro de cliente no este vacio y contenga letras    
            if (control.esNumero(txtNroCliente.getText())){
                control.nuevoPerro( txtNroCliente.getText(),
                                    txtNombreMascota.getText(),
                                    txtRaza.getText(),
                                    txtColor.getText(),
                                    cboAlergia.getSelectedItem().toString(),
                                    cboAtencionEspecial.getSelectedItem().toString(),
                                    txtNombreDuenio.getText(),
                                    txtCelularDuenio.getText(),
                                    txtObservaciones.getText()
                                    );
                //Finalizada la carga se informa al usuario el exito de la operacion.
                JOptionPane.showMessageDialog(null, "Perfecto!! Se acaba de cargar a " + txtNombreMascota.getText() + " como cliente.", "Carga Correcta", JOptionPane.INFORMATION_MESSAGE);
                limpiaFormulario();
            } else {
                //Se informa al usuario que reingrese Nro de cliente
                JOptionPane.showMessageDialog(null, "Hubo un error con el Nro de cliente.\nVerifica que la casilla contenga un numero", "Error en Numero de Cliente", JOptionPane.ERROR_MESSAGE);
            }
            
        } 
        //Capturo la excepcion por PK ya existente.
        catch (RollbackException e){
            JOptionPane.showMessageDialog(null, "El Numero de cliente ya existe.\nElije otro numero.", "Numero de Cliente duplicado", JOptionPane.ERROR_MESSAGE);
        }
        
        
       
    }//GEN-LAST:event_btnGuardarActionPerformed
    
   //Minimiza la ventana
    private void btnMInimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMInimizarMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMInimizarMouseClicked
    
    //Metodo limpiaFormulario limpiar todos los textFields del formulario
    public void limpiaFormulario(){
        txtNroCliente.setText("");
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cboAlergia.setSelectedIndex(0);
        cboAtencionEspecial.setSelectedIndex(0);
        txtNombreDuenio.setText("");
        txtCelularDuenio.setText("");
        txtObservaciones.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel btnMInimizar;
    private javax.swing.JComboBox<String> cboAlergia;
    private javax.swing.JComboBox<String> cboAtencionEspecial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergico;
    private javax.swing.JLabel lblAtencionEspecial;
    private javax.swing.JLabel lblCanina;
    private javax.swing.JLabel lblCeluDuenio;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblImagenbyn;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreDuenio;
    private javax.swing.JLabel lblNroCliente;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblPeluqueria;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JPanel pnlVioleta;
    private javax.swing.JTextField txtCelularDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtNroCliente;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

   
}
