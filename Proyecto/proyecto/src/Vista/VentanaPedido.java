/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import main.*;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author victor
 */
public class VentanaPedido extends javax.swing.JFrame {
    
    private boolean encontrado;
    
    
    
    /**
     * Creates new form VentanaPedido
     */
    public VentanaPedido() {
        initComponents();
        fechaHora();
        llenarComboBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        tfHora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JUnidadesActualesCU = new javax.swing.JLabel();
        tfUnidadesActuales = new javax.swing.JTextField();
        JUnidadesApuntadasCU = new javax.swing.JLabel();
        BAñadir = new javax.swing.JButton();
        cbPlato = new javax.swing.JComboBox<>();
        JUnidadesActualesCU1 = new javax.swing.JLabel();
        tfUnidadesPedidas = new javax.swing.JTextField();
        JError = new javax.swing.JLabel();
        BComprobar = new javax.swing.JButton();
        BAtras = new javax.swing.JButton();
        BCrearPedido = new javax.swing.JButton();
        JPanelNombre = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(181, 46, 131));
        jLabel1.setText("PEDIDO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "    CREAR PEDIDO    ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Unispace", 0, 14), new java.awt.Color(181, 46, 131))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 361));

        jLabel2.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre / DNI:");

        tfCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfCliente.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        tfCliente.setForeground(new java.awt.Color(0, 0, 0));
        tfCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tfCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfClienteKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha:");

        tfFecha.setBackground(new java.awt.Color(255, 255, 255));
        tfFecha.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        tfFecha.setForeground(new java.awt.Color(102, 102, 102));
        tfFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tfFecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfFecha.setDoubleBuffered(true);
        tfFecha.setEnabled(false);

        tfHora.setBackground(new java.awt.Color(255, 255, 255));
        tfHora.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        tfHora.setForeground(new java.awt.Color(102, 102, 102));
        tfHora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tfHora.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfHora.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Hora:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "   AÑADIR PLATOS   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Unispace", 1, 14), new java.awt.Color(181, 46, 131))); // NOI18N

        JUnidadesActualesCU.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        JUnidadesActualesCU.setForeground(new java.awt.Color(0, 0, 0));
        JUnidadesActualesCU.setText("Unidades Actuales:");

        tfUnidadesActuales.setBackground(new java.awt.Color(255, 255, 255));
        tfUnidadesActuales.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        tfUnidadesActuales.setForeground(new java.awt.Color(0, 0, 0));
        tfUnidadesActuales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tfUnidadesActuales.setEnabled(false);

        JUnidadesApuntadasCU.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        JUnidadesApuntadasCU.setForeground(new java.awt.Color(0, 0, 0));
        JUnidadesApuntadasCU.setText("Plato:");

        BAñadir.setBackground(new java.awt.Color(255, 255, 255));
        BAñadir.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        BAñadir.setForeground(new java.awt.Color(181, 46, 131));
        BAñadir.setText("AÑADIR");
        BAñadir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        BAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BAñadir.setEnabled(false);
        BAñadir.setFocusPainted(false);
        BAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAñadirActionPerformed(evt);
            }
        });

        cbPlato.setBackground(new java.awt.Color(255, 255, 255));
        cbPlato.setFont(new java.awt.Font("Unispace", 1, 12)); // NOI18N
        cbPlato.setForeground(new java.awt.Color(0, 0, 0));
        cbPlato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cbPlato.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbPlatoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        JUnidadesActualesCU1.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        JUnidadesActualesCU1.setForeground(new java.awt.Color(0, 0, 0));
        JUnidadesActualesCU1.setText("Unidades Pedidas:");

        tfUnidadesPedidas.setBackground(new java.awt.Color(255, 255, 255));
        tfUnidadesPedidas.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        tfUnidadesPedidas.setForeground(new java.awt.Color(0, 0, 0));
        tfUnidadesPedidas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        tfUnidadesPedidas.setEnabled(false);
        tfUnidadesPedidas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUnidadesPedidasFocusGained(evt);
            }
        });

        JError.setFont(new java.awt.Font("Unispace", 1, 10)); // NOI18N
        JError.setForeground(new java.awt.Color(255, 0, 0));

        BComprobar.setBackground(new java.awt.Color(0, 0, 0));
        BComprobar.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        BComprobar.setForeground(new java.awt.Color(255, 255, 255));
        BComprobar.setText("COMPROBAR");
        BComprobar.setFocusPainted(false);
        BComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BComprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(BAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(JUnidadesApuntadasCU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(JUnidadesActualesCU)
                                .addGap(18, 18, 18)
                                .addComponent(tfUnidadesActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(JUnidadesActualesCU1)
                                .addGap(18, 18, 18)
                                .addComponent(tfUnidadesPedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JUnidadesApuntadasCU)
                    .addComponent(cbPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JUnidadesActualesCU)
                    .addComponent(tfUnidadesActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JUnidadesActualesCU1)
                    .addComponent(tfUnidadesPedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JError, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BAtras.setBackground(new java.awt.Color(0, 0, 0));
        BAtras.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        BAtras.setForeground(new java.awt.Color(255, 255, 255));
        BAtras.setText("CANCELAR");
        BAtras.setFocusPainted(false);
        BAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtrasActionPerformed(evt);
            }
        });

        BCrearPedido.setBackground(new java.awt.Color(0, 0, 0));
        BCrearPedido.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        BCrearPedido.setForeground(new java.awt.Color(255, 255, 255));
        BCrearPedido.setText("CREAR PEDIDO");
        BCrearPedido.setFocusPainted(false);
        BCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCrearPedidoActionPerformed(evt);
            }
        });

        JPanelNombre.setBackground(new java.awt.Color(255, 0, 0));
        JPanelNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        JPanelNombre.setForeground(new java.awt.Color(255, 255, 255));
        JPanelNombre.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout JPanelNombreLayout = new javax.swing.GroupLayout(JPanelNombre);
        JPanelNombre.setLayout(JPanelNombreLayout);
        JPanelNombreLayout.setHorizontalGroup(
            JPanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        JPanelNombreLayout.setVerticalGroup(
            JPanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BCrearPedido)
                .addGap(34, 34, 34)
                .addComponent(BAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JPanelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(tfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(BCrearPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtrasActionPerformed
        Proyecto.cerrarVenatanaPedidos();
    }//GEN-LAST:event_BAtrasActionPerformed

    private void BAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAñadirActionPerformed
        boolean numeroOK;
        try {
            numeroOK = validarNumero(tfUnidadesPedidas.getText());
            if(numeroOK){
                
                if(JPanelNombre.getBackground()==Color.green){
                JError.setText("");
                Proyecto.guardarPedidos();
                JError.setText("");
                }
                else{
                    JError.setText("Algún cuadro de texto esta mal");
                }
                
            }
            else{
                tfUnidadesPedidas.setForeground(Color.red);
                JError.setText("Las unidades están mal");
            }
            
        } catch (Exception e) {
            System.out.println("Error al insertar un valor");
        }
        
    }//GEN-LAST:event_BAñadirActionPerformed

    private void BCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCrearPedidoActionPerformed
         try {
            String DNI = Proyecto.obtenerCodigoCliente(tfCliente.getText());
            Proyecto.insertarPedido(DNI);
            
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_BCrearPedidoActionPerformed

    private void cbPlatoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbPlatoPopupMenuWillBecomeInvisible
        
        
        Object objetoSeleccionado = cbPlato.getSelectedItem();
        String platoSeleccionado = objetoSeleccionado.toString();
        Proyecto.llenarUnidades(platoSeleccionado);
        String UnidadesPlato = String.valueOf(Proyecto.getUnidadesPlato());
        tfUnidadesActuales.setText(UnidadesPlato);
        tfUnidadesPedidas.setEnabled(true);
    }//GEN-LAST:event_cbPlatoPopupMenuWillBecomeInvisible

    private void tfUnidadesPedidasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUnidadesPedidasFocusGained
        tfUnidadesPedidas.setText("");
        BAñadir.setEnabled(false);
        JError.setText("");
    }//GEN-LAST:event_tfUnidadesPedidasFocusGained

    private void tfClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClienteKeyReleased
         boolean NombreCorrecto = consultarNombre(tfCliente);
        boolean DNICorrecto = consultarDni(tfCliente);
        
        if(NombreCorrecto || DNICorrecto){
            boolean DNIEncontrado = buscarDNI(tfCliente);
            boolean NombreEncontrado =buscarNombre(tfCliente);
            
            if(DNIEncontrado || NombreEncontrado){
               JPanelNombre.setBackground(Color.green);
            }
            else{
               JPanelNombre.setBackground(Color.red);
            }

        }else{
            JPanelNombre.setBackground(Color.red);
        }
    }//GEN-LAST:event_tfClienteKeyReleased

    private void BComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BComprobarActionPerformed
        try{
        int UnidadesActuales = Integer.parseInt(tfUnidadesActuales.getText());
        int UnidadesPedidas = Integer.parseInt(tfUnidadesPedidas.getText());
        
        if(UnidadesActuales>UnidadesPedidas){
            BAñadir.setEnabled(true);
        }
        else{
            JError.setText("No hay tantas unidades");
        }
        }catch(Exception e){
            JError.setText("Unidades Pedidas erroneas");
        }
    }//GEN-LAST:event_BComprobarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPedido().setVisible(true);
            }
        });
    }
    
    
    private void fechaHora() {
        LocalDate localDate = LocalDate.now(); 
        DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        String fecha = localDate.format(formatFecha);  
        tfFecha.setText(fecha);
        LocalTime localTime = LocalTime.now();     
        DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("HH:mm"); 
        String hora = localTime.format(formatHora);
        tfHora.setText(hora);
        
    }
    
    private void llenarComboBox() {
        try{
            Proyecto.llenarComboBox(cbPlato);
        }
        catch(Exception e){
           System.out.println(e.getClass());
       }
    }
    
    private boolean consultarDni(JTextField DNI){
        try{
          boolean correcto = validarDni(DNI.getText());
           if (correcto)
           {
               return true;
           }
           else
           {
               return false;
           }
       }
       catch(Exception e){
           System.out.println(e.getClass());
       }
        return false;
    }
    
    private boolean validarDni(String DNI) throws Exception{
        String dnipat = "\\d{8}[A-HJ-NP-TV-Z]";
        if (Pattern.matches(dnipat, DNI)== false ){
            return false;
        }
        else{
            return true;
        }
    }
    
    private boolean consultarNombre(JTextField Nombre){
        try{
          boolean correcto = validarNombre(Nombre.getText());
           if (correcto)
           {
               return true;
           }
           else
           {
               return false;
           }
       }
       catch(Exception e){
           System.out.println(e.getClass());
       }
        return false;
    }
    
    private boolean validarNombre(String Nombre) throws Exception{
        String nombrepat = "[A-zÑñ\\s]{1,25}";
        if (Pattern.matches(nombrepat, Nombre)== false ){
            return false;
        }
        else{
            return true;
        }
    }
    
    private boolean buscarDNI(JTextField DNI){
        try{
            encontrado = Proyecto.buscarClientePorDNI(DNI.getText());
           if (encontrado)
           {
               return true;
           }
           else
           {
               return false;
           }
       }
       catch(Exception e){
           System.out.println(e.getClass());
       }
        return false;
    }
    
    private boolean buscarNombre(JTextField Nombre){
        try{
            encontrado = Proyecto.buscarClientePorNombre(Nombre.getText());
           if (encontrado)
           {
               return true;
           }
           else
           {
               return false;
           }
       }
       catch(Exception e){
           System.out.println(e.getClass());
       }
        return false;
    }
   
    
    private boolean validarNumero(String Unidades) throws Exception{
        String dnipat = "\\d{0,3}";
        if (Pattern.matches(dnipat, Unidades)== false ){
            return false;
        }
        else{
            return true;
        }
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAtras;
    private javax.swing.JButton BAñadir;
    private javax.swing.JButton BComprobar;
    private javax.swing.JButton BCrearPedido;
    private javax.swing.JLabel JError;
    private javax.swing.JPanel JPanelNombre;
    private javax.swing.JLabel JUnidadesActualesCU;
    private javax.swing.JLabel JUnidadesActualesCU1;
    private javax.swing.JLabel JUnidadesApuntadasCU;
    private javax.swing.JComboBox<String> cbPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfHora;
    private javax.swing.JTextField tfUnidadesActuales;
    private javax.swing.JTextField tfUnidadesPedidas;
    // End of variables declaration//GEN-END:variables
}
