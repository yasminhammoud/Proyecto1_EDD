/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author fidel
 */
public class Main extends javax.swing.JFrame {
    File fStars;
    File fMovies;
    File fRelation;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        actorsButton = new javax.swing.JButton();
        peliculasButton = new javax.swing.JButton();
        relationButton = new javax.swing.JButton();
        procederButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actorsButton.setBackground(new java.awt.Color(79, 176, 129));
        actorsButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        actorsButton.setText("Cargar actores");
        actorsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actorsButtonMouseClicked(evt);
            }
        });
        jPanel1.add(actorsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 130, 30));

        peliculasButton.setBackground(new java.awt.Color(236, 159, 3));
        peliculasButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        peliculasButton.setText("Cargar peliculas");
        peliculasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peliculasButtonMouseClicked(evt);
            }
        });
        jPanel1.add(peliculasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 130, 30));

        relationButton.setBackground(new java.awt.Color(65, 38, 11));
        relationButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        relationButton.setText("Cargar relacion");
        relationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relationButtonMouseClicked(evt);
            }
        });
        relationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(relationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 130, 30));

        procederButton.setBackground(new java.awt.Color(45, 89, 116));
        procederButton.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        procederButton.setText("Proceder");
        procederButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procederButtonMouseClicked(evt);
            }
        });
        procederButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procederButtonActionPerformed(evt);
            }
        });
        jPanel1.add(procederButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 170, 40));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(79, 176, 129));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 410, 30));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(236, 159, 3));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 410, 30));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(65, 38, 11));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 410, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/main.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -5, 800, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procederButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procederButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procederButtonActionPerformed

    private void relationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relationButtonActionPerformed

    private void actorsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actorsButtonMouseClicked
        // TODO add your handling code here:
        File archivoSeleccionado;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*CSV" , "csv");
        seleccionarArchivo.setFileFilter(filtro);
        seleccionarArchivo.showOpenDialog(null);
        this.fStars = seleccionarArchivo.getSelectedFile();
        jTextArea1.setText(this.fStars.getAbsolutePath());
        try{
           
           FileReader fr = new FileReader(this.fStars);
           BufferedReader br = new BufferedReader(fr);
           
//           String cadena;
//           Object[] elemento = new Object[3];
           
//           while((cadena = br.readLine())!= null)
//           {
//               String registro[] = cadena.split(",");
//               elemento[0] = registro[0];
//               elemento[1] = registro[1];
//               elemento[2] = registro[2];
//               System.out.println(elemento[1]);
//               
//           }
           
       }catch(Exception ex){
           
       }
    }//GEN-LAST:event_actorsButtonMouseClicked

    private void peliculasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peliculasButtonMouseClicked
        // TODO add your handling code here:
        File archivoSeleccionado;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*CSV" , "csv");
        seleccionarArchivo.setFileFilter(filtro);
        seleccionarArchivo.showOpenDialog(null);
        this.fMovies = seleccionarArchivo.getSelectedFile();
        jTextArea3.setText(this.fMovies.getAbsolutePath());
        try{
           
           FileReader fr = new FileReader(this.fMovies);
           BufferedReader br = new BufferedReader(fr);
           
//           String cadena;
//           Object[] elemento = new Object[3];
           
//           while((cadena = br.readLine())!= null)
//           {
//               String registro[] = cadena.split(",");
//               elemento[0] = registro[0];
//               elemento[1] = registro[1];
//               elemento[2] = registro[2];
//               System.out.println(elemento[1]);
//               
//           }
           
       }catch(Exception ex){
           
       }
    }//GEN-LAST:event_peliculasButtonMouseClicked

    private void relationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relationButtonMouseClicked
        // TODO add your handling code here:
        File archivoSeleccionado;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*CSV" , "csv");
        seleccionarArchivo.setFileFilter(filtro);
        seleccionarArchivo.showOpenDialog(null);
        this.fRelation = seleccionarArchivo.getSelectedFile();
        jTextArea2.setText(this.fRelation.getAbsolutePath());
        try{
           
           FileReader fr = new FileReader(this.fRelation);
           BufferedReader br = new BufferedReader(fr);
           
//           String cadena;
//           Object[] elemento = new Object[3];
           
//           while((cadena = br.readLine())!= null)
//           {
//               String registro[] = cadena.split(",");
//               elemento[0] = registro[0];
//               elemento[1] = registro[1];
//               elemento[2] = registro[2];
//               System.out.println(elemento[1]);
//               
//           }
           
       }catch(Exception ex){
           
       }
    }//GEN-LAST:event_relationButtonMouseClicked

    private void procederButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procederButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_procederButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actorsButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JButton peliculasButton;
    private javax.swing.JButton procederButton;
    private javax.swing.JButton relationButton;
    // End of variables declaration//GEN-END:variables
}
