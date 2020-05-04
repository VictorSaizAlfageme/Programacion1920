package GUI;

import t9p1e2.Controlador;
import Excepciones.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import Modelo.UML.*;

public class VentanaAcontecimientos extends javax.swing.JFrame {
    
    private LocalDate localDate;
    private LocalTime localTimeInicio, localTimeFin;
    
    public VentanaAcontecimientos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public  void modificar(String nombre, String lugar, String fecha, String horaini, String horafin, int maxPersonas) {
        
        tfNombre.setText(nombre);
        tfFecha.setText(fecha);
        tfHoraInicio.setText(horaini);
        tfHoraFin.setText(horafin);
        tfAforo.setText(String.valueOf(maxPersonas));
        bAceptar.disable();
        bModificar.enable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAsisentes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbLugar = new javax.swing.JComboBox();
        tfAforo = new javax.swing.JFormattedTextField();
        tfFecha = new javax.swing.JFormattedTextField();
        tfHoraInicio = new javax.swing.JFormattedTextField();
        tfHoraFin = new javax.swing.JFormattedTextField();
        bModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acontecimientos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ALTA DE ACONTECIMIENTOS");

        jLabel2.setText("Nombre");

        jLabel4.setText("Fecha");

        jLabel5.setText("Hora inicio");

        jLabel6.setText("Hora finalización");

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel7.setText("Aforo");

        jLabel9.setText("Lugar");

        cbLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Artium", "Buesa Arena", "Iradier Arena", "Mendizorroza", "Teatro Principal" }));
        cbLugar.setSelectedIndex(-1);

        tfAforo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        tfFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        tfHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        tfHoraFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbLugar, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFecha, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(cbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(tfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       try
       {
                if (datosCorrectos())
                {
                        javax.swing.JOptionPane.showMessageDialog(this,"Datos correctos");
                        Controlador.meterDatos(tfNombre.getText(),(String) cbLugar.getSelectedItem(),localDate, localTimeInicio, localTimeFin,Integer.parseInt(tfAforo.getText()));
                        Controlador.Volver();
                }
       }
        catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el alta "+e.getClass());
       }
    }//GEN-LAST:event_bAceptarActionPerformed

private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
          Controlador.Volver();
}//GEN-LAST:event_bSalirActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
          Controlador.modificarDatos(tfNombre.getText(), cbLugar.getSelectedItem(),tfFecha.getText(), tfHoraInicio.getText(), tfHoraFin.getText(),Integer.parseInt(tfAforo.getText()));
      
    }//GEN-LAST:event_bModificarActionPerformed

    private boolean datosCorrectos(){
        try
        {
                validarNombre();
                validarLugar();
                validarFecha();
                validarHoras();
                validarAforo();
                return true;
        }
        catch(CampoVacio e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,e.getMensaje());
            return false;
        }
        catch(NombreNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El nombre no es válido.");
            tfNombre.requestFocus();
            return false;
        }
        catch(AforoNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El aforo no es válido");
            tfAforo.requestFocus();
            return false;
        }
        catch(FechaNoValida e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"La fecha no es válida");
            tfFecha.requestFocus();
            return false;
        }
        catch(HorasNoValidas e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"La horas no es valida");
            tfHoraInicio.requestFocus();
            return false;
        }
        catch(NumberFormatException e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El aforo no es válido");
            tfAforo.requestFocus();
            return false;
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,e.getClass());
            return false;
        }
    }
    
    private void validarNombre()throws Exception{
        if (tfNombre.getText().isEmpty())
            throw new CampoVacio("El campo esta vacio");
        // Considero que debe tener un mínimo de 3 caracteres
        if (tfNombre.getText().length()< 10)
            throw new NombreNoValido();
        // También se puede controlar que no exceda del tamaño indicado en la base de datos
        // También podemos validar a través de una expresión regular
    }
    
    private void validarLugar()throws Exception{
        if (cbLugar.getSelectedIndex() == -1)
            throw new CampoVacio("El campo esta vacio");
    }
    
    private void validarFecha()throws Exception{
        if (tfFecha.getText().isEmpty())
            throw new CampoVacio("El campo esta vacio");
 
        // Comprobar que es mayor que la fecha actual
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        localDate = LocalDate.parse(tfFecha.getText(), formatter);
        if (localDate.compareTo(LocalDate.now()) < 0)
                throw new FechaNoValida();
    }
    
    private void validarHoras()throws Exception{
          if (tfHoraInicio.getText().isEmpty())
            throw new CampoVacio("El campo esta vacio");
         if (tfHoraFin.getText().isEmpty())
            throw new CampoVacio("El campo esta vacio");
        
       // La hora de finalización tiene que ser mayor que la del inicio        
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        localTimeInicio = LocalTime.parse(tfHoraInicio.getText(), formatter);
        localTimeFin = LocalTime.parse(tfHoraFin.getText(), formatter);
        if (localTimeFin.isBefore(localTimeInicio))
             throw new HorasNoValidas(); 
    }
    
    private void validarAforo()throws Exception{
        if (tfAforo.getText().isEmpty())
            throw new CampoVacio("El campo esta vacio");
        if (Integer.parseInt(tfAforo.getText()) <= 0)
            throw new NumberFormatException();
        
       
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAcontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAcontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAcontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAcontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaAcontecimientos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bSalir;
    private javax.swing.ButtonGroup bgAsisentes;
    private javax.swing.JComboBox cbLugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField tfAforo;
    private javax.swing.JFormattedTextField tfFecha;
    private javax.swing.JFormattedTextField tfHoraFin;
    private javax.swing.JFormattedTextField tfHoraInicio;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
