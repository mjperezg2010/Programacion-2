/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mjper
 */
public class Lab6 extends javax.swing.JFrame {

    /**
     * Creates new form Lab6
     */
    public Lab6() {
        initComponents();
        //String JOptionPane.showMessageDialog(this, "Hla");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregarservivo = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jt_raza = new javax.swing.JTextField();
        jt_ki = new javax.swing.JTextField();
        jt_maximoaños = new javax.swing.JTextField();
        jt_nombreplaneta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jd_modeli = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_seresvivos = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        ppm_modelie = new javax.swing.JPopupMenu();
        jmi_eliminare = new javax.swing.JMenuItem();
        jmi_modificare = new javax.swing.JMenuItem();
        jd_modificar = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jt_raza1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jt_ki1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jt_maximoaños1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jt_nombreplaneta1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmi_servivo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel3.setText("Seres Vivos");

        jLabel4.setText("Raza");

        jLabel5.setText("Ki");

        jLabel6.setText("Numero maximo años");

        jLabel7.setText("Nombre Planeta");

        jt_maximoaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_maximoañosActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_agregarservivoLayout = new javax.swing.GroupLayout(jd_agregarservivo.getContentPane());
        jd_agregarservivo.getContentPane().setLayout(jd_agregarservivoLayout);
        jd_agregarservivoLayout.setHorizontalGroup(
            jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarservivoLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarservivoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarservivoLayout.createSequentialGroup()
                        .addGroup(jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_agregarservivoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(48, 48, 48)
                                .addComponent(jt_nombreplaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_agregarservivoLayout.createSequentialGroup()
                                .addGroup(jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_agregarservivoLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarservivoLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(103, 103, 103))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarservivoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(85, 85, 85)))
                                .addGroup(jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jt_maximoaños, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jt_ki)
                                    .addComponent(jt_raza))))
                        .addGap(280, 280, 280))))
            .addGroup(jd_agregarservivoLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_agregarservivoLayout.setVerticalGroup(
            jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarservivoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jt_ki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_maximoaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jd_agregarservivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_nombreplaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jButton1)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jLabel8.setText("Seres Vivos");

        jl_seresvivos.setModel(new DefaultListModel());
        jl_seresvivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_seresvivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_seresvivos);

        jButton2.setText("Actualizar lista");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_modeliLayout = new javax.swing.GroupLayout(jd_modeli.getContentPane());
        jd_modeli.getContentPane().setLayout(jd_modeliLayout);
        jd_modeliLayout.setHorizontalGroup(
            jd_modeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modeliLayout.createSequentialGroup()
                .addGroup(jd_modeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modeliLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modeliLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modeliLayout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jButton2)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jd_modeliLayout.setVerticalGroup(
            jd_modeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modeliLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jmi_eliminare.setText("Eliminar");
        jmi_eliminare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminareActionPerformed(evt);
            }
        });
        ppm_modelie.add(jmi_eliminare);

        jmi_modificare.setText("Modificar");
        jmi_modificare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificareActionPerformed(evt);
            }
        });
        ppm_modelie.add(jmi_modificare);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel9.setText("Modificar");

        jLabel10.setText("Raza");

        jLabel11.setText("Ki");

        jLabel12.setText("Numero maximo años");

        jt_maximoaños1.setText(" ");

        jLabel13.setText("Nombre Planeta");

        jButton3.setText("Modificar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jButton3)
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_modificarLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarLayout.createSequentialGroup()
                            .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jd_modificarLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(48, 48, 48)
                                    .addComponent(jt_nombreplaneta1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_modificarLayout.createSequentialGroup()
                                    .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jd_modificarLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(32, 32, 32))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(103, 103, 103))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(85, 85, 85)))
                                    .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jt_maximoaños1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                        .addComponent(jt_ki1)
                                        .addComponent(jt_raza1))))
                            .addGap(191, 191, 191)))
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarLayout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
            .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_modificarLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jLabel9)
                    .addGap(45, 45, 45)
                    .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jt_raza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jt_ki1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jt_maximoaños1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jt_nombreplaneta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("Zeno-sama");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setText("Registro");

        jMenu3.setText("Abrir Universo");

        jMenuItem4.setText("Abrir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Agregar");

        jmi_servivo.setText("Seres Vivos");
        jmi_servivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_servivoActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_servivo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modificar Eliminar");

        jMenuItem2.setText("Ser vivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_servivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_servivoActionPerformed
        // TODO add your handling code here:

        this.jd_agregarservivo.setModal(true);
        jd_agregarservivo.pack();
        jd_agregarservivo.setLocationRelativeTo(this);
        jd_agregarservivo.setVisible(true);


    }//GEN-LAST:event_jmi_servivoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Seres_Vivos sv = new Seres_Vivos();

        sv.setRaza(jt_raza.getText());
        sv.setKi(jt_ki.getText());
        sv.setMaximoaños(jt_maximoaños.getText());
        sv.setNombreplaneta(jt_nombreplaneta.getText());
        
        universo.agregarservivo(sv);

        jt_raza.setText("");
        jt_ki.setText("");
        jt_maximoaños.setText("");
        jt_nombreplaneta.setText("");
        
        JOptionPane.showMessageDialog(this, "Ha sido midficado con exito");


    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
         JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto","txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion= jfc.showOpenDialog(this);
        
        FileWriter fw =null;
        BufferedWriter bw =null;
        if (seleccion == JFileChooser.APPROVE_OPTION){
            try {
                File fichero = null;
                if(jfc.getFileFilter().getDescription().equals("Archivos de Texto")){
                    archivo=new File (jfc.getSelectedFile().getPath()+".txt");
                    ruta= jfc.getSelectedFile().getPath()+".txt";
                }else{
                    archivo = jfc.getSelectedFile();
                }
                 
                  universo.setArchivo(archivo);
                  universo.cargarArchivo();
                  
                 
                  JOptionPane.showMessageDialog(this, "Universo cargado exitosamente");
                        
                        
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.jd_modeli.setModal(true);
        jd_modeli.pack();
        jd_modeli.setLocationRelativeTo(this);
        jd_modeli.setVisible(true);
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        //jl_seresvivos
        
        DefaultListModel modelo = (DefaultListModel) jl_seresvivos.getModel();
        modelo.removeAllElements();
        
        for (Seres_Vivos j : universo.getListaseresvivos()) {
            modelo.addElement(j);
        }
        
        //jl_seresvivos.setm
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jmi_eliminareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminareActionPerformed
        // TODO add your handling code here:

        DefaultListModel modelo = (DefaultListModel) jl_seresvivos.getModel();
        modelo.remove(jl_seresvivos.getSelectedIndex());

    }//GEN-LAST:event_jmi_eliminareActionPerformed

    private void jmi_modificareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificareActionPerformed
        // TODO add your handling code here:
        this.jd_modificar.setModal(true);
        jd_modificar.pack();
        jd_modificar.setLocationRelativeTo(this);
        jd_modificar.setVisible(true);
    }//GEN-LAST:event_jmi_modificareActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jl_seresvivos.getSelectedValue().setKi(jt_ki1.getText());
        jl_seresvivos.getSelectedValue().setRaza(jt_raza1.getText());
        jl_seresvivos.getSelectedValue().setMaximoaños(jt_maximoaños1.getText());
        jl_seresvivos.getSelectedValue().setNombreplaneta(jt_nombreplaneta1.getText());
        
        //Seres_Vivos ser = new Seres_Vivos();
        //ser.setRaza(jt_ki1.getText());
        
        Seres_Vivos sv = new Seres_Vivos();

        sv.setRaza(jt_raza.getText());
        sv.setKi(jt_ki.getText());
        sv.setMaximoaños(jt_maximoaños.getText());
        sv.setNombreplaneta(jt_nombreplaneta.getText());
        
       // universo.getListaseresvivos().remove(jl_seresvivos.getSelectedIndex());
        
        //universo.agregarservivo(sv);
        
        JOptionPane.showMessageDialog(this, "Ha sido midficado con exito");
        
        
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jl_seresvivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_seresvivosMouseClicked
        // TODO add your handling code here:
        
        if (evt.isMetaDown()) {
            ppm_modelie.show(evt.getComponent(), evt.getX(), evt.getY());

        }//Fin if
        
        
        
    }//GEN-LAST:event_jl_seresvivosMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        String nombre=JOptionPane.showInputDialog(this, "Ingrese el nobre del universo");
        universo.setNombre(nombre);
        
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        jfc.setSelectedFile(new File(universo.getNombre()+".txt"));
        int seleccion = jfc.showSaveDialog(this);
        
        //FileWriter fw = null;
       /// BufferedWriter bw = null;

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                if (jfc.getFileFilter().getDescription().equals("Archivos de Texto")) {
                    archivo = new File(jfc.getSelectedFile().getPath() + ".txt");
                    ruta = jfc.getSelectedFile().getPath();
                } else {
                    archivo = jfc.getSelectedFile();
                }
                
              //  fw = new FileWriter(archivo);
             //       bw = new BufferedWriter(fw);
                    

                    
                  
                 //   bw.flush();
                   universo.setArchivo(archivo);
                    universo.escribirArchivo();

                JOptionPane.showMessageDialog(this, "Universo creado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jt_maximoañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_maximoañosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_maximoañosActionPerformed

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
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab6().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_agregarservivo;
    private javax.swing.JDialog jd_modeli;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JList<Seres_Vivos> jl_seresvivos;
    private javax.swing.JMenuItem jmi_eliminare;
    private javax.swing.JMenuItem jmi_modificare;
    private javax.swing.JMenuItem jmi_servivo;
    private javax.swing.JTextField jt_ki;
    private javax.swing.JTextField jt_ki1;
    private javax.swing.JTextField jt_maximoaños;
    private javax.swing.JTextField jt_maximoaños1;
    private javax.swing.JTextField jt_nombreplaneta;
    private javax.swing.JTextField jt_nombreplaneta1;
    private javax.swing.JTextField jt_raza;
    private javax.swing.JTextField jt_raza1;
    private javax.swing.JPopupMenu ppm_modelie;
    // End of variables declaration//GEN-END:variables

    ArrayList<Seres_Vivos> listaSeres = new ArrayList();
    String ruta = "";
    File archivo = new File(ruta + ".txt");
    Universo universo = new Universo();
    ///

}
