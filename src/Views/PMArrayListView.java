package Views;

import Classes.Product;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import Controllers.ArrayListProduct;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.*;

public class PMArrayListView extends javax.swing.JPanel {

    private final CardLayout cardLayout;
    private final DefaultTableModel tableModel;
    private final ArrayListProduct list = new ArrayListProduct();
    DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private int rowIndex = -1;

    public PMArrayListView(CardLayout cardLayout) {
        initComponents();
        this.cardLayout = cardLayout;
        tableModel = (DefaultTableModel) data1_Table.getModel();
        Product pd1 = new Product("MA01", "Hang hoa 1", LocalDate.parse("01-01-2024", date_formatter), 1, 1000);
        Product pd2 = new Product("MA02", "Hang hoa 2", LocalDate.parse("02-02-2024", date_formatter), 2, 2000);
        Product pd3 = new Product("MA03", "Hang hoa 3", LocalDate.parse("03-03-2024", date_formatter), 3, 3000);

        list.add(pd1);
        list.add(pd2);
        list.add(pd3);

        upDateTableData(list);
        addComboBoxListeners(sortOptions_Panel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        sideMenu_Panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        search_Id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        search_Name = new javax.swing.JTextField();
        search_Button = new javax.swing.JButton();
        main_Panel = new javax.swing.JPanel();
        menu_Panel = new javax.swing.JPanel();
        infor_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        product_Price_TextField = new javax.swing.JTextField();
        product_Quantity_TextField = new javax.swing.JTextField();
        product_Id_TextField = new javax.swing.JTextField();
        product_Name_TextField = new javax.swing.JTextField();
        product_Date_FormattedTextField = new javax.swing.JFormattedTextField();
        button_Panel = new javax.swing.JPanel();
        add_Button = new javax.swing.JButton();
        update_Button = new javax.swing.JButton();
        remove_Button = new javax.swing.JButton();
        refresh_Button = new javax.swing.JButton();
        removeAll_Button = new javax.swing.JButton();
        clearInfo_Button = new javax.swing.JButton();
        sorter_Panel = new javax.swing.JPanel();
        sortOptions_Panel = new javax.swing.JPanel();
        product_Id_SortOption = new javax.swing.JComboBox<>();
        product_Name_SortOption = new javax.swing.JComboBox<>();
        product_Date_SortOption = new javax.swing.JComboBox<>();
        product_Quantity_SortOption = new javax.swing.JComboBox<>();
        product_Price_SortOption = new javax.swing.JComboBox<>();
        dataWrapper_ScrollPane = new javax.swing.JScrollPane();
        data1_Table = new javax.swing.JTable();
        buttonBar_Panel = new javax.swing.JPanel();
        home_Button1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        sideMenu_Panel.setBackground(new java.awt.Color(176, 212, 184));
        sideMenu_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sideMenu_Panel.setAlignmentX(0.0F);
        sideMenu_Panel.setAlignmentY(0.0F);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tìm kiếm hàng hóa");

        jLabel8.setText("Mã hàng hóa :");

        jLabel9.setText("Tên hàng hóa :");

        search_Button.setBackground(new java.awt.Color(93, 123, 111));
        search_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        search_Button.setForeground(new java.awt.Color(255, 255, 255));
        search_Button.setText("Tìm kiếm");
        search_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        search_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideMenu_PanelLayout = new javax.swing.GroupLayout(sideMenu_Panel);
        sideMenu_Panel.setLayout(sideMenu_PanelLayout);
        sideMenu_PanelLayout.setHorizontalGroup(
            sideMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(search_Id)
                    .addComponent(search_Name)
                    .addGroup(sideMenu_PanelLayout.createSequentialGroup()
                        .addGroup(sideMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideMenu_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        sideMenu_PanelLayout.setVerticalGroup(
            sideMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_Panel.setBackground(new java.awt.Color(93, 123, 111));
        main_Panel.setAlignmentX(0.0F);
        main_Panel.setAlignmentY(0.0F);

        menu_Panel.setBackground(new java.awt.Color(176, 212, 184));
        menu_Panel.setAlignmentX(0.0F);
        menu_Panel.setAlignmentY(0.0F);

        infor_Panel.setBackground(new java.awt.Color(176, 212, 184));
        infor_Panel.setAlignmentX(0.0F);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin hàng hóa");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã hàng hóa :");
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên hàng hóa :");
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ngày sản xuất :");
        jLabel4.setPreferredSize(new java.awt.Dimension(95, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Số lượng :");
        jLabel5.setPreferredSize(new java.awt.Dimension(95, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Giá tiền :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setPreferredSize(new java.awt.Dimension(95, 20));

        product_Name_TextField.setToolTipText("");

        product_Date_FormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        product_Date_FormattedTextField.setValue(new Date());

        javax.swing.GroupLayout infor_PanelLayout = new javax.swing.GroupLayout(infor_Panel);
        infor_Panel.setLayout(infor_PanelLayout);
        infor_PanelLayout.setHorizontalGroup(
            infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infor_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(infor_PanelLayout.createSequentialGroup()
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infor_PanelLayout.createSequentialGroup()
                                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(product_Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(product_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infor_PanelLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(product_Date_FormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGroup(infor_PanelLayout.createSequentialGroup()
                                    .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(product_Price_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(product_Quantity_TextField)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infor_PanelLayout.setVerticalGroup(
            infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infor_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(product_Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infor_PanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_Date_FormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infor_PanelLayout.createSequentialGroup()
                        .addComponent(product_Quantity_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        button_Panel.setBackground(new java.awt.Color(93, 123, 111));
        button_Panel.setAlignmentX(0.0F);
        button_Panel.setAlignmentY(0.0F);
        button_Panel.setPreferredSize(new java.awt.Dimension(0, 0));
        java.awt.GridBagLayout button_PanelLayout = new java.awt.GridBagLayout();
        button_PanelLayout.columnWidths = new int[] {0, 0, 0};
        button_PanelLayout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
        button_Panel.setLayout(button_PanelLayout);

        add_Button.setBackground(new java.awt.Color(176, 212, 184));
        add_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add_Button.setText("Thêm");
        add_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(add_Button, gridBagConstraints);

        update_Button.setBackground(new java.awt.Color(176, 212, 184));
        update_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_Button.setText("Cập nhật");
        update_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        update_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(update_Button, gridBagConstraints);

        remove_Button.setBackground(new java.awt.Color(176, 212, 184));
        remove_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        remove_Button.setText("Xóa");
        remove_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        remove_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        remove_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(remove_Button, gridBagConstraints);

        refresh_Button.setBackground(new java.awt.Color(176, 212, 184));
        refresh_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        refresh_Button.setText("Làm mới");
        refresh_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        refresh_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        refresh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(refresh_Button, gridBagConstraints);

        removeAll_Button.setBackground(new java.awt.Color(176, 212, 184));
        removeAll_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeAll_Button.setText("Xóa danh sách");
        removeAll_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeAll_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        removeAll_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAll_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(removeAll_Button, gridBagConstraints);

        clearInfo_Button.setBackground(new java.awt.Color(93, 123, 111));
        clearInfo_Button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearInfo_Button.setForeground(new java.awt.Color(255, 255, 255));
        clearInfo_Button.setText("Clear");
        clearInfo_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInfo_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_PanelLayout = new javax.swing.GroupLayout(menu_Panel);
        menu_Panel.setLayout(menu_PanelLayout);
        menu_PanelLayout.setHorizontalGroup(
            menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_PanelLayout.createSequentialGroup()
                .addGroup(menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infor_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearInfo_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        menu_PanelLayout.setVerticalGroup(
            menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_PanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_PanelLayout.createSequentialGroup()
                        .addComponent(infor_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clearInfo_Button)
                        .addContainerGap())
                    .addComponent(button_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        sorter_Panel.setBackground(new java.awt.Color(93, 123, 111));
        sorter_Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sortOptions_Panel.setBackground(new java.awt.Color(93, 123, 111));

        product_Id_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hàng hóa", "Tăng dần", "Giảm dần" }));
        product_Id_SortOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_Id_SortOptionActionPerformed(evt);
            }
        });

        product_Name_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên hàng hóa", "A -> Z", "Z -> A" }));
        product_Name_SortOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_Name_SortOptionActionPerformed(evt);
            }
        });

        product_Date_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày sản xuất", "Mới nhất", "Cũ nhất" }));
        product_Date_SortOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_Date_SortOptionActionPerformed(evt);
            }
        });

        product_Quantity_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Số lượng", "Tăng dần", "Giảm dần" }));
        product_Quantity_SortOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_Quantity_SortOptionActionPerformed(evt);
            }
        });

        product_Price_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giá tiền", "Tăng dần", "Giảm dần" }));
        product_Price_SortOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_Price_SortOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sortOptions_PanelLayout = new javax.swing.GroupLayout(sortOptions_Panel);
        sortOptions_Panel.setLayout(sortOptions_PanelLayout);
        sortOptions_PanelLayout.setHorizontalGroup(
            sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
            .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sortOptions_PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(product_Id_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(product_Name_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(product_Date_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(product_Quantity_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(product_Price_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sortOptions_PanelLayout.setVerticalGroup(
            sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sortOptions_PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(product_Id_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(product_Name_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(product_Date_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(product_Quantity_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(product_Price_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout sorter_PanelLayout = new javax.swing.GroupLayout(sorter_Panel);
        sorter_Panel.setLayout(sorter_PanelLayout);
        sorter_PanelLayout.setHorizontalGroup(
            sorter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sorter_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sortOptions_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sorter_PanelLayout.setVerticalGroup(
            sorter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sorter_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sortOptions_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dataWrapper_ScrollPane.setBackground(new java.awt.Color(176, 212, 184));
        dataWrapper_ScrollPane.setBorder(null);
        dataWrapper_ScrollPane.setAlignmentX(0.0F);
        dataWrapper_ScrollPane.setAlignmentY(0.0F);

        data1_Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        data1_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã hàng hóa", "Tên hàng hóa", "Ngày sản xuất", "Số lượng", "Giá tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data1_Table.setAlignmentX(0.0F);
        data1_Table.setAlignmentY(0.0F);
        data1_Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        data1_Table.setColumnSelectionAllowed(true);
        data1_Table.getTableHeader().setReorderingAllowed(false);
        data1_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data1_TableMouseClicked(evt);
            }
        });
        dataWrapper_ScrollPane.setViewportView(data1_Table);
        data1_Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (data1_Table.getColumnModel().getColumnCount() > 0) {
            data1_Table.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout main_PanelLayout = new javax.swing.GroupLayout(main_Panel);
        main_Panel.setLayout(main_PanelLayout);
        main_PanelLayout.setHorizontalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sorter_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(main_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(dataWrapper_ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        main_PanelLayout.setVerticalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorter_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dataWrapper_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        buttonBar_Panel.setBackground(new java.awt.Color(0, 153, 153));
        buttonBar_Panel.setPreferredSize(new java.awt.Dimension(100, 30));

        home_Button1.setBackground(new java.awt.Color(176, 212, 184));
        home_Button1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        home_Button1.setText("Home");
        home_Button1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        home_Button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home_Button1.setPreferredSize(new java.awt.Dimension(100, 27));
        home_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonBar_PanelLayout = new javax.swing.GroupLayout(buttonBar_Panel);
        buttonBar_Panel.setLayout(buttonBar_PanelLayout);
        buttonBar_PanelLayout.setHorizontalGroup(
            buttonBar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBar_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonBar_PanelLayout.setVerticalGroup(
            buttonBar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBar_PanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(home_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(sideMenu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(buttonBar_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonBar_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideMenu_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    //cap nhat du lieu cua danh sach vao table
    private void upDateTableData(ArrayListProduct danhSach) {
        tableModel.setRowCount(0);
        Object[][] data = danhSach.toTableData();
        for (Object[] rowData : data) {
            tableModel.addRow(rowData);
        }
        rowIndex = -1;
    }

    //Quet va them ActionListener cho tat ca JComboBox trong sortOptions_Panel
    private void addComboBoxListeners(JPanel panel) {
        for (Component comp : panel.getComponents()) {
            // Kiem tra xem thanh phan co phai la JComboBox hay khong
            if (comp instanceof JComboBox) {
                // Chuyen doi kieu thanh JComboBox<String>
                JComboBox<String> comboBox = (JComboBox<String>) comp;

                // Them ActionListener cho JComboBox
                comboBox.addActionListener(e -> {
                    // Kiem tra neu lua chon khong phai la mac dinh
                    if (comboBox.getSelectedIndex() != 0) {
                        resetOtherComboBoxes(panel, comboBox);
                    }
                });
            }
        }
    }

    // Ham de dat lai cac JComboBox khac ve gia tri mac dinh
    private static void resetOtherComboBoxes(JPanel panel, JComboBox<String> selectedComboBox) {
        for (Component comp : panel.getComponents()) {
            // Kiem tra xem thanh phan co phai la JComboBox va khong phai la JComboBox duoc chon
            if (comp instanceof JComboBox && comp != selectedComboBox) {
                // Dat lai chi so duoc chon cua JComboBox ve mac dinh (chi so 0)
                ((JComboBox<String>) comp).setSelectedIndex(0);
            }
        }
    }

    // Ham de dat lai cac JComboBox ve gia tri mac dinh
    private static void resetComboBoxes(JPanel panel) {
        for (Component comp : panel.getComponents()) {
            // Kiem tra xem thanh phan co phai la JComboBox
            if (comp instanceof JComboBox) {
                // Dat lai chi so duoc chon cua JComboBox ve mac dinh (chi so 0)
                ((JComboBox<String>) comp).setSelectedIndex(0);
            }
        }
    }

    //xu li nut Home
    private void home_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_Button1ActionPerformed
        cardLayout.show(getParent(), "home");
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.setTitle("Quản lí hàng hóa");
        }
    }//GEN-LAST:event_home_Button1ActionPerformed

    //xu li nut tim kiem
    private void search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_ButtonActionPerformed
        if (list.getCurrent() == 0) {
            JOptionPane.showMessageDialog(this, "Danh sách rỗng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            //reset ô tìm kiếm
            search_Name.setText("");
            search_Id.setText("");
        } else {
            if (search_Name.getText().equals("") && search_Id.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hoặc tên hàng hóa để tìm kiếm!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            } else {
                ArrayListProduct search_list = list.search(search_Id.getText(), search_Name.getText());
                if (search_list.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Tìm thấy " + search_list.getCurrent() + " kết quả!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    upDateTableData(search_list);
                }
                //reset ô tìm kiếm
                search_Name.setText("");
                search_Id.setText("");
            }
        }
    }//GEN-LAST:event_search_ButtonActionPerformed

    //xu li nut them hang hoa
    private void add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ButtonActionPerformed
        if (product_Id_TextField.getText().equals("") || product_Name_TextField.getText().equals("") || product_Quantity_TextField.getText().equals("") || product_Price_TextField.getText().equals("") || product_Date_FormattedTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            String id = product_Id_TextField.getText();
            String name = product_Name_TextField.getText();
            LocalDate date = LocalDate.parse(product_Date_FormattedTextField.getText(), date_formatter);
            int quantity = Integer.parseInt(product_Quantity_TextField.getText());
            double price = Double.parseDouble(product_Price_TextField.getText());
            
            Product newProduct = new Product(id, name, date, quantity, price);
            
            if (list.isEmpty()) {
                list.add(newProduct);
                upDateTableData(list);
                JOptionPane.showMessageDialog(this, "Thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (list.isFull()) {
                    JOptionPane.showMessageDialog(this, "Danh sách đã đầy!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                } else if (!list.checkId(newProduct)) {
                    JOptionPane.showMessageDialog(this, "Mã hàng hóa đã tồn tại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                } else {
                    list.add(newProduct);
                    upDateTableData(list);
                    JOptionPane.showMessageDialog(this, "Thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_add_ButtonActionPerformed

    //lay thong tin hang hoa duoc click chon trong table
    private void data1_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data1_TableMouseClicked
        rowIndex = data1_Table.getSelectedRow();
        product_Id_TextField.setText((String) tableModel.getValueAt(rowIndex, 1));
        product_Name_TextField.setText((String) tableModel.getValueAt(rowIndex, 2));

        String dateStr = (String) tableModel.getValueAt(rowIndex, 3);
        LocalDate date = LocalDate.parse(dateStr, date_formatter);
        Date dateDate = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
        product_Date_FormattedTextField.setValue(dateDate);

        product_Quantity_TextField.setText(String.valueOf(tableModel.getValueAt(rowIndex, 4)));
        product_Price_TextField.setText(String.valueOf(tableModel.getValueAt(rowIndex, 5)));
    }//GEN-LAST:event_data1_TableMouseClicked

    //xu li nut cap nhat thong tin
    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hàng hóa muốn sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String id = product_Id_TextField.getText();
        String name = product_Name_TextField.getText();
        LocalDate date = LocalDate.parse(product_Date_FormattedTextField.getText(), date_formatter);
        int quantity = Integer.parseInt(product_Quantity_TextField.getText());
        double price = Double.parseDouble(product_Price_TextField.getText());
        
        Product updateHH = new Product(id, name, date, quantity, price);
        
        list.update(updateHH, rowIndex);
        upDateTableData(list);
        JOptionPane.showMessageDialog(this, "Sửa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_update_ButtonActionPerformed

    //xu li nut xoa hang hoa
    private void remove_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_ButtonActionPerformed
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hàng hóa muốn xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int comfirm = JOptionPane.showConfirmDialog(this, "Xác nhận xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (comfirm == JOptionPane.YES_OPTION) {
            if (list.remove(rowIndex)) {
                upDateTableData(list);
                JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                clearInfor();
            } else {
                JOptionPane.showMessageDialog(this, "Không thể xóa! Vị trí không hợp lệ!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_remove_ButtonActionPerformed

    //xu li nut lam moi table
    private void refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_ButtonActionPerformed
        clearInfor();
        resetComboBoxes(sortOptions_Panel);
        upDateTableData(list);
    }//GEN-LAST:event_refresh_ButtonActionPerformed

    //xu li cac options sap xep
    private void product_Id_SortOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_Id_SortOptionActionPerformed
        int mode = (product_Id_SortOption.getSelectedIndex() == 1) ? 0 : 1;
        if (product_Id_SortOption.getSelectedIndex() != 0) {
            ArrayListProduct sorted_List = list.sort_id(mode);
            upDateTableData(sorted_List);
        }
    }//GEN-LAST:event_product_Id_SortOptionActionPerformed

    private void product_Name_SortOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_Name_SortOptionActionPerformed
        int mode = (product_Name_SortOption.getSelectedIndex() == 1) ? 0 : 1;
        if (product_Name_SortOption.getSelectedIndex() != 0) {
            ArrayListProduct sorted_List = list.sort_name(mode);
            upDateTableData(sorted_List);
        }
    }//GEN-LAST:event_product_Name_SortOptionActionPerformed

    private void product_Quantity_SortOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_Quantity_SortOptionActionPerformed
        int mode = (product_Quantity_SortOption.getSelectedIndex() == 1) ? 0 : 1;
        if (product_Quantity_SortOption.getSelectedIndex() != 0) {
            ArrayListProduct sorted_List = list.sort_quantity(mode);
            upDateTableData(sorted_List);
        }
    }//GEN-LAST:event_product_Quantity_SortOptionActionPerformed

    private void product_Price_SortOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_Price_SortOptionActionPerformed
        int mode = (product_Price_SortOption.getSelectedIndex() == 1) ? 0 : 1;
        if (product_Price_SortOption.getSelectedIndex() != 0) {
            ArrayListProduct sorted_List = list.sort_price(mode);
            upDateTableData(sorted_List);
        }
    }//GEN-LAST:event_product_Price_SortOptionActionPerformed

    private void product_Date_SortOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_Date_SortOptionActionPerformed
        int mode = (product_Date_SortOption.getSelectedIndex() == 1) ? 0 : 1;
        if (product_Date_SortOption.getSelectedIndex() != 0) {
            ArrayListProduct sorted_List = list.sort_date(mode);
            upDateTableData(sorted_List);
        }
    }//GEN-LAST:event_product_Date_SortOptionActionPerformed

    //xu li nut xoa toan bo danh sach
    private void removeAll_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAll_ButtonActionPerformed
        int comfirm = JOptionPane.showConfirmDialog(this, "Xác nhận xóa toàn bộ danh sách?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (comfirm == JOptionPane.YES_OPTION) {
            if (list.removeAll()) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                upDateTableData(list);
            } else {
                JOptionPane.showMessageDialog(this, "Danh sách rỗng không thể xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_removeAll_ButtonActionPerformed

    //xu li nut Clear
    private void clearInfo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInfo_ButtonActionPerformed
        clearInfor();
    }//GEN-LAST:event_clearInfo_ButtonActionPerformed

    //Ham clear
    private void clearInfor() {
        product_Id_TextField.setText("");
        product_Name_TextField.setText("");
        product_Date_FormattedTextField.setText("");
        product_Quantity_TextField.setText("");
        product_Price_TextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_Button;
    private javax.swing.JPanel buttonBar_Panel;
    private javax.swing.JPanel button_Panel;
    private javax.swing.JButton clearInfo_Button;
    private javax.swing.JTable data1_Table;
    private javax.swing.JScrollPane dataWrapper_ScrollPane;
    private javax.swing.JButton home_Button1;
    private javax.swing.JPanel infor_Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel main_Panel;
    private javax.swing.JPanel menu_Panel;
    private javax.swing.JFormattedTextField product_Date_FormattedTextField;
    private javax.swing.JComboBox<String> product_Date_SortOption;
    private javax.swing.JComboBox<String> product_Id_SortOption;
    private javax.swing.JTextField product_Id_TextField;
    private javax.swing.JComboBox<String> product_Name_SortOption;
    private javax.swing.JTextField product_Name_TextField;
    private javax.swing.JComboBox<String> product_Price_SortOption;
    private javax.swing.JTextField product_Price_TextField;
    private javax.swing.JComboBox<String> product_Quantity_SortOption;
    private javax.swing.JTextField product_Quantity_TextField;
    private javax.swing.JButton refresh_Button;
    private javax.swing.JButton removeAll_Button;
    private javax.swing.JButton remove_Button;
    private javax.swing.JButton search_Button;
    private javax.swing.JTextField search_Id;
    private javax.swing.JTextField search_Name;
    private javax.swing.JPanel sideMenu_Panel;
    private javax.swing.JPanel sortOptions_Panel;
    private javax.swing.JPanel sorter_Panel;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
