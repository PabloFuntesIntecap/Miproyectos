
package vista;

/**
 *
 * @author Pablo_Fuentes
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        fcDirectorio = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        mmM = new javax.swing.JMenuBar();
        mmsArchivo = new javax.swing.JMenu();
        mmsiAbrir = new javax.swing.JMenuItem();
        mmsiGuardar = new javax.swing.JMenuItem();
        mmsFormato = new javax.swing.JMenu();
        mmsiTodasMayus = new javax.swing.JMenuItem();
        mmsiTodasMinus = new javax.swing.JMenuItem();
        mmsiTodasNegrita = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITOR TEXTO BÁSICO");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        mmsArchivo.setText("Archivo");

        mmsiAbrir.setText("Abrir");
        mmsArchivo.add(mmsiAbrir);

        mmsiGuardar.setText("Guardar");
        mmsiGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmsiGuardarActionPerformed(evt);
            }
        });
        mmsArchivo.add(mmsiGuardar);

        mmM.add(mmsArchivo);

        mmsFormato.setText("Formato de Texto");

        mmsiTodasMayus.setText("Todas Mayúsculas");
        mmsFormato.add(mmsiTodasMayus);

        mmsiTodasMinus.setText("Todas Minúsculas");
        mmsFormato.add(mmsiTodasMinus);

        mmsiTodasNegrita.setText("Todas en Negrita");
        mmsFormato.add(mmsiTodasNegrita);

        mmM.add(mmsFormato);

        setJMenuBar(mmM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmsiGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmsiGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmsiGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFileChooser fcDirectorio;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JMenuBar mmM;
    public javax.swing.JMenu mmsArchivo;
    public javax.swing.JMenu mmsFormato;
    public javax.swing.JMenuItem mmsiAbrir;
    public javax.swing.JMenuItem mmsiGuardar;
    public javax.swing.JMenuItem mmsiTodasMayus;
    public javax.swing.JMenuItem mmsiTodasMinus;
    public javax.swing.JMenuItem mmsiTodasNegrita;
    public javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
