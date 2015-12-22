/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness.academy.gui;

import com.ness.academy.bean.Product;
import com.ness.academy.controller.OrderService;
import com.ness.academy.controller.ProductService;
import com.ness.academy.controller.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author P3502442
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    
    ProductService productManager;
    OrderService orderManager;
    UserService userManager;
    
    public Gui() {
        initComponents();
        
        productManager = new ProductService();
        orderManager = new OrderService();
        userManager = new UserService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        orderLabel = new javax.swing.JLabel();
        addProductButton = new javax.swing.JButton();
        productPanel = new javax.swing.JPanel();
        pName = new javax.swing.JTextField();
        pDescription = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        pPrice = new javax.swing.JTextField();
        productLabel = new javax.swing.JLabel();
        productsCombo = new javax.swing.JComboBox<>();
        addProductToOrderButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        products = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderProducts = new javax.swing.JList<>();
        removeProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orders = new javax.swing.JTextArea();
        allOrdersLabel = new javax.swing.JLabel();
        allOrderedProductsLabel = new javax.swing.JLabel();
        allProductLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        background.setBackground(new java.awt.Color(204, 204, 255));

        orderLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        orderLabel.setForeground(new java.awt.Color(51, 0, 51));
        orderLabel.setText("Order");

        addProductButton.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        addProductButton.setForeground(new java.awt.Color(51, 0, 51));
        addProductButton.setText("Add Product");
        addProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductButtonMouseClicked(evt);
            }
        });

        productPanel.setBackground(new java.awt.Color(204, 204, 255));

        pName.setBackground(new java.awt.Color(249, 237, 250));

        pDescription.setBackground(new java.awt.Color(249, 237, 250));

        nameLabel.setForeground(new java.awt.Color(51, 0, 51));
        nameLabel.setText("Name");

        descriptionLabel.setForeground(new java.awt.Color(51, 0, 51));
        descriptionLabel.setText("Description");

        priceLabel.setBackground(new java.awt.Color(204, 204, 255));
        priceLabel.setForeground(new java.awt.Color(51, 0, 51));
        priceLabel.setText("Price");

        pPrice.setBackground(new java.awt.Color(249, 237, 250));

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
            .addComponent(pPrice)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productPanelLayout.createSequentialGroup()
                .addComponent(pName)
                .addContainerGap())
            .addGroup(productPanelLayout.createSequentialGroup()
                .addComponent(pDescription)
                .addContainerGap())
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addGap(5, 5, 5)
                .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        productLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productLabel.setForeground(new java.awt.Color(51, 0, 51));
        productLabel.setText("Product");

        addProductToOrderButton.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        addProductToOrderButton.setForeground(new java.awt.Color(51, 0, 51));
        addProductToOrderButton.setText("Add Product to Order");
        addProductToOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductToOrderButtonMouseClicked(evt);
            }
        });

        orderButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        orderButton.setForeground(new java.awt.Color(51, 0, 51));
        orderButton.setText("Order");
        orderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderButtonMouseClicked(evt);
            }
        });

        products.setBackground(new java.awt.Color(249, 237, 250));
        products.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        products.setForeground(new java.awt.Color(51, 0, 51));
        jScrollPane3.setViewportView(products);

        orderProducts.setBackground(new java.awt.Color(249, 237, 250));
        orderProducts.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        orderProducts.setForeground(new java.awt.Color(51, 0, 51));
        jScrollPane4.setViewportView(orderProducts);

        removeProduct.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        removeProduct.setForeground(new java.awt.Color(51, 0, 51));
        removeProduct.setText("Remove");
        removeProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeProductMouseClicked(evt);
            }
        });

        orders.setColumns(20);
        orders.setRows(5);
        jScrollPane1.setViewportView(orders);

        allOrdersLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        allOrdersLabel.setForeground(new java.awt.Color(51, 0, 51));
        allOrdersLabel.setText("All Orders");

        allOrderedProductsLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        allOrderedProductsLabel.setForeground(new java.awt.Color(51, 0, 51));
        allOrderedProductsLabel.setText("All Ordered Products");

        allProductLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        allProductLabel.setForeground(new java.awt.Color(51, 0, 51));
        allProductLabel.setText("All Products");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeProduct)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                            .addComponent(allOrdersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(orderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addProductToOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                        .addComponent(productsCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(30, 30, 30))))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                                .addComponent(jScrollPane3)
                                .addComponent(allOrderedProductsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(403, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(productLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(productPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 335, Short.MAX_VALUE)))
                    .addGap(535, 535, 535)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(allProductLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addProductButton)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeProduct)
                .addGap(1, 1, 1)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allOrderedProductsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(productsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addProductToOrderButton))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderButton)
                        .addGap(9, 9, 9))
                    .addComponent(allOrdersLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(productPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductButtonMouseClicked
      
                String name = pName.getText();
                String description = pDescription.getText();
                String price = pPrice.getText();
                if(productManager.canAdd(name, description, price)==true){
                    productManager.add(name, description, price);
                    pName.setText("");
                    pDescription.setText("");
                    pPrice.setText("");
                    refresh();
                }
                else
                 JOptionPane.showMessageDialog(null, "Can not add product. Invalid input.");
    }//GEN-LAST:event_addProductButtonMouseClicked

    List<Product> prods = new ArrayList<Product>();
    
    private void addProductToOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductToOrderButtonMouseClicked
        String name = (String) productsCombo.getSelectedItem();
        Product product = productManager.getByName(name);
        DefaultListModel<String> model = new DefaultListModel<>();
        prods.add(product);
        for(int i = 0; i<prods.size();i++){
            model.addElement(prods.get(i).toString());
        }
        orderProducts.setModel(model);
    }//GEN-LAST:event_addProductToOrderButtonMouseClicked

    private void orderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderButtonMouseClicked
        orderManager.addOrder(prods);
        if(!prods.isEmpty())
            orders.setText(this.orderManager.orders().toString());
        refresh();
        prods = new ArrayList<Product>();
        clearJList(orderProducts);
    }//GEN-LAST:event_orderButtonMouseClicked

    private void removeProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeProductMouseClicked
        removeJListItem();
        refresh();
    }//GEN-LAST:event_removeProductMouseClicked

    private void refresh(){
        productsCombo.removeAllItems();
        for(Product productName:productManager.products()){
                productsCombo.addItem(productName.getName());
            }
        addItemsToJLists();
    }
    
    private void clearJList(JList jl){
        DefaultListModel listModel = (DefaultListModel) jl.getModel();
        listModel.removeAllElements();
    }
    
    private void removeJListItem(){
       ListModel model = products.getModel();

        for(int index : products.getSelectedIndices()) {
            String string = model.getElementAt(index).toString();
            this.productManager.removeByString(string);
        }
        refresh();
    }
    
    private void addItemsToJLists(){
        List<Product> copyProducts =  productManager.products();
        products.setModel(new DefaultListModel());
        for (Product element : copyProducts) {
         ((DefaultListModel) products.getModel()).addElement(element);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductButton;
    private javax.swing.JButton addProductToOrderButton;
    private javax.swing.JLabel allOrderedProductsLabel;
    private javax.swing.JLabel allOrdersLabel;
    private javax.swing.JLabel allProductLabel;
    private javax.swing.JPanel background;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JList<String> orderProducts;
    private javax.swing.JTextArea orders;
    private javax.swing.JTextField pDescription;
    private javax.swing.JTextField pName;
    private javax.swing.JTextField pPrice;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel productLabel;
    private javax.swing.JPanel productPanel;
    private javax.swing.JList<String> products;
    private javax.swing.JComboBox<String> productsCombo;
    private javax.swing.JButton removeProduct;
    // End of variables declaration//GEN-END:variables
}
