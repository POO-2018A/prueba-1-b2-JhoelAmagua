/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Tienda extends javax.swing.JFrame {

    String [][] pedidos;
    DefaultTableModel tblModelPedidos;
    String [] frutas = new String []{"","Manzana","Pera","Uva","Naranja","Sandia"};
    DefaultComboBoxModel comboFrutas = new DefaultComboBoxModel(frutas);
    String [] cedulas = new String []{};
    DefaultComboBoxModel comboCedulas = new DefaultComboBoxModel(cedulas);
    ArrayList<Cliente> listaclientes = new ArrayList<Cliente>();
    DefaultComboBoxModel listaClientesModel = 
            new DefaultComboBoxModel(listaclientes.toArray());
    ArrayList<Cliente> listapedido = new ArrayList<Cliente>();
    DefaultComboBoxModel listaPedidoModel = 
            new DefaultComboBoxModel(listapedido.toArray());
    
    
    public Tienda() {
        initComponents();

        String titulosColumnasEmpleados[] = new String [] {"Nombre", "Precio"};
        tblModelPedidos = new DefaultTableModel(pedidos, titulosColumnasEmpleados);
        tblPedidos.setModel(tblModelPedidos);
        
        cmbListafrutas.setModel(comboFrutas);
        cmbCedulas.setModel(listaClientesModel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblFrutas = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombrecliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblLista = new javax.swing.JLabel();
        cmbListafrutas = new javax.swing.JComboBox<>();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNombrefruta = new javax.swing.JLabel();
        txtNombrefruta = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblListacedulas = new javax.swing.JLabel();
        cmbCedulas = new javax.swing.JComboBox<>();
        btnMostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblNombrecliente2 = new javax.swing.JLabel();
        txtNombreinformacion = new javax.swing.JTextField();
        lblCedula2 = new javax.swing.JLabel();
        txtCedulainformacion = new javax.swing.JTextField();
        lblPedidos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        lblTota = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTitulo.setText("Tienda de frutas");

        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliente.setText("Cliente");

        lblFrutas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFrutas.setText("Frutas");

        lblNombre.setText("Nombre:");

        txtNombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreclienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Cédula:");

        lblLista.setText("Lista de frutas:");

        cmbListafrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListafrutasActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código:");

        lblNombrefruta.setText("Nombre:");

        lblPrecio.setText("Precio:");

        btnRegistrar.setText("REGISTRAR PEDIDO");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo2.setText("Pedidos Registrados");

        lblListacedulas.setText("Lista de cédulas:");

        cmbCedulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCedulasActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar pedido");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Información del cliente");

        lblNombrecliente2.setText("Nombre:");

        lblCedula2.setText("Cédula:");

        lblPedidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPedidos.setText("Pedidos del cliente");

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblPedidos);

        lblTota.setText("TOTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txtNombrecliente))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLista)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigo)
                                        .addGap(4, 4, 4))
                                    .addComponent(lblFrutas)))
                            .addComponent(lblNombrefruta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbListafrutas, 0, 139, Short.MAX_VALUE)
                            .addComponent(txtCodigo)
                            .addComponent(txtNombrefruta)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblListacedulas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(lblCedula2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombrecliente2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCedulainformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(txtNombreinformacion))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPedidos)
                                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTota)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)))))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(lblFrutas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLista)
                            .addComponent(cmbListafrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombrefruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombrefruta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPrecio)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(btnRegistrar)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2))
                            .addComponent(lblTitulo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblListacedulas)
                            .addComponent(cmbCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblPedidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombrecliente2)
                                    .addComponent(txtNombreinformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCedula2)
                                    .addComponent(txtCedulainformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTota)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreclienteActionPerformed

    private void cmbListafrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListafrutasActionPerformed
        
        if(cmbListafrutas.getSelectedItem().toString().equals("Manzana")){
            txtCodigo.setText("1");
            txtNombrefruta.setText("Manzana");
            txtPrecio.setText("0.30");
        }else if(cmbListafrutas.getSelectedItem().toString().equals("Pera")){
            txtCodigo.setText("2");
            txtNombrefruta.setText("Pera");
            txtPrecio.setText("0.25");
        }else if(cmbListafrutas.getSelectedItem().toString().equals("Uva")){
            txtCodigo.setText("3");
            txtNombrefruta.setText("Uva");
            txtPrecio.setText("0.10");
        }else if(cmbListafrutas.getSelectedItem().toString().equals("Naranja")){
            txtCodigo.setText("4");
            txtNombrefruta.setText("Naranja");
            txtPrecio.setText("0.45");
        }else if(cmbListafrutas.getSelectedItem().toString().equals("Sandia")){
            txtCodigo.setText("5");
            txtNombrefruta.setText("Sandia");
            txtPrecio.setText("2.50");
        }else if(cmbListafrutas.getSelectedItem().toString().equals("")){
            txtCodigo.setText("");
            txtNombrefruta.setText("");
            txtPrecio.setText("");
        }
        
        
    }//GEN-LAST:event_cmbListafrutasActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombrecliente = txtNombrecliente.getText();
        String cedula = txtCedula.getText();
        String fruta = cmbListafrutas.getSelectedItem().toString();
        String precio = txtPrecio.getText();

        listaClientesModel.addElement(cedula);
        
        if (!nombrecliente.equals("") && !cedula.equals("") && !fruta.equals("")) {

            tblModelPedidos.addRow(new String[]{fruta, precio});
            
            txtNombrecliente.setText("");
            txtCedula.setText("");
        } else {

            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos vacios");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbCedulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCedulasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCedulasActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String filtrar = cmbCedulas.getSelectedItem().toString();
        
        TableRowSorter<DefaultTableModel> tblFiltro = new TableRowSorter<>(tblModelPedidos);
        tblPedidos.setRowSorter(tblFiltro);
        
        if(!filtrar.equals("")){
            tblFiltro.setRowFilter(RowFilter.regexFilter(filtrar,1));
        }else{
            tblPedidos.setRowSorter(tblFiltro);
        }
        
        txtCedulainformacion.setText(filtrar);
        
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCedulas;
    private javax.swing.JComboBox<String> cmbListafrutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCedula2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFrutas;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblListacedulas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombrecliente2;
    private javax.swing.JLabel lblNombrefruta;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTota;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulainformacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombrecliente;
    private javax.swing.JTextField txtNombrefruta;
    private javax.swing.JTextField txtNombreinformacion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
