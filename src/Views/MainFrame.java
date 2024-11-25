package Views;

import Views.HomeView;
import Views.PMArrayListView;
import Views.PMLinkedListView;
import Views.SMLinkedListView;
import Views.PofSMLinkedListView;

import java.awt.CardLayout;

public class MainFrame extends javax.swing.JFrame {

    private final CardLayout cardLayout;

    public MainFrame() {
        initComponents();
        cardLayout = (CardLayout) getContentPane().getLayout();//bien quan li chuyen doi giua cac panel
        setSize(1024, 768);
        //Khoi tao cac panel
        HomeView home_Panel = new HomeView(cardLayout);
        PMArrayListView PMArrayListView = new PMArrayListView(cardLayout);
        PMLinkedListView PMLinkedListView = new PMLinkedListView(cardLayout);
        SMLinkedListView SMLinkedListView = new SMLinkedListView(cardLayout);
        PofSMLinkedListView PofSMLinkedListView = new PofSMLinkedListView(cardLayout);

        //Them cac panel vao mainFrame
        getContentPane().add(home_Panel, "home");
        getContentPane().add(PMArrayListView, "PMArrayListView");
        getContentPane().add(PMLinkedListView, "PMLinkedListView");
        getContentPane().add(SMLinkedListView, "SMLinkedListView");
        getContentPane().add(PofSMLinkedListView, "PofSMLinkedListView");

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
