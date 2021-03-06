/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author pritesh jung karki
 */
public class UpdateStock extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateStock
     */
    public UpdateStock() {
        initComponents();
        show_stock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Updatestock = new javax.swing.JLabel();
        Product_id = new javax.swing.JLabel();
        Product_name = new javax.swing.JLabel();
        Quantity_available = new javax.swing.JLabel();
        Quantity_added = new javax.swing.JLabel();
        Mrp = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        New = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update  Stock");

        Updatestock.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Updatestock.setText("Update Stock");

        Product_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Product_id.setText("Product ID");

        Product_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Product_name.setText("Product Name");

        Quantity_available.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Quantity_available.setText("Add Quantity");

        Quantity_added.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Quantity_added.setText("Quantity ");

        Mrp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Mrp.setText("Mrp");

        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setText("Update Stock");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        New.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        New.setForeground(new java.awt.Color(0, 0, 102));
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7-32.png"))); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 0, 102));
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updateimage.png"))); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product_Name", "Available", "Mrp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setRequestFocusEnabled(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Product_id)
                                    .addComponent(Product_name)
                                    .addComponent(Quantity_available)
                                    .addComponent(Quantity_added)
                                    .addComponent(Mrp))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(New)
                                .addGap(83, 83, 83)
                                .addComponent(Update))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(Updatestock)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Updatestock)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Product_id)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Product_name)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Quantity_available)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Quantity_added)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mrp)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(New)
                            .addComponent(Update))
                        .addGap(65, 65, 65))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void emptyTextField(){
               jTextField1.setText("");
               jTextField2.setText("");
               //jTextField3.setText("");
               jTextField4.setText("");
               jTextField5.setText("");
    }
     public void executeSQlQuery(String query, String message)
   {
       Connection con = DatabaseWork.getConnection();
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               model.setRowCount(0);
               show_stock();
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
               
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
     public ArrayList<Stock>getStockList()
    {
        ArrayList<Stock>stockList=new ArrayList<Stock>();
        Connection connection=DatabaseWork.getConnection();
        String query="SELECT * FROM stock;";
        Statement st;
        ResultSet rs;
        try{
            st=connection.createStatement();
            rs=st.executeQuery(query);
            Stock stock;
            while(rs.next())
            {
                stock = new Stock(rs.getString("id"),rs.getString("pname"),rs.getInt("available"),rs.getInt("mrp"));
               stockList.add(stock);
            }
            
        }
        catch(Exception e)
        {
         e.printStackTrace();
        }
        return stockList;
    }
     public void show_stock()
    {
        ArrayList<Stock> list=getStockList();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getProduct_Name();
            row[2]=list.get(i).getAvailable();
            row[3]=list.get(i).getMrp();
            
            model.addRow(row);
        }
        
    }
    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
         if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Fill all fileds");
     }else{
        String query="INSERT INTO stock(id,pname,available,mrp) VALUES('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"');";
            executeSQlQuery(query, "Inserted");
            emptyTextField();
         }   // TODO add your handling code here:
    }//GEN-LAST:event_NewActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
            jTextField3.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
                 String s2= jTextField3.getText();
                 String s1=jTextField4.getText();
                 int a=Integer.parseInt(s1);
                 int b=Integer.parseInt(s2);
                 int c=a+b;
                 String result=String.valueOf(c);
                 jTextField3.setText(result);
                String query;
                query ="UPDATE stock SET pname='"+jTextField2.getText()+"',available="+jTextField3.getText()+",mrp="+jTextField5.getText()+" WHERE id="+jTextField1.getText();
                executeSQlQuery(query,"Update");   // TODO add your handling code here:*/
                emptyTextField();
               
    }//GEN-LAST:event_UpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i=jTable1.getSelectedRow();        // TODO add your handling code here:
    TableModel model=jTable1.getModel();
    jTextField1.setText(model.getValueAt(i, 0).toString());
    jTextField2.setText(model.getValueAt(i, 1).toString());
    jTextField4.setText(model.getValueAt(i, 2).toString());
    //jTextField4.setText(model.getValueAt(i, 3).toString());
    jTextField5.setText(model.getValueAt(i, 3).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mrp;
    private javax.swing.JButton New;
    private javax.swing.JLabel Product_id;
    private javax.swing.JLabel Product_name;
    private javax.swing.JLabel Quantity_added;
    private javax.swing.JLabel Quantity_available;
    private javax.swing.JButton Update;
    private javax.swing.JLabel Updatestock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
