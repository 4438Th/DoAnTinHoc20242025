package Frame;

import Panels.HomePanel;
import Panels.Mode1_Panel;
import Panels.Mode2_Panel;
import Panels.Mode3_Panel;
import Panels.Mode3_Product_Panel;

import java.awt.CardLayout;

public class MainFrame extends javax.swing.JFrame {

    private final CardLayout cardLayout;

    public MainFrame() {
        initComponents();
        cardLayout = (CardLayout) getContentPane().getLayout();//bien quan li chuyen doi giua cac panel
        setSize(1024, 768);
        //Khoi tao cac panel
        HomePanel home_Panel = new HomePanel(cardLayout);
        Mode1_Panel mode1_Panel = new Mode1_Panel(cardLayout);
        Mode2_Panel mode2_Panel = new Mode2_Panel(cardLayout);
        Mode3_Panel mode3_Panel = new Mode3_Panel(cardLayout);
        Mode3_Product_Panel mode3_product_Panel = new Mode3_Product_Panel(cardLayout);

        //Them cac panel vao mainFrame
        getContentPane().add(home_Panel, "home");
        getContentPane().add(mode1_Panel, "mode1");
        getContentPane().add(mode2_Panel, "mode2");
        getContentPane().add(mode3_Panel, "mode3");
        getContentPane().add(mode3_product_Panel, "mode3_product");

        //hien thi home_Panel lam mac dinh
        cardLayout.show(getContentPane(), "home");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý hàng hóa");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("main_frame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
