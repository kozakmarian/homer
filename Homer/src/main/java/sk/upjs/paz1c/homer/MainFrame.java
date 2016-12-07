package sk.upjs.paz1c.homer;

import com.alee.laf.WebLookAndFeel;
import sk.upjs.paz1c.homer.dao.mysql.MysqlProductDao;

/**
 *
 * @author dyske
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        tabbedPane = new javax.swing.JTabbedPane();
        recipePanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        recipeScrollPane = new javax.swing.JScrollPane();
        recipeTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        procuctPanel = new javax.swing.JPanel();
        listsPanel = new javax.swing.JPanel();
        listComboBox = new javax.swing.JComboBox<>();
        listNameLabel = new javax.swing.JLabel();
        listNameField = new javax.swing.JTextField();
        listDateLabel = new javax.swing.JLabel();
        purchasedCheckBox = new javax.swing.JCheckBox();
        listStatusLabel = new javax.swing.JLabel();
        finishedCheckBox = new javax.swing.JCheckBox();
        listScrollPane = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList<>();
        listAddButton = new javax.swing.JButton();
        listEditButton = new javax.swing.JButton();
        listPurchasedButton = new javax.swing.JButton();
        listRemoveButton = new javax.swing.JButton();
        webDateField2 = new com.alee.extended.date.WebDateField();
        detailPanel = new javax.swing.JPanel();
        recipeNameLabel = new javax.swing.JLabel();
        preparationLabel = new javax.swing.JLabel();
        preparationDurationLabel = new javax.swing.JLabel();
        cookingLabel = new javax.swing.JLabel();
        cookingDurationLabel = new javax.swing.JLabel();
        portionsLabel = new javax.swing.JLabel();
        portionsCountLabel = new javax.swing.JLabel();
        detailScrollPane = new javax.swing.JScrollPane();
        instructionsTextPane = new javax.swing.JTextPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Homer");
        setMaximumSize(new java.awt.Dimension(700, 450));
        setMinimumSize(new java.awt.Dimension(500, 350));
        setPreferredSize(new java.awt.Dimension(600, 400));

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbedPane.setMinimumSize(new java.awt.Dimension(143, 200));

        recipeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        recipeScrollPane.setViewportView(recipeTable);

        searchButton.setText("Hľadať");

        javax.swing.GroupLayout recipePanelLayout = new javax.swing.GroupLayout(recipePanel);
        recipePanel.setLayout(recipePanelLayout);
        recipePanelLayout.setHorizontalGroup(
            recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recipePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recipeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(recipePanelLayout.createSequentialGroup()
                        .addComponent(searchField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)))
                .addContainerGap())
        );
        recipePanelLayout.setVerticalGroup(
            recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recipePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("Recepty", recipePanel);

        javax.swing.GroupLayout procuctPanelLayout = new javax.swing.GroupLayout(procuctPanel);
        procuctPanel.setLayout(procuctPanelLayout);
        procuctPanelLayout.setHorizontalGroup(
            procuctPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        procuctPanelLayout.setVerticalGroup(
            procuctPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Produkty", procuctPanel);

        listComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        listNameLabel.setText("Názov");

        listDateLabel.setText("Dátum expirácie");

        purchasedCheckBox.setText("Nakúpené");

        listStatusLabel.setText("Stav");

        finishedCheckBox.setText("Zoznam je úplný");

        itemList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listScrollPane.setViewportView(itemList);

        listAddButton.setText("Pridať...");

        listEditButton.setText("Upraviť...");
        listEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listEditButtonActionPerformed(evt);
            }
        });

        listPurchasedButton.setText("Kúpené");

        listRemoveButton.setText("Odstrániť");

        javax.swing.GroupLayout listsPanelLayout = new javax.swing.GroupLayout(listsPanel);
        listsPanel.setLayout(listsPanelLayout);
        listsPanelLayout.setHorizontalGroup(
            listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addComponent(listScrollPane)
                        .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(listsPanelLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(listAddButton))
                                .addComponent(listEditButton, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listsPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listPurchasedButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(listRemoveButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(listComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listNameLabel)
                            .addComponent(listStatusLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listsPanelLayout.createSequentialGroup()
                                .addComponent(purchasedCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(finishedCheckBox)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(listsPanelLayout.createSequentialGroup()
                                .addComponent(listNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(webDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        listsPanelLayout.setVerticalGroup(
            listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listNameLabel)
                    .addComponent(listDateLabel)
                    .addComponent(webDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchasedCheckBox)
                    .addComponent(listStatusLabel)
                    .addComponent(finishedCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addComponent(listAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listEditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listPurchasedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listRemoveButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPane.addTab("Zoznamy", listsPanel);

        recipeNameLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        recipeNameLabel.setText("Názov Receptu");

        preparationLabel.setText("Príprava:");

        preparationDurationLabel.setText("25 min.");

        cookingLabel.setText("Úprava:");

        cookingDurationLabel.setText("165 min.");

        portionsLabel.setText("Porcie:");

        portionsCountLabel.setText("4");

        instructionsTextPane.setEditable(false);
        detailScrollPane.setViewportView(instructionsTextPane);

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recipeNameLabel)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addGroup(detailPanelLayout.createSequentialGroup()
                                .addComponent(preparationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(preparationDurationLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cookingLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cookingDurationLabel)
                                .addGap(18, 18, 18)
                                .addComponent(portionsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(portionsCountLabel)))))
                .addContainerGap())
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recipeNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preparationLabel)
                    .addComponent(preparationDurationLabel)
                    .addComponent(cookingLabel)
                    .addComponent(cookingDurationLabel)
                    .addComponent(portionsLabel)
                    .addComponent(portionsCountLabel))
                .addGap(18, 18, 18)
                .addComponent(detailScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("Detail", detailPanel);

        fileMenu.setText("File");
        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listEditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listEditButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        WebLookAndFeel.install();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cookingDurationLabel;
    private javax.swing.JLabel cookingLabel;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JCheckBox finishedCheckBox;
    private javax.swing.JTextPane instructionsTextPane;
    private javax.swing.JList<String> itemList;
    private javax.swing.JButton listAddButton;
    private javax.swing.JComboBox<String> listComboBox;
    private javax.swing.JLabel listDateLabel;
    private javax.swing.JButton listEditButton;
    private javax.swing.JTextField listNameField;
    private javax.swing.JLabel listNameLabel;
    private javax.swing.JButton listPurchasedButton;
    private javax.swing.JButton listRemoveButton;
    private javax.swing.JScrollPane listScrollPane;
    private javax.swing.JLabel listStatusLabel;
    private javax.swing.JPanel listsPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel portionsCountLabel;
    private javax.swing.JLabel portionsLabel;
    private javax.swing.JLabel preparationDurationLabel;
    private javax.swing.JLabel preparationLabel;
    private javax.swing.JPanel procuctPanel;
    private javax.swing.JCheckBox purchasedCheckBox;
    private javax.swing.JLabel recipeNameLabel;
    private javax.swing.JPanel recipePanel;
    private javax.swing.JScrollPane recipeScrollPane;
    private javax.swing.JTable recipeTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTabbedPane tabbedPane;
    private com.alee.extended.date.WebDateField webDateField2;
    // End of variables declaration//GEN-END:variables
}
