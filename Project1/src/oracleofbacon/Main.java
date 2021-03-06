/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

// *********** EQUIPO *********** FIDEL BARREAT - ALEJANDRO GUZMAN - YASMIN HAMMOUD
public class Main extends javax.swing.JFrame {

    GrafoMatriz grafo = new GrafoMatriz();
    boolean isOkRelaciones = false, isOkMovies = false, isOkActors = false;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();//prueba
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        cargarActoresButton = new javax.swing.JButton();
        cargarPeliculasButton = new javax.swing.JButton();
        cargarRelacionButton = new javax.swing.JButton();
        procederButton = new javax.swing.JButton();
        actoresPath = new javax.swing.JTextField();
        peliculasPath = new javax.swing.JTextField();
        relacionPath = new javax.swing.JTextField();
        checkRelacion = new javax.swing.JLabel();
        checkActores = new javax.swing.JLabel();
        checkPeliculas = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargarActoresButton.setBackground(new java.awt.Color(79, 176, 129));
        cargarActoresButton.setForeground(new java.awt.Color(255, 255, 255));
        cargarActoresButton.setText("Cargar actores");
        cargarActoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActoresButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cargarActoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 130, 30));

        cargarPeliculasButton.setBackground(new java.awt.Color(236, 159, 3));
        cargarPeliculasButton.setForeground(new java.awt.Color(255, 255, 255));
        cargarPeliculasButton.setText("Cargar peliculas");
        cargarPeliculasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPeliculasButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cargarPeliculasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 130, 30));

        cargarRelacionButton.setBackground(new java.awt.Color(65, 38, 11));
        cargarRelacionButton.setForeground(new java.awt.Color(255, 255, 255));
        cargarRelacionButton.setText("Cargar relación");
        cargarRelacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarRelacionButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cargarRelacionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 130, 30));

        procederButton.setBackground(new java.awt.Color(45, 89, 116));
        procederButton.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        procederButton.setText("Proceder");
        procederButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procederButtonActionPerformed(evt);
            }
        });
        jPanel1.add(procederButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 170, 40));

        actoresPath.setEditable(false);
        actoresPath.setBackground(new java.awt.Color(79, 176, 129));
        actoresPath.setRequestFocusEnabled(false);
        jPanel1.add(actoresPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 470, 30));

        peliculasPath.setEditable(false);
        peliculasPath.setBackground(new java.awt.Color(236, 159, 3));
        peliculasPath.setRequestFocusEnabled(false);
        jPanel1.add(peliculasPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 470, 30));

        relacionPath.setEditable(false);
        relacionPath.setBackground(new java.awt.Color(65, 38, 11));
        relacionPath.setForeground(new java.awt.Color(255, 255, 255));
        relacionPath.setRequestFocusEnabled(false);
        jPanel1.add(relacionPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 470, 30));

        checkRelacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dry-clean.png"))); // NOI18N
        jPanel1.add(checkRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 50, 50));

        checkActores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dry-clean.png"))); // NOI18N
        jPanel1.add(checkActores, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 50, 50));

        checkPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dry-clean.png"))); // NOI18N
        jPanel1.add(checkPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 50, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/main.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -5, 800, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarRelacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarRelacionButtonActionPerformed

        ImageIcon img;
        File fArchivoSeleccionado;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*CSV", "csv");
        seleccionarArchivo.setFileFilter(filtro);
        seleccionarArchivo.showOpenDialog(null);
        try {

            fArchivoSeleccionado = seleccionarArchivo.getSelectedFile();
            relacionPath.setText(fArchivoSeleccionado.getAbsolutePath());

            int iFileSize = countLines(fArchivoSeleccionado.getAbsolutePath()) - 1;
            if (iFileSize > 0) {
                try (FileReader fr = new FileReader(fArchivoSeleccionado)) {//El try cierra el FileReader
                    BufferedReader br = new BufferedReader(fr);
                    br.readLine();//Esto es para leer el encabezado e ignorarlo

                    String cadena;
                    String[][] oRelaciones = new String[iFileSize][2];
                    for (int i = 0; i < iFileSize; i++) {
                        cadena = br.readLine();
                        String[] registro = cadena.split(",");
                        oRelaciones[i][0] = registro[0];
                        //System.out.println(this.oRelaciones[i][0]); trae el person id
                        oRelaciones[i][1] = registro[1];
                        //System.out.println(this.oRelaciones[i][1]); trae el movie id
                    }
                    this.grafo.addRelacion(oRelaciones);
                }
                img = new ImageIcon("src/Imagenes/comprobado.png");
                this.isOkRelaciones = true;
            } else {
                //System.out.println("El numero de lineas debe ser mayor a 0 (sin contar el encabezado)");
                img = new ImageIcon("src/Imagenes/boton-x.png");
                JOptionPane.showMessageDialog(null, "El número de líneas debe ser mayor a 0 (sin contar el encabezado)", "Error!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            //System.out.println("Error: " + ex.getMessage());
            img = new ImageIcon("src/Imagenes/boton-x.png");
            JOptionPane.showMessageDialog(null, "Revise que sea un archivo válido", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        checkRelacion.setIcon(img);
    }//GEN-LAST:event_cargarRelacionButtonActionPerformed

    private void cargarActoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActoresButtonActionPerformed

        ImageIcon img;
        File fArchivoSeleccionado;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*CSV", "csv");
        seleccionarArchivo.setFileFilter(filtro);
        seleccionarArchivo.showOpenDialog(null);
        try {

            fArchivoSeleccionado = seleccionarArchivo.getSelectedFile();
            actoresPath.setText(fArchivoSeleccionado.getAbsolutePath());

            int iFileSize = countLines(fArchivoSeleccionado.getAbsolutePath()) - 1;
            if (iFileSize > 0) {
                try (FileReader fr = new FileReader(fArchivoSeleccionado)) {//El try cierra el FileReader
                    BufferedReader br = new BufferedReader(fr);
                    br.readLine();//Esto es para leer el encabezado e ignorarlo

                    Actor[] oActores = new Actor[iFileSize];
                    String cadena;
                    for (int i = 0; i < iFileSize; i++) {
                        cadena = br.readLine();
                        String[] registro = cadena.split(",");
                        if (registro[2] != null) {
                            oActores[i] = new Actor(registro[0], registro[1], registro[2]);
                        }
                        else {
                            oActores[i] = new Actor(registro[0], registro[1], "-1");
                        }
                    }
                    this.grafo.addActores(oActores);
                }
                img = new ImageIcon("src/Imagenes/comprobado.png");
                this.isOkActors = true;
            } else {
                //System.out.println("El numero de lineas debe ser mayor a 0 (sin contar el encabezado)");
                img = new ImageIcon("src/Imagenes/boton-x.png");
                JOptionPane.showMessageDialog(null, "El número de líneas debe ser mayor a 0 (sin contar el encabezado)", "Error!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            //System.out.println("Error: " + ex.getMessage());
            img = new ImageIcon("src/Imagenes/boton-x.png");
            JOptionPane.showMessageDialog(null, "Revise que sea un archivo válido", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        checkActores.setIcon(img);
    }//GEN-LAST:event_cargarActoresButtonActionPerformed

    private void cargarPeliculasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPeliculasButtonActionPerformed

        ImageIcon img;
        File fArchivoSeleccionado;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*CSV", "csv");
        seleccionarArchivo.setFileFilter(filtro);
        seleccionarArchivo.showOpenDialog(null);
        try {

            fArchivoSeleccionado = seleccionarArchivo.getSelectedFile();
            peliculasPath.setText(fArchivoSeleccionado.getAbsolutePath());

            int iFileSize = countLines(fArchivoSeleccionado.getAbsolutePath()) - 1;
            if (iFileSize > 0) {
                try (FileReader fr = new FileReader(fArchivoSeleccionado)) {//El try cierra el FileReader
                    BufferedReader br = new BufferedReader(fr);
                    br.readLine();//Esto es para leer el encabezado e ignorarlo

                    
                    Pelicula[] oPeliculas = new Pelicula[iFileSize];
                    String cadena;
                    for (int i = 0; i < iFileSize; i++) {
                        cadena = br.readLine();
                        String[] registro = cadena.split(",");
                        if (registro[2] != null) {
                            oPeliculas[i] = new Pelicula(registro[0], registro[1], registro[2]);
                        }
                        else {
                            oPeliculas[i] = new Pelicula(registro[0], registro[1], "-1");
                        }
                    }
                    this.grafo.addPeliculas(oPeliculas);
                }
                img = new ImageIcon("src/Imagenes/comprobado.png");
                this.isOkMovies = true;
            } else {
                //System.out.println("El numero de lineas debe ser mayor a 0 (sin contar el encabezado)");
                img = new ImageIcon("src/Imagenes/boton-x.png");
                JOptionPane.showMessageDialog(null, "El número de líneas debe ser mayor a 0 (sin contar el encabezado)", "Error!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            //System.out.println("Error: " + ex.getMessage());
            img = new ImageIcon("src/Imagenes/boton-x.png");
            JOptionPane.showMessageDialog(null, "Revise que sea un archivo válido", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        checkPeliculas.setIcon(img);
    }//GEN-LAST:event_cargarPeliculasButtonActionPerformed

    private void procederButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procederButtonActionPerformed

        if (this.isOkMovies && this.isOkActors && this.isOkRelaciones) {
            grafo.crearGrafo();
            new Acceso().setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Verifique que haya cargado todos los archivos de tipo CSV", "Warning!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_procederButtonActionPerformed

    public static int countLines(String filename) throws IOException {
        try (InputStream is = new BufferedInputStream(new FileInputStream(filename))) {
            byte[] c = new byte[1024];

            int readChars = is.read(c);
            if (readChars == -1) {
                // bail out if nothing to read
                return 0;
            }

            // make it easy for the optimizer to tune this loop
            int count = 0;
            while (readChars == 1024) {
                for (int i = 0; i < 1024;) {
                    if (c[i++] == '\n') {
                        ++count;
                    }
                }
                readChars = is.read(c);
            }

            // count remaining characters
            while (readChars != -1) {
                //System.out.println(readChars);
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        ++count;
                    }
                }
                readChars = is.read(c);
            }

            return count == 0 ? 1 : count;
        }
    }

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
    private javax.swing.JTextField actoresPath;
    private javax.swing.JButton cargarActoresButton;
    private javax.swing.JButton cargarPeliculasButton;
    private javax.swing.JButton cargarRelacionButton;
    private javax.swing.JLabel checkActores;
    private javax.swing.JLabel checkPeliculas;
    private javax.swing.JLabel checkRelacion;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField peliculasPath;
    private javax.swing.JButton procederButton;
    private javax.swing.JTextField relacionPath;
    // End of variables declaration//GEN-END:variables
}
