/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author João Tomás Manuel
 */
public class Dados_Alunos extends javax.swing.JFrame {
 Alunos v = new Alunos();
 int xMouse;
int yMouse;
 
    /**
     * Creates new form Addlunos
     */
    public Dados_Alunos() {
        initComponents();
      
    }
//      public void DAlunos(String b , String f)
//    {
//        v.setMedia(b);
//        v.setResultado(f);
//    
//       
//
//      
//    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nota1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_nota2 = new javax.swing.JTextField();
        txt_nota3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        lbl_apagar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbl_turma = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

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
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(8, 40, 81));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_add_user_group_man_man_25px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Adicionar Alunos");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 70));

        tabela.setBackground(new java.awt.Color(8, 40, 81));
        tabela.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        tabela.setForeground(new java.awt.Color(255, 255, 255));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "nota-1", "nota-2", "nota-3", "Média", "Resoltado"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaMousePressed(evt);
            }
        });
        tabela.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tabelaMouseDragged(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 770, 260));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(8, 40, 81));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nome");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 80, 30));

        txt_nome.setForeground(new java.awt.Color(8, 40, 81));
        txt_nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(8, 40, 81)));
        txt_nome.setCaretColor(new java.awt.Color(8, 40, 81));
        jPanel1.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 230, 50));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(8, 40, 81));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nota do primeiro-1ª");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 150, 30));

        txt_nota1.setForeground(new java.awt.Color(8, 40, 81));
        txt_nota1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(8, 40, 81)));
        txt_nota1.setCaretColor(new java.awt.Color(8, 40, 81));
        jPanel1.add(txt_nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 50));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(8, 40, 81));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nota do primeiro-2ª");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 150, 30));

        txt_nota2.setForeground(new java.awt.Color(8, 40, 81));
        txt_nota2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(8, 40, 81)));
        txt_nota2.setCaretColor(new java.awt.Color(8, 40, 81));
        jPanel1.add(txt_nota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 170, 50));

        txt_nota3.setForeground(new java.awt.Color(8, 40, 81));
        txt_nota3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(8, 40, 81)));
        txt_nota3.setCaretColor(new java.awt.Color(8, 40, 81));
        jPanel1.add(txt_nota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 170, 50));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(8, 40, 81));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nota do primeiro-3ª");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 150, 30));

        jComboBox1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 80, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(241, 4, 245)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_apagar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lbl_apagar.setForeground(new java.awt.Color(8, 40, 81));
        lbl_apagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_apagar.setText("Apagar");
        lbl_apagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_apagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_apagarMouseClicked(evt);
            }
        });
        jPanel7.add(lbl_apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 100, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(8, 40, 81)));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(8, 40, 81));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Adicionar");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 100, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(8, 40, 81));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Fecha");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 100, 40));

        lbl_turma.setForeground(new java.awt.Color(8, 40, 81));
        lbl_turma.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(8, 40, 81)));
        lbl_turma.setCaretColor(new java.awt.Color(8, 40, 81));
        lbl_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_turmaActionPerformed(evt);
            }
        });
        jPanel1.add(lbl_turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 90, 50));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(8, 40, 81));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Turma");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       Menu_principal v = new Menu_principal();
       v.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    
     
        jComboBox1.addItem(lbl_turma.getText());
        String nome, nota1, nota2,nota3,resoltado;
        nome = txt_nome.getText();
          v.setNome(nome);
         nota1=txt_nota1.getText();
           v.setNota1(nota1);
         nota2=txt_nota2.getText();
           v.setNota2(nota2);
         nota3=txt_nota3.getText();
           v.setNota3(nota3);
          v.setTurma(lbl_turma.getText());
         try{
         float t=Float.parseFloat(nota1);
            float t1=Float.parseFloat(nota2);
            float t2=Float.parseFloat(nota3);
            float s=(t+t1+t2)/3;
            float media=s;
            if (media>=10) {
                 resoltado="aprovado"; 
            }else{
               resoltado="reprovado"; 
            }
         String converte=String .valueOf(media);
         v.setMedia1(converte);
         v.setResultado1(resoltado);
         v.alunos();
//         DAlunos(converte, resoltado);
         
         DefaultTableModel model=(DefaultTableModel)tabela.getModel();
         model.addRow(new Object[]{
            nome,
            nota1,
            nota2, 
            nota3,
            media,
            resoltado,
        });
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null,"Seleciona uma linha");
     }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void lbl_apagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_apagarMouseClicked
       try{
  int linha,coluna;
linha=tabela.getSelectedRow();
coluna=tabela.getSelectedColumn();
DefaultTableModel model=(DefaultTableM­odel)tabela.getModel();model.removeRow(linha);
}catch(Exception ex){
JOptionPane.showMessageDialog(null,"Seleciona Um Campo!");
}
                                          
    }//GEN-LAST:event_lbl_apagarMouseClicked

    private void lbl_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_turmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_turmaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
  int x =evt.getXOnScreen();
        int y =evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);      
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
          int x =evt.getXOnScreen();
        int y =evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void tabelaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseDragged
     
    }//GEN-LAST:event_tabelaMouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
       xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void tabelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMousePressed
   
    }//GEN-LAST:event_tabelaMousePressed

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
            java.util.logging.Logger.getLogger(Dados_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dados_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dados_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dados_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dados_Alunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_apagar;
    private javax.swing.JTextField lbl_turma;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nota1;
    private javax.swing.JTextField txt_nota2;
    private javax.swing.JTextField txt_nota3;
    // End of variables declaration//GEN-END:variables
}