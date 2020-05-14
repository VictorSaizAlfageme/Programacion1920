package GUI;

import t9p1e5.Controlador;
import Excepciones.*;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VentanaAcontecimientos extends javax.swing.JFrame {
    
    private LocalDate localDate;
    private LocalTime localTimeInicio, localTimeFin;
    
    // La misma ventana sirve para altas, bajas y modificaciones
    private String operacion;
    
    public VentanaAcontecimientos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
     public VentanaAcontecimientos(String operacion) {
        initComponents();
        this.operacion= operacion;
        switch(operacion)
        {
            case "alta":
                lTitulo.setText("Alta de acontecimientos");
                // Todo habilitado
                break;
            case "modificacion":
                  lTitulo.setText("Modificación de acontecimientos");
                  // Inicialmente sólo está habilitada la caja para el nombre del acontecimiento.
                 habilitar(false);
                break;
            case "baja":
                  lTitulo.setText("Baja de acontecimientos");
                  // Inicialmente sólo está habilitada la caja para el nombre del acontecimiento.
                 habilitar(false);
                break;
        }
        setLocationRelativeTo(null);
    }
     
     private void habilitar(boolean valor)
     {
         cbLugar.setEnabled(valor);
         ffFecha.setEnabled(valor);
         ffHoraInicio.setEnabled(valor);
         ffHoraFin.setEnabled(valor);
         ffAforo.setEnabled(valor);
         
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAsisentes = new javax.swing.ButtonGroup();
        lTitulo = new javax.swing.JLabel();
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
        ffAforo = new javax.swing.JFormattedTextField();
        ffFecha = new javax.swing.JFormattedTextField();
        ffHoraInicio = new javax.swing.JFormattedTextField();
        ffHoraFin = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acontecimientos");

        lTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lTitulo.setText("ALTA DE ACONTECIMIENTOS");

        jLabel2.setText("Nombre");

        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

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

        ffAforo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        ffFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        ffHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        ffHoraFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbLugar, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ffFecha, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ffHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ffAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ffHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(ffFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(ffHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ffHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ffAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       try
       {
           switch(operacion)
           {
               case "alta":
                        if (datosCorrectos())
                        {
                                javax.swing.JOptionPane.showMessageDialog(this,"Datos correctos. \nVamos a insertar en la base de  datos");
                                Controlador.grabarAcontecimiento(tfNombre.getText(),(String) cbLugar.getSelectedItem(),localDate, localTimeInicio, localTimeFin,Integer.parseInt(ffAforo.getText()));
                                Controlador.volver(this);
                        }
                        break;
               case "baja":
                          if (javax.swing.JOptionPane.showConfirmDialog(this,"¿Estás segurx?")== 0)
                                     Controlador.borrarAcontecimiento();
                           Controlador.volver(this);
                       break;
               case "modificacion":
                   // Sobra la validación del nombre
                        if (datosCorrectos())
                        {
                                javax.swing.JOptionPane.showMessageDialog(this,"Datos correctos. \nVamos a modificar en la base de  datos");
                                Controlador.modificarAcontecimiento((String) cbLugar.getSelectedItem(),localDate, localTimeInicio, localTimeFin,Integer.parseInt(ffAforo.getText()));
                                Controlador.volver(this);
                        }
                       break;
           }
       }
        catch(MySQLIntegrityConstraintViolationException e)
        {
             javax.swing.JOptionPane.showMessageDialog(this,"Ya existe un acontecimiento con ese nombre");
            tfNombre.requestFocus();
        }
       catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas  "+e.getClass());
       }
    }//GEN-LAST:event_bAceptarActionPerformed

private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
          Controlador.volver(this);
}//GEN-LAST:event_bSalirActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
         buscar();
    }//GEN-LAST:event_tfNombreActionPerformed

    private void buscar(){
          /* Si es un alta no hago nada hasta el aceptar.
          Si es una baja o una modificación voy hasta la base de datos para mostrar los datos*/
        if (operacion.compareTo("alta")!= 0)
        {
                   try
                   {
                       validarNombre();
                        Controlador.buscarAcontecimiento(tfNombre.getText());
                        tfNombre.setEditable(false);
                        mostrarDatos();
                        if (operacion.compareTo("modificacion")== 0)
                            habilitar(true);
                        /* Si baja muestro los datos pero no se pueden modificar
                            Si es una modificación muestro datos y dejo cambiar todo menos el nombre (pk)*/
                   }
                   catch(CampoVacio e)
                  {
                     javax.swing.JOptionPane.showMessageDialog(this,e.getMensaje());
                  }
                  catch(NombreNoValido e)
                 {
                        javax.swing.JOptionPane.showMessageDialog(this,"El nombre del evento no es válido. \n Tiene que empezar con una letra y tener una longitud minima de 3");
                        tfNombre.requestFocus();
                  }
                 catch(AcontecimientoNoEncontrado e)
                 {
                        javax.swing.JOptionPane.showMessageDialog(this,"No existe un acontecimiento con ese nombre");
                        tfNombre.requestFocus();
                  }
                  catch(Exception e)
                  {
                     javax.swing.JOptionPane.showMessageDialog(this,e.getClass());
                  }
        }
}
    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
      /* Quiero hacer lo mismo que en el actionPerformed
        tfNombre.doClick()
        Para las cajas de texto no existe el doClick()
        Por eso la función buscar*/
      buscar();
    }//GEN-LAST:event_tfNombreFocusLost

    private void mostrarDatos()
    {
        cbLugar.setSelectedItem(Controlador.getLugar());
        ffFecha.setText(Controlador.getFecha().toString());
        ffHoraInicio.setText(Controlador.getHoraInicio().toString());
        ffHoraFin.setText(Controlador.getHoraFin().toString());
        ffAforo.setText(Controlador.getAforo().toString());
    }
    
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
            javax.swing.JOptionPane.showMessageDialog(this,"El nombre del evento no es válido. \n Tiene que empezar con una letra y tener una longitud minima de 3");
            tfNombre.requestFocus();
            return false;
        }
        catch(AforoNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El aforo no es válido");
            ffAforo.requestFocus();
            return false;
        }
        catch(FechaNoValida e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"La fecha tecleada no es válida");
            ffFecha.requestFocus();
            return false;
        }
        catch(HorasNoValidas e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Las horas indicadas no son lógicas");
            ffHoraInicio.requestFocus();
            return false;
        }
        catch(NumberFormatException e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El aforo indicado no es válido");
            ffAforo.requestFocus();
            return false;
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas validando los datos de entrada " + e.getClass());
            return false;
        }
    }
    
    private void validarNombre()throws Exception{
        if (tfNombre.getText().isEmpty())
            throw new CampoVacio("El nombre del acontecimiento es un dato obligatorio");
        // Considero que debe tener un mínimo de 3 caracteres
        if (tfNombre.getText().length()< 3)
            throw new NombreNoValido();
        // También se puede controlar que no exceda del tamaño indicado en la base de datos
        // También podemos validar a través de una expresión regular
    }
    
    private void validarLugar()throws Exception{
        if (cbLugar.getSelectedIndex() == -1)
            throw new CampoVacio("El lugar del acontecimiento es un dato obligatorio");
    }
    
    private void validarFecha()throws Exception{
        if (ffFecha.getText().isEmpty())
            throw new CampoVacio("El fecha del acontecimiento es un dato obligatorio");
 
        // Comprobar que es mayor que la fecha actual
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yy");
        localDate = LocalDate.parse(ffFecha.getText(), formatter);
        if (localDate.compareTo(LocalDate.now()) < 0)
                throw new FechaNoValida();
    }
    
    private void validarHoras()throws Exception{
          if (ffHoraInicio.getText().isEmpty())
            throw new CampoVacio("La hora de inicio del acontecimiento es un dato obligatorio");
         if (ffHoraFin.getText().isEmpty())
            throw new CampoVacio("La hora de finalización del acontecimiento es un dato obligatorio");
        
       // La hora de finalización tiene que ser mayor que la del inicio        
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        localTimeInicio = LocalTime.parse(ffHoraInicio.getText(), formatter);
        localTimeFin = LocalTime.parse(ffHoraFin.getText(), formatter);
        if (localTimeFin.isBefore(localTimeInicio))
             throw new HorasNoValidas(); 
    }
    
    private void validarAforo()throws Exception{
        if (ffAforo.getText().isEmpty())
            throw new CampoVacio("El aforo del acontecimeinto es un dato obligatorio");
        if (Integer.parseInt(ffAforo.getText()) <= 0)
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
    private javax.swing.JButton bSalir;
    private javax.swing.ButtonGroup bgAsisentes;
    private javax.swing.JComboBox cbLugar;
    private javax.swing.JFormattedTextField ffAforo;
    private javax.swing.JFormattedTextField ffFecha;
    private javax.swing.JFormattedTextField ffHoraFin;
    private javax.swing.JFormattedTextField ffHoraInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
