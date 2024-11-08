package Panels;

import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Mode2_Panel extends javax.swing.JPanel {

    private final CardLayout cardLayout;
    private final DefaultTableModel tableModel;
    private int rowIndex = -1;
    DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Mode2_Panel(CardLayout cardLayout) {
        initComponents();
        this.cardLayout = cardLayout;
        tableModel = (DefaultTableModel) data2_Table.getModel();
        addComboBoxListeners(sortOptions_Panel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        sideMenu_Panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        search_maHH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        search_TenHH = new javax.swing.JTextField();
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
        gia_TextField = new javax.swing.JTextField();
        soLuong_TextField = new javax.swing.JTextField();
        maHangHoa_TextField = new javax.swing.JTextField();
        tenhangHoa_TextField = new javax.swing.JTextField();
        ngaySanXuat_FormattedTextField = new javax.swing.JFormattedTextField();
        button_Panel = new javax.swing.JPanel();
        add_Button = new javax.swing.JButton();
        update_Button = new javax.swing.JButton();
        removeAll_Button = new javax.swing.JButton();
        remove_Button = new javax.swing.JButton();
        refresh_Button = new javax.swing.JButton();
        clearInfo_Button = new javax.swing.JButton();
        sorter_Panel = new javax.swing.JPanel();
        sortOptions_Panel = new javax.swing.JPanel();
        maHH_SortOption = new javax.swing.JComboBox<>();
        tenHH_SortOption = new javax.swing.JComboBox<>();
        ngaySanXuat_SortOption = new javax.swing.JComboBox<>();
        soLuong_SortOption = new javax.swing.JComboBox<>();
        gia_SortOption = new javax.swing.JComboBox<>();
        dataWrapper_ScrollPane = new javax.swing.JScrollPane();
        data2_Table = new javax.swing.JTable();
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

        javax.swing.GroupLayout sideMenu_PanelLayout = new javax.swing.GroupLayout(sideMenu_Panel);
        sideMenu_Panel.setLayout(sideMenu_PanelLayout);
        sideMenu_PanelLayout.setHorizontalGroup(
            sideMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideMenu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(search_maHH)
                    .addComponent(search_TenHH)
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
                .addComponent(search_maHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_TenHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        gia_TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ngaySanXuat_FormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        ngaySanXuat_FormattedTextField.setValue(new Date());

        javax.swing.GroupLayout infor_PanelLayout = new javax.swing.GroupLayout(infor_Panel);
        infor_Panel.setLayout(infor_PanelLayout);
        infor_PanelLayout.setHorizontalGroup(
            infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infor_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(infor_PanelLayout.createSequentialGroup()
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maHangHoa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenhangHoa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infor_PanelLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ngaySanXuat_FormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGroup(infor_PanelLayout.createSequentialGroup()
                            .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(gia_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(soLuong_TextField)))))
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
                        .addComponent(maHangHoa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infor_PanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenhangHoa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngaySanXuat_FormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infor_PanelLayout.createSequentialGroup()
                        .addComponent(soLuong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gia_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
        gridBagConstraints.ipadx = 25;
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
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(update_Button, gridBagConstraints);

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

        remove_Button.setBackground(new java.awt.Color(176, 212, 184));
        remove_Button.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        remove_Button.setText("Xóa");
        remove_Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        remove_Button.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        button_Panel.add(refresh_Button, gridBagConstraints);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearInfo_Button)
                        .addContainerGap())
                    .addComponent(button_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        sorter_Panel.setBackground(new java.awt.Color(93, 123, 111));
        sorter_Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sortOptions_Panel.setBackground(new java.awt.Color(93, 123, 111));
        sortOptions_Panel.setPreferredSize(new java.awt.Dimension(0, 0));

        maHH_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hàng hóa", "Tăng dần", "Giảm dần" }));

        tenHH_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên hàng hóa", "A -> Z", "Z -> A" }));

        ngaySanXuat_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày sản xuất", "Mới nhất", "Cũ nhất" }));

        soLuong_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Số lượng", "Tăng dần", "Giảm dần" }));

        gia_SortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giá tiền", "Tăng dần", "Giảm dần" }));

        javax.swing.GroupLayout sortOptions_PanelLayout = new javax.swing.GroupLayout(sortOptions_Panel);
        sortOptions_Panel.setLayout(sortOptions_PanelLayout);
        sortOptions_PanelLayout.setHorizontalGroup(
            sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
            .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sortOptions_PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(maHH_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(tenHH_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ngaySanXuat_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(soLuong_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(gia_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sortOptions_PanelLayout.setVerticalGroup(
            sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sortOptions_PanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sortOptions_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maHH_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tenHH_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ngaySanXuat_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(soLuong_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gia_SortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout sorter_PanelLayout = new javax.swing.GroupLayout(sorter_Panel);
        sorter_Panel.setLayout(sorter_PanelLayout);
        sorter_PanelLayout.setHorizontalGroup(
            sorter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sorter_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sortOptions_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sorter_PanelLayout.setVerticalGroup(
            sorter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sorter_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sortOptions_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataWrapper_ScrollPane.setBackground(new java.awt.Color(176, 212, 184));
        dataWrapper_ScrollPane.setBorder(null);
        dataWrapper_ScrollPane.setAlignmentX(0.0F);
        dataWrapper_ScrollPane.setAlignmentY(0.0F);

        data2_Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        data2_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã hàng hóa", "Tên hàng hóa", "Ngày sản xuất", "Số lượng", "Giá tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data2_Table.setAlignmentX(0.0F);
        data2_Table.setAlignmentY(0.0F);
        data2_Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        data2_Table.setColumnSelectionAllowed(true);
        data2_Table.getTableHeader().setReorderingAllowed(false);
        data2_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data2_TableMouseClicked(evt);
            }
        });
        dataWrapper_ScrollPane.setViewportView(data2_Table);
        data2_Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (data2_Table.getColumnModel().getColumnCount() > 0) {
            data2_Table.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout main_PanelLayout = new javax.swing.GroupLayout(main_Panel);
        main_Panel.setLayout(main_PanelLayout);
        main_PanelLayout.setHorizontalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sorter_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(main_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(dataWrapper_ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        main_PanelLayout.setVerticalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorter_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dataWrapper_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
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

    //xu li nut Home
    private void home_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_Button1ActionPerformed
        cardLayout.show(getParent(), "home");
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.setTitle("Quản lí hàng hóa");
        }
    }//GEN-LAST:event_home_Button1ActionPerformed

    //Ham clear o thong tin
    private void clearInfor() {
        maHangHoa_TextField.setText("");
        tenhangHoa_TextField.setText("");
        ngaySanXuat_FormattedTextField.setText("");
        soLuong_TextField.setText("");
        gia_TextField.setText("");
    }

    //lay thong tin hang hoa duoc click chon trong table
    private void data2_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data2_TableMouseClicked
        rowIndex = data2_Table.getSelectedRow();
        System.out.println("index: " + rowIndex);
        maHangHoa_TextField.setText((String) tableModel.getValueAt(rowIndex, 1));
        tenhangHoa_TextField.setText((String) tableModel.getValueAt(rowIndex, 2));

        String ngaySanXuatStr = (String) tableModel.getValueAt(rowIndex, 3);
        LocalDate ngaySanXuat = LocalDate.parse(ngaySanXuatStr, date_formatter);
        Date ngaySanXuatDate = Date.from(ngaySanXuat.atStartOfDay(ZoneId.systemDefault()).toInstant());
        ngaySanXuat_FormattedTextField.setValue(ngaySanXuatDate);

        soLuong_TextField.setText(String.valueOf(tableModel.getValueAt(rowIndex, 4)));
        gia_TextField.setText(String.valueOf(tableModel.getValueAt(rowIndex, 5)));

        System.out.println((String) tableModel.getValueAt(rowIndex, 1));
        System.out.println((String) tableModel.getValueAt(rowIndex, 2));
        System.out.println(ngaySanXuatDate);//(rowIndex,3)
        System.out.println(String.valueOf(tableModel.getValueAt(rowIndex, 4)));
        System.out.println(String.valueOf(tableModel.getValueAt(rowIndex, 5)));
    }//GEN-LAST:event_data2_TableMouseClicked

    //xu li nut Clear
    private void clearInfo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInfo_ButtonActionPerformed
        clearInfor();
    }//GEN-LAST:event_clearInfo_ButtonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_Button;
    private javax.swing.JPanel buttonBar_Panel;
    private javax.swing.JPanel button_Panel;
    private javax.swing.JButton clearInfo_Button;
    private javax.swing.JTable data2_Table;
    private javax.swing.JScrollPane dataWrapper_ScrollPane;
    private javax.swing.JComboBox<String> gia_SortOption;
    private javax.swing.JTextField gia_TextField;
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
    private javax.swing.JComboBox<String> maHH_SortOption;
    private javax.swing.JTextField maHangHoa_TextField;
    private javax.swing.JPanel main_Panel;
    private javax.swing.JPanel menu_Panel;
    private javax.swing.JFormattedTextField ngaySanXuat_FormattedTextField;
    private javax.swing.JComboBox<String> ngaySanXuat_SortOption;
    private javax.swing.JButton refresh_Button;
    private javax.swing.JButton removeAll_Button;
    private javax.swing.JButton remove_Button;
    private javax.swing.JButton search_Button;
    private javax.swing.JTextField search_TenHH;
    private javax.swing.JTextField search_maHH;
    private javax.swing.JPanel sideMenu_Panel;
    private javax.swing.JComboBox<String> soLuong_SortOption;
    private javax.swing.JTextField soLuong_TextField;
    private javax.swing.JPanel sortOptions_Panel;
    private javax.swing.JPanel sorter_Panel;
    private javax.swing.JComboBox<String> tenHH_SortOption;
    private javax.swing.JTextField tenhangHoa_TextField;
    private javax.swing.JButton update_Button;
    // End of variables declaration//GEN-END:variables
}
