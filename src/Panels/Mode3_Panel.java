package Panels;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Mode3_Panel extends javax.swing.JPanel {

    private final CardLayout cardLayout;

    public Mode3_Panel(CardLayout cardLayout) {
        initComponents();
        this.cardLayout = cardLayout;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        searchMenu_Panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        search_maNCC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        search_TenNCC = new javax.swing.JTextField();
        search_Button = new javax.swing.JButton();
        search_DiaChiNCC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        search_SdtNCC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        main_Panel = new javax.swing.JPanel();
        menu_Panel = new javax.swing.JPanel();
        infor_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diaChi_TextField = new javax.swing.JTextField();
        sdt_TextField = new javax.swing.JTextField();
        maNSX_TextField = new javax.swing.JTextField();
        tenNSX_TextField = new javax.swing.JTextField();
        button_Panel = new javax.swing.JPanel();
        add_Button = new javax.swing.JButton();
        update_Button = new javax.swing.JButton();
        remove_Button = new javax.swing.JButton();
        refresh_Button = new javax.swing.JButton();
        removeAll_Button = new javax.swing.JButton();
        danhSachHH_Button = new javax.swing.JButton();
        clearInfo_Button = new javax.swing.JButton();
        sorter_Panel = new javax.swing.JPanel();
        sortOptions_Panel = new javax.swing.JPanel();
        maNSX_SortOption = new javax.swing.JComboBox<>();
        tenNSX_SortOption = new javax.swing.JComboBox<>();
        dataWrapper_ScrollPane = new javax.swing.JScrollPane();
        data3_Table = new javax.swing.JTable();
        buttonBar_Panel = new javax.swing.JPanel();
        home_Button1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        searchMenu_Panel.setBackground(new java.awt.Color(176, 212, 184));
        searchMenu_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchMenu_Panel.setAlignmentX(0.0F);
        searchMenu_Panel.setAlignmentY(0.0F);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tìm kiếm nhà cung cấp");

        jLabel8.setText("Mã :");

        jLabel9.setText("Họ tên :");

        search_Button.setBackground(new java.awt.Color(93, 123, 111));
        search_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        search_Button.setForeground(new java.awt.Color(255, 255, 255));
        search_Button.setText("Tìm kiếm");
        search_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        search_Button.setPreferredSize(new java.awt.Dimension(100, 27));

        jLabel10.setText("Địa chỉ :");

        jLabel11.setText("Số điện thoại :");

        javax.swing.GroupLayout searchMenu_PanelLayout = new javax.swing.GroupLayout(searchMenu_Panel);
        searchMenu_Panel.setLayout(searchMenu_PanelLayout);
        searchMenu_PanelLayout.setHorizontalGroup(
            searchMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMenu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(search_maNCC)
                    .addComponent(search_TenNCC)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchMenu_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(search_DiaChiNCC)
                    .addComponent(search_SdtNCC)
                    .addGroup(searchMenu_PanelLayout.createSequentialGroup()
                        .addGroup(searchMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchMenu_PanelLayout.setVerticalGroup(
            searchMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMenu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_maNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_DiaChiNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_SdtNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        menu_Panel.setPreferredSize(new java.awt.Dimension(0, 0));

        infor_Panel.setBackground(new java.awt.Color(176, 212, 184));
        infor_Panel.setAlignmentX(0.0F);
        infor_Panel.setPreferredSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin nhà cung cấp");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã :");
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Họ tên :");
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ :");
        jLabel4.setPreferredSize(new java.awt.Dimension(95, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Số điện thoại:");
        jLabel5.setPreferredSize(new java.awt.Dimension(95, 20));

        javax.swing.GroupLayout infor_PanelLayout = new javax.swing.GroupLayout(infor_Panel);
        infor_Panel.setLayout(infor_PanelLayout);
        infor_PanelLayout.setHorizontalGroup(
            infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infor_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infor_PanelLayout.createSequentialGroup()
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infor_PanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sdt_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infor_PanelLayout.createSequentialGroup()
                                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maNSX_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tenNSX_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(infor_PanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(diaChi_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        infor_PanelLayout.setVerticalGroup(
            infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infor_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infor_PanelLayout.createSequentialGroup()
                        .addComponent(maNSX_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenNSX_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaChi_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdt_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        button_Panel.setBackground(new java.awt.Color(93, 123, 111));
        button_Panel.setAlignmentX(0.0F);
        button_Panel.setAlignmentY(0.0F);
        button_Panel.setPreferredSize(new java.awt.Dimension(0, 0));
        button_Panel.setLayout(new java.awt.GridBagLayout());

        add_Button.setBackground(new java.awt.Color(176, 212, 184));
        add_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add_Button.setText("Thêm");
        add_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(add_Button, gridBagConstraints);

        update_Button.setBackground(new java.awt.Color(176, 212, 184));
        update_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_Button.setText("Sửa");
        update_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        update_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(update_Button, gridBagConstraints);

        remove_Button.setBackground(new java.awt.Color(176, 212, 184));
        remove_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        remove_Button.setText("Xóa");
        remove_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        remove_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(remove_Button, gridBagConstraints);

        refresh_Button.setBackground(new java.awt.Color(176, 212, 184));
        refresh_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        refresh_Button.setText("Làm mới");
        refresh_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        refresh_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(refresh_Button, gridBagConstraints);

        removeAll_Button.setBackground(new java.awt.Color(176, 212, 184));
        removeAll_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeAll_Button.setText("Xóa danh sách");
        removeAll_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeAll_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(removeAll_Button, gridBagConstraints);

        danhSachHH_Button.setBackground(new java.awt.Color(93, 123, 111));
        danhSachHH_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        danhSachHH_Button.setForeground(new java.awt.Color(255, 255, 255));
        danhSachHH_Button.setText("Danh sách hàng hóa");
        danhSachHH_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        danhSachHH_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        danhSachHH_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danhSachHH_ButtonActionPerformed(evt);
            }
        });

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
                .addGroup(menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infor_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(menu_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(danhSachHH_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearInfo_Button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        menu_PanelLayout.setVerticalGroup(
            menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infor_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(danhSachHH_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearInfo_Button))
                .addGap(16, 16, 16))
        );

        sorter_Panel.setBackground(new java.awt.Color(93, 123, 111));
        sorter_Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sortOptions_Panel.setBackground(new java.awt.Color(93, 123, 111));
        sortOptions_Panel.setPreferredSize(new java.awt.Dimension(0, 0));

        maNSX_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã", "Tăng dần", "Giảm dần" }));

        tenNSX_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "A->Z", "Z->A" }));

        javax.swing.GroupLayout sortOptions_PanelLayout = new javax.swing.GroupLayout(sortOptions_Panel);
        sortOptions_Panel.setLayout(sortOptions_PanelLayout);
        sortOptions_PanelLayout.setHorizontalGroup(
            sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
            .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sortOptions_PanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maNSX_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addComponent(tenNSX_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sortOptions_PanelLayout.setVerticalGroup(
            sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sortOptions_PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maNSX_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tenNSX_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout sorter_PanelLayout = new javax.swing.GroupLayout(sorter_Panel);
        sorter_Panel.setLayout(sorter_PanelLayout);
        sorter_PanelLayout.setHorizontalGroup(
            sorter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sorter_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sortOptions_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sorter_PanelLayout.setVerticalGroup(
            sorter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sorter_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sortOptions_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        dataWrapper_ScrollPane.setBackground(new java.awt.Color(176, 212, 184));
        dataWrapper_ScrollPane.setBorder(null);
        dataWrapper_ScrollPane.setAlignmentX(0.0F);
        dataWrapper_ScrollPane.setAlignmentY(0.0F);

        data3_Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        data3_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Họ tên", "Địa chỉ", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data3_Table.setAlignmentX(0.0F);
        data3_Table.setAlignmentY(0.0F);
        data3_Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        data3_Table.setColumnSelectionAllowed(true);
        data3_Table.getTableHeader().setReorderingAllowed(false);
        dataWrapper_ScrollPane.setViewportView(data3_Table);
        data3_Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (data3_Table.getColumnModel().getColumnCount() > 0) {
            data3_Table.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout main_PanelLayout = new javax.swing.GroupLayout(main_Panel);
        main_Panel.setLayout(main_PanelLayout);
        main_PanelLayout.setHorizontalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sorter_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dataWrapper_ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_PanelLayout.setVerticalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorter_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dataWrapper_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(home_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(searchMenu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(buttonBar_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonBar_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchMenu_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    //xu li nut Home
    private void home_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_Button1ActionPerformed
        cardLayout.show(getParent(), "home");
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.setTitle("Quản lí hàng hóa");
        }
    }//GEN-LAST:event_home_Button1ActionPerformed

    //xu li nut danh sach hang hoa cua nsx
    private void danhSachHH_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danhSachHH_ButtonActionPerformed
        cardLayout.show(getParent(), "mode3_product");
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.setTitle("Quản lí hàng hóa - Nhà cung cấp/Hàng hóa");
        }
    }//GEN-LAST:event_danhSachHH_ButtonActionPerformed

    //xu li nut Clear
    private void clearInfo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInfo_ButtonActionPerformed
        clearInfor();
    }//GEN-LAST:event_clearInfo_ButtonActionPerformed

    //Ham clear o thong tin
    private void clearInfor() {
        maNSX_TextField.setText("");
        tenNSX_TextField.setText("");    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_Button;
    private javax.swing.JPanel buttonBar_Panel;
    private javax.swing.JPanel button_Panel;
    private javax.swing.JButton clearInfo_Button;
    private javax.swing.JButton danhSachHH_Button;
    private javax.swing.JTable data3_Table;
    private javax.swing.JScrollPane dataWrapper_ScrollPane;
    private javax.swing.JTextField diaChi_TextField;
    private javax.swing.JButton home_Button1;
    private javax.swing.JPanel infor_Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> maNSX_SortOption;
    private javax.swing.JTextField maNSX_TextField;
    private javax.swing.JPanel main_Panel;
    private javax.swing.JPanel menu_Panel;
    private javax.swing.JButton refresh_Button;
    private javax.swing.JButton removeAll_Button;
    private javax.swing.JButton remove_Button;
    private javax.swing.JTextField sdt_TextField;
    private javax.swing.JPanel searchMenu_Panel;
    private javax.swing.JButton search_Button;
    private javax.swing.JTextField search_DiaChiNCC;
    private javax.swing.JTextField search_SdtNCC;
    private javax.swing.JTextField search_TenNCC;
    private javax.swing.JTextField search_maNCC;
    private javax.swing.JPanel sortOptions_Panel;
    private javax.swing.JPanel sorter_Panel;
    private javax.swing.JComboBox<String> tenNSX_SortOption;
    private javax.swing.JTextField tenNSX_TextField;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
