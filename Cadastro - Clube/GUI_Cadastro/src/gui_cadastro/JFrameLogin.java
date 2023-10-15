package gui_cadastro;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author richard
 */
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
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

        btnSair = new javax.swing.JButton();
        pnTituloLogin = new javax.swing.JPanel();
        lblTituloLogin = new javax.swing.JLabel();
        btnEntrarLogin = new javax.swing.JButton();
        btnSairLogin = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        pwSenha = new javax.swing.JPasswordField();

        btnSair.setBackground(new java.awt.Color(77, 79, 81));
        btnSair.setFont(new java.awt.Font("URW Gothic", 0, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(191, 191, 191));
        btnSair.setText("Sair");
        btnSair.setAlignmentY(0.0F);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuário");
        setResizable(false);

        pnTituloLogin.setBackground(new java.awt.Color(40, 40, 40));
        pnTituloLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(54, 54, 54))); // NOI18N
        pnTituloLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTituloLogin.setFont(new java.awt.Font("URW Gothic", 1, 28)); // NOI18N
        lblTituloLogin.setForeground(new java.awt.Color(191, 191, 191));
        lblTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloLogin.setText("SmartClub - Login");

        javax.swing.GroupLayout pnTituloLoginLayout = new javax.swing.GroupLayout(pnTituloLogin);
        pnTituloLogin.setLayout(pnTituloLoginLayout);
        pnTituloLoginLayout.setHorizontalGroup(
            pnTituloLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLoginLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lblTituloLogin)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        pnTituloLoginLayout.setVerticalGroup(
            pnTituloLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTituloLoginLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblTituloLogin)
                .addGap(33, 33, 33))
        );

        btnEntrarLogin.setBackground(new java.awt.Color(95, 95, 95));
        btnEntrarLogin.setFont(new java.awt.Font("URW Gothic", 0, 16)); // NOI18N
        btnEntrarLogin.setForeground(java.awt.Color.white);
        btnEntrarLogin.setText("Entrar");
        btnEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLoginActionPerformed(evt);
            }
        });

        btnSairLogin.setBackground(new java.awt.Color(95, 95, 95));
        btnSairLogin.setFont(new java.awt.Font("URW Gothic", 0, 16)); // NOI18N
        btnSairLogin.setForeground(java.awt.Color.white);
        btnSairLogin.setText("Sair");
        btnSairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairLoginActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        lblUsuario.setForeground(java.awt.Color.white);
        lblUsuario.setText("Usuário");

        lblSenha.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        lblSenha.setForeground(java.awt.Color.white);
        lblSenha.setText("Senha");

        tfUsuario.setBackground(new java.awt.Color(81, 81, 81));
        tfUsuario.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        tfUsuario.setForeground(java.awt.Color.white);

        pwSenha.setBackground(new java.awt.Color(81, 81, 81));
        pwSenha.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        pwSenha.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTituloLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSenha)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(pwSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSairLogin)
                .addGap(18, 18, 18)
                .addComponent(btnEntrarLogin)
                .addGap(90, 90, 90))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEntrarLogin, btnSairLogin});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblSenha, lblUsuario});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblUsuario))
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(pwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarLogin)
                    .addComponent(btnSairLogin))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEntrarLogin, btnSairLogin});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblSenha, lblUsuario});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairLoginActionPerformed

    private void btnEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarLoginActionPerformed
        if((tfUsuario.getText().equals("admin")) && (pwSenha.getText().equals("123"))){ //Equals -> comparação
            this.dispose(); //Fechando a janela atual
            //Nova Janela
            JFrameBase jframe = new JFrameBase();
            jframe.setLocationRelativeTo(null);
            jframe.setVisible(true);
            jframe.getContentPane().setBackground(Color.darkGray);
        }else{
            JOptionPane.showMessageDialog(null, "Login de Usuário incorreto!");
                tfUsuario.setText(null);
                    pwSenha.setText(null);
        }
    }//GEN-LAST:event_btnEntrarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSairLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnTituloLogin;
    private javax.swing.JPasswordField pwSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}