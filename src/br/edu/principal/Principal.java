/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.principal;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    double Imc;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AlturamjLabel = new javax.swing.JLabel();
        alturamjTextField = new javax.swing.JTextField();
        PesokgjLabel = new javax.swing.JLabel();
        pesokgjTextField = new javax.swing.JTextField();
        IMCjLabel = new javax.swing.JLabel();
        imcjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        calcularimcjButton = new javax.swing.JButton();
        limparjButton2 = new javax.swing.JButton();
        faixapesojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AlturamjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        AlturamjLabel.setForeground(new java.awt.Color(255, 255, 255));
        AlturamjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlturamjLabel.setText("Altura(m)");

        alturamjTextField.setBackground(new java.awt.Color(0, 0, 0));
        alturamjTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        alturamjTextField.setForeground(new java.awt.Color(255, 255, 255));
        alturamjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alturamjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturamjTextFieldActionPerformed(evt);
            }
        });

        PesokgjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        PesokgjLabel.setForeground(new java.awt.Color(255, 255, 255));
        PesokgjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PesokgjLabel.setText("Peso(kg)");

        pesokgjTextField.setBackground(new java.awt.Color(0, 0, 0));
        pesokgjTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        pesokgjTextField.setForeground(new java.awt.Color(255, 255, 255));
        pesokgjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pesokgjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesokgjTextFieldActionPerformed(evt);
            }
        });

        IMCjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        IMCjLabel.setForeground(new java.awt.Color(255, 255, 255));
        IMCjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMCjLabel.setText("IMC");

        imcjTextField.setEditable(false);
        imcjTextField.setBackground(new java.awt.Color(0, 0, 0));
        imcjTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        imcjTextField.setForeground(new java.awt.Color(255, 255, 255));
        imcjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        imcjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imcjTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informe a altura em metros e o seu peso quilogramas(kg)");

        calcularimcjButton.setBackground(new java.awt.Color(0, 0, 0));
        calcularimcjButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        calcularimcjButton.setForeground(new java.awt.Color(255, 255, 255));
        calcularimcjButton.setText("Calcular IMC");
        calcularimcjButton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        calcularimcjButton.setBorderPainted(false);
        calcularimcjButton.setSelected(true);
        calcularimcjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularimcjButtonActionPerformed(evt);
            }
        });

        limparjButton2.setBackground(new java.awt.Color(0, 0, 0));
        limparjButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        limparjButton2.setForeground(new java.awt.Color(255, 255, 255));
        limparjButton2.setText("Limpar");
        limparjButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        limparjButton2.setBorderPainted(false);
        limparjButton2.setSelected(true);
        limparjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparjButton2ActionPerformed(evt);
            }
        });

        faixapesojLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        faixapesojLabel.setForeground(new java.awt.Color(255, 255, 255));
        faixapesojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(faixapesojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(IMCjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(imcjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PesokgjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlturamjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alturamjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesokgjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(calcularimcjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limparjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlturamjLabel)
                    .addComponent(alturamjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesokgjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesokgjLabel))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(IMCjLabel))
                    .addComponent(imcjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularimcjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(faixapesojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alturamjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturamjTextFieldActionPerformed
    
    }//GEN-LAST:event_alturamjTextFieldActionPerformed

    private void pesokgjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesokgjTextFieldActionPerformed

    }//GEN-LAST:event_pesokgjTextFieldActionPerformed

    private void calcularimcjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularimcjButtonActionPerformed

        String FaixaPeso = "0";
        String pesoKgStr = pesokgjTextField.getText();
        String alturaMStr = alturamjTextField.getText();
        try {
            double AlturaM = Double.parseDouble(alturaMStr.replaceAll(",", "."));
            double PesoKG = Double.parseDouble(pesoKgStr);
            
            Imc = PesoKG / (Math.pow(AlturaM , 2));
            imcjTextField.setText(String.format("%.2f", Imc));
            
            if(Imc < 16) {
                FaixaPeso = "Magreza grave";
            }
            else if(Imc >= 16 && Imc <= 16.9) {
                FaixaPeso = "Magreza moderada";
            }
            else if(Imc >= 17 && Imc <= 18.5) {
                FaixaPeso = "Magreza leve";
            }
            else if(Imc >= 18.6 && Imc <= 24.9) {
                FaixaPeso = "Peso ideal";
            }
            else if(Imc >= 25 && Imc <= 29.9) {
                FaixaPeso = "Sobrepeso";
            }
            else if(Imc >= 30 && Imc <= 34.9) {
                FaixaPeso = "Obesidade grau I";
            }
            else if(Imc >= 35 && Imc <= 39.9) {
                FaixaPeso = "Obesidade grau II ou severa";
            }
            else if(Imc > 40) {
                FaixaPeso = "Obesidade grau III ou mórbida";
            }
        
            faixapesojLabel.setText("Sua faixa de peso: " + FaixaPeso);
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Erro! Utilize apenas números.");  
        }
 
        
    }//GEN-LAST:event_calcularimcjButtonActionPerformed

    private void imcjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imcjTextFieldActionPerformed

    }//GEN-LAST:event_imcjTextFieldActionPerformed

    private void limparjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButton2ActionPerformed
        pesokgjTextField.setText("");
        alturamjTextField.setText("");
        imcjTextField.setText("");
    }//GEN-LAST:event_limparjButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlturamjLabel;
    private javax.swing.JLabel IMCjLabel;
    private javax.swing.JLabel PesokgjLabel;
    private javax.swing.JTextField alturamjTextField;
    private javax.swing.JButton calcularimcjButton;
    private javax.swing.JLabel faixapesojLabel;
    private javax.swing.JTextField imcjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparjButton2;
    private javax.swing.JTextField pesokgjTextField;
    // End of variables declaration//GEN-END:variables
}
