package daa.taresemana4;

import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    DefaultTableModel modelo;
    String[][] matriz = new String[Empresa.NUMERO_EMPLEADOS][3];
    Empresa miEmpresa1 = new Empresa();

    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        ocultarCampos();
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQuickSort = new javax.swing.JButton();
        btnBurbuja = new javax.swing.JButton();
        btnInsercion = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        etiCompa = new javax.swing.JLabel();
        etiInter = new javax.swing.JLabel();
        txtCompa = new javax.swing.JLabel();
        txtInter = new javax.swing.JLabel();
        btnOriginal = new javax.swing.JButton();
        btnInverso = new javax.swing.JButton();
        btnOrdenado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel1.setText("LABORATORIO 3");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btnQuickSort.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnQuickSort.setText("QuickSort");
        btnQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickSortActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuickSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 250, 60));

        btnBurbuja.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBurbuja.setText("Método Burbuja");
        btnBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurbujaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 250, 60));

        btnInsercion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnInsercion.setText("Inserción Directa");
        btnInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 250, 60));

        btnSeleccion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSeleccion.setText("Selección Directa");
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 250, 60));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabla.setAutoscrolls(false);
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 340, 350));

        titulo.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 260, 40));

        etiCompa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etiCompa.setText("N° de Comparaciones:");
        jPanel1.add(etiCompa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        etiInter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etiInter.setText("N° de Intercambios:");
        jPanel1.add(etiInter, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        txtCompa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(txtCompa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, -1));

        txtInter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(txtInter, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, -1));

        btnOriginal.setText("Original");
        btnOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalActionPerformed(evt);
            }
        });
        jPanel1.add(btnOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        btnInverso.setText("Inverso");
        btnInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInversoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        btnOrdenado.setText("Ordenado");
        btnOrdenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void MostrarTabla() {
        modelo = new DefaultTableModel() {

            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        String indices[] = {"Codigo", "Nombre", "Sueldos"};
        modelo.setDataVector(matriz, indices);

        tabla.setModel(modelo);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getTableHeader().setResizingAllowed(false);
    }

    private void btnInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionActionPerformed
        miEmpresa1.OrdenInsercionDirecta();
        titulo.setText("Insercion Directa");

        llenarDatos();

        MostrarTabla();
        miEmpresa1.resetArray();
        mostrarCampos();
    }//GEN-LAST:event_btnInsercionActionPerformed

    public void llenarDatos() {
        for (int i = 0; i < miEmpresa1.getNumeroDeEmpleados(); i++) {
            matriz[i][0] = String.valueOf(miEmpresa1.getCodigoDelEmpleado(i));
            matriz[i][1] = miEmpresa1.getNombreDelEmpleado(i);
            matriz[i][2] = String.valueOf(miEmpresa1.getSueldoDelEmpleado(i));
        }
        txtCompa.setText(String.valueOf(miEmpresa1.getComparaciones()));
        txtInter.setText(String.valueOf(miEmpresa1.getIntercambios()));
    }

    private void btnBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurbujaActionPerformed
        miEmpresa1.OrdenBurbuja();
        titulo.setText("Metodo Burbuja");

        llenarDatos();

        MostrarTabla();
        miEmpresa1.resetArray();
//        String[][] matriz = new String[miEmpresa1.getNumeroDeEmpleados()][3];
//
//        cadena += "\tMetodo de la Burbuja\n";
//        cadena += "\t-------------------------\n";
//
//        for (int i = 0; i < miEmpresa1.getNumeroDeEmpleados(); i++) {
//            cadena += String.format("%10d%10s%10.2f\n",
//                    miEmpresa1.getCodigoDelEmpleado(i),
//                    miEmpresa1.getNombreDelEmpleado(i),
//                    miEmpresa1.getSueldoDelEmpleado(i));
//        }
        mostrarCampos();
    }//GEN-LAST:event_btnBurbujaActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        miEmpresa1.OrdenSeleccionDirecta();
        titulo.setText("Seleccion Directa");

        llenarDatos();

        MostrarTabla();
        miEmpresa1.resetArray();
        mostrarCampos();
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalActionPerformed
        titulo.setText("Arreglo Original");

        setMatriz(miEmpresa1.arrayOriginal());
        MostrarTabla();
        ocultarCampos();
    }//GEN-LAST:event_btnOriginalActionPerformed

    private void btnQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickSortActionPerformed
        miEmpresa1.QuickSort();
        titulo.setText("QuickSort");

        llenarDatos();

        MostrarTabla();
        miEmpresa1.resetArray();
        mostrarCampos();
    }//GEN-LAST:event_btnQuickSortActionPerformed

    private void btnInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInversoActionPerformed
        titulo.setText("Arreglo Original");

        setMatriz(miEmpresa1.ArrayInverso());
        MostrarTabla();
        ocultarCampos();
    }//GEN-LAST:event_btnInversoActionPerformed

    private void btnOrdenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenadoActionPerformed
        titulo.setText("Arreglo Ordenado");

        miEmpresa1.ArrayOrdenado();
        MostrarTabla();
        ocultarCampos();
    }//GEN-LAST:event_btnOrdenadoActionPerformed

    public void ocultarCampos() {
        txtCompa.setVisible(false);
        txtInter.setVisible(false);

        etiCompa.setVisible(false);
        etiInter.setVisible(false);
    }

    public void mostrarCampos() {
        txtCompa.setVisible(true);
        txtInter.setVisible(true);
        etiCompa.setVisible(true);
        etiInter.setVisible(true);
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBurbuja;
    private javax.swing.JButton btnInsercion;
    private javax.swing.JButton btnInverso;
    private javax.swing.JButton btnOrdenado;
    private javax.swing.JButton btnOriginal;
    private javax.swing.JButton btnQuickSort;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JLabel etiCompa;
    private javax.swing.JLabel etiInter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtCompa;
    private javax.swing.JLabel txtInter;
    // End of variables declaration//GEN-END:variables
}
