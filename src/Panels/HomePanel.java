package Panels;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HomePanel extends javax.swing.JPanel {

    private final CardLayout cardLayout;

    public HomePanel(CardLayout cardLayout) {
        initComponents();
        this.cardLayout = cardLayout;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        menu_panel = new javax.swing.JPanel();
        mode1_Button = new javax.swing.JButton();
        mode2_Button = new javax.swing.JButton();
        mode3_Button = new javax.swing.JButton();
        exit_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(93, 123, 111));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        menu_panel.setBackground(new java.awt.Color(176, 212, 184));
        menu_panel.setLayout(new java.awt.GridBagLayout());

        mode1_Button.setBackground(new java.awt.Color(102, 102, 102));
        mode1_Button.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        mode1_Button.setForeground(new java.awt.Color(255, 255, 255));
        mode1_Button.setText("Danh sách đặc");
        mode1_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mode1_Button.setFocusPainted(false);
        mode1_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mode1_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode1_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 30, 40);
        menu_panel.add(mode1_Button, gridBagConstraints);

        mode2_Button.setBackground(new java.awt.Color(102, 102, 102));
        mode2_Button.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        mode2_Button.setForeground(new java.awt.Color(255, 255, 255));
        mode2_Button.setText("Danh sách liên kết đơn");
        mode2_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mode2_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode2_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 30, 40);
        menu_panel.add(mode2_Button, gridBagConstraints);

        mode3_Button.setBackground(new java.awt.Color(102, 102, 102));
        mode3_Button.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        mode3_Button.setForeground(new java.awt.Color(255, 255, 255));
        mode3_Button.setText("Nhà cung cấp");
        mode3_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mode3_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mode3_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode3_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 30, 40);
        menu_panel.add(mode3_Button, gridBagConstraints);

        exit_Button.setBackground(new java.awt.Color(102, 102, 102));
        exit_Button.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        exit_Button.setForeground(new java.awt.Color(255, 255, 255));
        exit_Button.setText("Thoát");
        exit_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        exit_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 30, 40);
        menu_panel.add(exit_Button, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(93, 123, 111));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ HÀNG HÓA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mode1_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode1_ButtonActionPerformed
        cardLayout.show(getParent(), "mode1");
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.setTitle("Quản lí hàng hóa - Danh sách đặc");
        }
    }//GEN-LAST:event_mode1_ButtonActionPerformed

    private void mode2_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode2_ButtonActionPerformed
        cardLayout.show(getParent(), "mode2");
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.setTitle("Quản lí hàng hóa - Danh sách liên kết đơn");
        }
    }//GEN-LAST:event_mode2_ButtonActionPerformed

    private void mode3_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode3_ButtonActionPerformed
        cardLayout.show(getParent(), "mode3");
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.setTitle("Quản lí hàng hóa - Nhà cung cấp");
        }
    }//GEN-LAST:event_mode3_ButtonActionPerformed

    private void exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JButton mode1_Button;
    private javax.swing.JButton mode2_Button;
    private javax.swing.JButton mode3_Button;
    // End of variables declaration//GEN-END:variables
}
