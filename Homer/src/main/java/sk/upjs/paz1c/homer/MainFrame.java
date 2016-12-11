package sk.upjs.paz1c.homer;

import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.List;
import javax.swing.ListModel;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import sk.upjs.paz1c.homer.dao.ItemDao;
import sk.upjs.paz1c.homer.dao.ProductDao;
import sk.upjs.paz1c.homer.dao.RecipeDao;
import sk.upjs.paz1c.homer.dao.ShoppingListDao;
import sk.upjs.paz1c.homer.entity.Item;
import sk.upjs.paz1c.homer.entity.Product;
import sk.upjs.paz1c.homer.entity.Recipe;
import sk.upjs.paz1c.homer.entity.ShoppingList;
import sk.upjs.paz1c.homer.model.ItemListModel;
import sk.upjs.paz1c.homer.model.ListComboBoxModel;
import sk.upjs.paz1c.homer.model.ProductListModel;
import sk.upjs.paz1c.homer.model.RecipeTableModel;

/**
 *
 * @author dyske
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private ShoppingList shoppingList;
    private final RecipeDao recipeDao = ObjectFactory.INSTANCE.getDao(Recipe.class);
    private final ItemDao itemDao = ObjectFactory.INSTANCE.getDao(Item.class);
    private final ProductDao productDao = ObjectFactory.INSTANCE.getDao(Product.class);
    private final ShoppingListDao shoppingListDao = ObjectFactory.INSTANCE.getDao(ShoppingList.class);
    private final Dimension windowSize;
    private int selectedItem;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth() * 2 / 3;
        int height = gd.getDisplayMode().getHeight() * 2 / 2;
        windowSize = new Dimension(width, height);
        initComponents();

        refreshRecipes();
    }

    private void refreshRecipes() {
        RecipeTableModel model = (RecipeTableModel) recipeTable.getModel();
        model.refresh();
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
        productPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        productScrollPane = new javax.swing.JScrollPane();
        productList = new javax.swing.JList<>();
        searchProductField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchProductButton = new javax.swing.JButton();
        listsPanel = new javax.swing.JPanel();
        listComboBox = new javax.swing.JComboBox<>();
        listNameLabel = new javax.swing.JLabel();
        listNameField = new javax.swing.JTextField();
        listDateLabel = new javax.swing.JLabel();
        purchasedCheckBox = new javax.swing.JCheckBox();
        listStatusLabel = new javax.swing.JLabel();
        finishedCheckBox = new javax.swing.JCheckBox();
        listScrollPane = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList();
        addItemButton = new javax.swing.JButton();
        updateItem = new javax.swing.JButton();
        listPurchasedButton = new javax.swing.JButton();
        listRemoveButton = new javax.swing.JButton();
        dateField = new com.alee.extended.date.WebDateField();
        addListButton = new javax.swing.JButton();
        recipePanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        recipeScrollPane = new javax.swing.JScrollPane();
        recipeTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        searchRecipeLabel = new javax.swing.JLabel();
        addRecipeLabel = new javax.swing.JLabel();
        recipeUrlTextField = new javax.swing.JTextField();
        addRecipeButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Homer");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 350));
        setPreferredSize(windowSize);
        setSize(windowSize);

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbedPane.setMinimumSize(new java.awt.Dimension(143, 200));

        jLabel2.setText("Hľadať produkt:");

        productList.setModel(new ProductListModel());
        productList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productListMouseClicked(evt);
            }
        });
        productScrollPane.setViewportView(productList);

        searchProductField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("//po dvojkliku na polozku sa objavi? dialog na pridanie polozky do zoznamu");

        searchProductButton.setText("Hľadať");
        searchProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchProductField)
                .addGap(18, 18, 18)
                .addComponent(searchProductButton)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(191, 191, 191))
            .addGroup(productPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(productScrollPane)
                .addContainerGap())
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchProductField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProductButton))
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(productScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("Produkty", productPanel);

        listComboBox.setModel(new ListComboBoxModel());
        listComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listComboBoxActionPerformed(evt);
            }
        });

        listNameLabel.setText("Názov");

        listDateLabel.setText("Dátum expirácie");

        purchasedCheckBox.setText("Nakúpené");
        purchasedCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasedCheckBoxActionPerformed(evt);
            }
        });

        listStatusLabel.setText("Stav");

        finishedCheckBox.setText("Zoznam je úplný");

        itemList.setModel(new ItemListModel(shoppingList));
        itemList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemListMouseClicked(evt);
            }
        });
        listScrollPane.setViewportView(itemList);

        addItemButton.setText("Pridať...");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        updateItem.setText("Upraviť...");
        updateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemActionPerformed(evt);
            }
        });

        listPurchasedButton.setText("Kúpené");
        listPurchasedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPurchasedButtonActionPerformed(evt);
            }
        });

        listRemoveButton.setText("Odstrániť");
        listRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listRemoveButtonActionPerformed(evt);
            }
        });

        addListButton.setText("Pridať zoznam...");
        addListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listsPanelLayout = new javax.swing.GroupLayout(listsPanel);
        listsPanel.setLayout(listsPanelLayout);
        listsPanelLayout.setHorizontalGroup(
            listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addComponent(listComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addComponent(listScrollPane)
                        .addGap(16, 16, 16)
                        .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(updateItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(listPurchasedButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listRemoveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                .addComponent(listNameField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        listsPanelLayout.setVerticalGroup(
            listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addListButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listNameLabel)
                    .addComponent(listDateLabel)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchasedCheckBox)
                    .addComponent(listStatusLabel)
                    .addComponent(finishedCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listScrollPane)
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addComponent(addItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listPurchasedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listRemoveButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPane.addTab("Zoznamy", listsPanel);

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        recipeTable.setModel(new RecipeTableModel());
        recipeTable.setColumnSelectionAllowed(true);
        recipeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recipeTableMouseClicked(evt);
            }
        });
        recipeScrollPane.setViewportView(recipeTable);
        recipeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        searchButton.setText("OK");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchRecipeLabel.setText("Vyhľadať v receptoch:");

        addRecipeLabel.setText("Pridať recept z URL:");

        recipeUrlTextField.setText("http://");

        addRecipeButton.setText("Pridať");
        addRecipeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecipeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recipePanelLayout = new javax.swing.GroupLayout(recipePanel);
        recipePanel.setLayout(recipePanelLayout);
        recipePanelLayout.setHorizontalGroup(
            recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recipePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recipeScrollPane)
                    .addGroup(recipePanelLayout.createSequentialGroup()
                        .addGroup(recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchRecipeLabel)
                            .addComponent(addRecipeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchField)
                            .addComponent(recipeUrlTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addRecipeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        recipePanelLayout.setVerticalGroup(
            recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recipePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchRecipeLabel)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecipeLabel)
                    .addComponent(recipeUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecipeButton))
                .addGap(25, 25, 25)
                .addComponent(recipeScrollPane))
        );

        tabbedPane.addTab("Recepty", recipePanel);

        fileMenu.setText("File");
        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ShoppingList addSelectedList() {
        ShoppingList selectedList = (ShoppingList) listComboBox.getSelectedItem();
        return selectedList;
    }

    private void listNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ShoppingList shoppingList = (ShoppingList) listComboBox.getSelectedItem();
        searchField.setText(shoppingList.getName());
    }


    private void updateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemActionPerformed
        // TODO add your handling code here:
        Item item = getSelectedItem();
        ItemDialog productDialog;
        ShoppingList shoppingList = (ShoppingList) listComboBox.getSelectedItem();
        productDialog = new ItemDialog(item, shoppingList, this, true);
        productDialog.setVisible(true);

    }//GEN-LAST:event_updateItemActionPerformed

    private void listComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listComboBoxActionPerformed
        // TODO add your handling code here:
        ShoppingList shoppingList = (ShoppingList) listComboBox.getSelectedItem();
        ItemListModel model = (ItemListModel) itemList.getModel();
        model.refresh(shoppingList);


    }//GEN-LAST:event_listComboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchButtonActionPerformed

    private void addRecipeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecipeButtonActionPerformed
        try {
            RecipeParser.fetchFromUrl(recipeUrlTextField.getText());
            ((RecipeTableModel) recipeTable.getModel()).refresh();
        } catch (IOException | UnsupportedOperationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addRecipeButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchProductFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductFieldActionPerformed

    }//GEN-LAST:event_searchProductFieldActionPerformed

    private void productListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) {
            int riadok = productList.getSelectedIndex();
            Product product;
            product = (Product) ((ListModel) productList.getModel()).getElementAt(riadok);

            ListDialog listDialog = new ListDialog(product, this, true);
            listDialog.setVisible(true);
        }

    }//GEN-LAST:event_productListMouseClicked

    private void listPurchasedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPurchasedButtonActionPerformed
        // TODO add your handling code here:

        Item item = getSelectedItem();
        itemDao.done(item);
    }//GEN-LAST:event_listPurchasedButtonActionPerformed

    private void searchProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductButtonActionPerformed
        searchProductField.setBackground(Color.white);
        String query = searchProductField.getText();
        List<Product> products = productDao.find(query);
        ProductListModel productListModel = (ProductListModel) productList.getModel();
        if (products.isEmpty()) {
            searchProductField.setBackground(new Color(192, 57, 43));
        } else {
            productListModel.refreshList(products);
        }
    }//GEN-LAST:event_searchProductButtonActionPerformed

    private void recipeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recipeTableMouseClicked
        if (evt.getClickCount() == 2) {
            int row = recipeTable.getSelectedRow();
            Recipe recipe = ((RecipeTableModel) recipeTable.getModel()).getRecipeAt(row);
            RecipePanel recipeDetailPanel = new RecipePanel(recipe);
            String recipeName = recipe.getName();
            tabbedPane.addTab(recipeName.substring(0, (recipeName.length() > 16) ? 16 : recipeName.length()) + "...", recipeDetailPanel);
            tabbedPane.setSelectedComponent(recipeDetailPanel);
        }
    }//GEN-LAST:event_recipeTableMouseClicked

    private void itemListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemListMouseClicked
        // TODO add your handling code here:
        selectedItem = itemList.getSelectedIndex();
    }//GEN-LAST:event_itemListMouseClicked

    private void listRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRemoveButtonActionPerformed
        Item item = getSelectedItem();
        itemDao.delete(item);

    }//GEN-LAST:event_listRemoveButtonActionPerformed

    private void purchasedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasedCheckBoxActionPerformed
        // TODO add your handling code here:
        ShoppingList shoppingList = (ShoppingList) listComboBox.getSelectedItem();
        shoppingList.setStatus(Status.fromInt(3));


    }//GEN-LAST:event_purchasedCheckBoxActionPerformed

    private void addListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListButtonActionPerformed
        // TODO add your handling code here:
        ShoppingList shoppingList;
        if (listNameField.getText() != null) {
            shoppingList = new ShoppingList();
            shoppingList.setName(listNameField.getText());
            shoppingList.setExpiry(dateField.getDate());
            shoppingListDao.store(shoppingList);
        }
    }//GEN-LAST:event_addListButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
        ItemDialog productDialog;
        ShoppingList shoppingList = (ShoppingList) listComboBox.getSelectedItem();
        productDialog = new ItemDialog(shoppingList, this, true);
        productDialog.setVisible(true);


    }//GEN-LAST:event_addItemButtonActionPerformed

    private Item getSelectedItem() {
        // TODO add your handling code here:
        Item item = (Item) ((ListModel) itemList.getModel().getElementAt(selectedItem));
        return item;
    }

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
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton addListButton;
    private javax.swing.JButton addRecipeButton;
    private javax.swing.JLabel addRecipeLabel;
    private com.alee.extended.date.WebDateField dateField;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JCheckBox finishedCheckBox;
    private javax.swing.JList itemList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<ShoppingList> listComboBox;
    private javax.swing.JLabel listDateLabel;
    private javax.swing.JTextField listNameField;
    private javax.swing.JLabel listNameLabel;
    private javax.swing.JButton listPurchasedButton;
    private javax.swing.JButton listRemoveButton;
    private javax.swing.JScrollPane listScrollPane;
    private javax.swing.JLabel listStatusLabel;
    private javax.swing.JPanel listsPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JList<Product> productList;
    private javax.swing.JPanel productPanel;
    private javax.swing.JScrollPane productScrollPane;
    private javax.swing.JCheckBox purchasedCheckBox;
    private javax.swing.JPanel recipePanel;
    private javax.swing.JScrollPane recipeScrollPane;
    private javax.swing.JTable recipeTable;
    private javax.swing.JTextField recipeUrlTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchProductButton;
    private javax.swing.JTextField searchProductField;
    private javax.swing.JLabel searchRecipeLabel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton updateItem;
    // End of variables declaration//GEN-END:variables
}
