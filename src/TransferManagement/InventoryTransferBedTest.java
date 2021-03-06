/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferManagement;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Piyumi
 */
public class InventoryTransferBedTest extends javax.swing.JFrame {

    /**
     * Creates new form InventoryTranfer
     */
    public InventoryTransferBedTest() {
        initComponents();
        setLocationRelativeTo(null);
        HostelNameCombo();
        PlaceNameCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel16.setText("  Not Registred ?");

        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("New Place");
        jLabel17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel17MouseMoved(evt);
            }
        });
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("Bed Transfer Form");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Item Id");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("From");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("To");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Transfer Date");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Transfer Reason");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea2KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton1.setText("Transfer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bed Type", "Student Bed", "Staff Bed" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Item Type");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Place" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Place" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel12.setText("  Not Registred ?");

        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("New Place");
        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel15MouseMoved(evt);
            }
        });
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("New Place");
        jLabel18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel18MouseMoved(evt);
            }
        });
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setText("  Not Registred ?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, 200, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel14)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(3, 3, 3)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HostelNameCombo(){
          try{
            InventoryRegistration.connectiondb c=new InventoryRegistration.connectiondb();
            Statement stmt=c.getConnectiondb().createStatement();
            String selectQuery="select hostelname from hostel";
            ResultSet rs=stmt.executeQuery(selectQuery);
            while(rs.next())
            {
                String hostelName=rs.getString("hostelname");
                jComboBox2.addItem(hostelName);
                jComboBox3.addItem(hostelName);
            }
                  }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
    
          private void PlaceNameCombo(){
          try{
            connectiondb c=new connectiondb();
            Statement stmt=c.getConnectiondb().createStatement();
            
            String selectQuery="select placename from newplace";
            ResultSet rs=stmt.executeQuery(selectQuery);
            while(rs.next())
            {
                String newPlace=rs.getString("placename");
                jComboBox2.addItem(newPlace);
                jComboBox3.addItem(newPlace);
            }
                  }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped
        String PATTERN= "^[A-Za-z0-9 /,]{0,15000}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextArea1.getText());
        if(!match.matches()){
            jLabel7.setText("Please use comma for seperate the Item Id!");
        }else{
            jLabel7.setText(null);
        }
    }//GEN-LAST:event_jTextArea1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String itemType = jComboBox1.getSelectedItem().toString();
        String itemId = jTextArea1.getText();
        String tFrom = jComboBox2.getSelectedItem().toString();
        String tTo =  jComboBox3.getSelectedItem().toString();
        String tDate = null;
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        tDate = dFormat.format(jDateChooser1.getDate());
        String tReason =jTextArea2.getText();

        //Validation Is Empty

        if(jTextArea1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Transfer Items" );
        }

        else if(jComboBox2.getSelectedItem().toString().equals("Select Place")){
            JOptionPane.showMessageDialog(rootPane,"Enter Transfer From" );
        }
        else if(jComboBox3.getSelectedItem().toString().equals("Select Place")){
            JOptionPane.showMessageDialog(rootPane,"Enter Transfer To" );
        }

        else if(jTextArea2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Transfer Reason" );
        }
        else if(jComboBox1.getSelectedItem().toString().equals("Select Bed Type")){
            JOptionPane.showMessageDialog(rootPane,"Select Item Type" );
        }
        else if(jComboBox2.getSelectedItem().toString().equals(jComboBox3.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(rootPane,"Transfer can not be happen in Same Place" );
        }
        
        else{    
            
          
  if("Staff Bed".equals(itemType)){
        try {
            connectiondb c = new connectiondb();
            Statement stmt = c.getConnectiondb().createStatement();
           
           
                         
                String arrSplit[] = itemId.split(","); 
                for (int i=0; i < arrSplit.length; i++){
                     String selectQuery="SELECT itemid FROM staffbed WHERE itemid='"+arrSplit[i]+"'";
                     ResultSet rs55 = stmt.executeQuery(selectQuery);
            
                    if(rs55.next()){
                  
                  String query = "SELECT * FROM staffbedtransfer WHERE itemid = '"+arrSplit[i]+"'";
                  ResultSet rs1 = stmt.executeQuery(query);
                    if(rs1.next()){
                 
                   String query2= "UPDATE staffbedtransfer,staffbed SET staffbedtransfer.transferfrom='"+tFrom+"' , staffbedtransfer.transferto='"+tTo+"',staffbedtransfer.transferdate='"+tDate+"',staffbedtransfer.transferreason='"+tReason+"' ,staffbed.place='"+tTo+"'  WHERE staffbedtransfer.itemid ='"+arrSplit[i]+"' and staffbed.itemid=staffbedtransfer.itemid";
                        int n1= stmt.executeUpdate(query2);
                                if(n1!=0){
                                    String query4="select systembalance from totalinventory where itemtype='Staff Bed' and place='"+tFrom+"'";
                                    ResultSet rs4=stmt.executeQuery(query4);
                                    if(rs4.next()){
                                        String fromCount=rs4.getString("systembalance");
                                        int fc=Integer.parseInt(fromCount);
                                        
                                        String query5="select systembalance from totalinventory where itemtype='Staff Bed' and place='"+tTo+"'";
                                        ResultSet rs5=stmt.executeQuery(query5);
                                         fc=fc-1;
                                            
                                        if(rs5.next()){
                                            String toCount=rs5.getString("systembalance");
                                            int tc=Integer.parseInt(toCount);
                                            tc=tc+1;
                                            String query6= "UPDATE totalinventory SET systembalance='"+fc+"' where itemtype='Staff Bed' and place='"+tFrom+"'";
                                            String query7= "UPDATE totalinventory SET systembalance='"+tc+"' where itemtype='Staff Bed' and place='"+tTo+"'";
                                            int n6= stmt.executeUpdate(query6);
                                            int n7= stmt.executeUpdate(query7);
                                            if(n6!=0 && n7!=0){
                                                JOptionPane.showMessageDialog(rootPane,"Item update succefully 1");
                                            }else{
                                                JOptionPane.showMessageDialog(rootPane,"Error while updating 1");
                                            }
                                        }else{
                                           String query9 = "INSERT INTO totalinventory (itemtype,place,systembalance) VALUES ('Staff Bed','"+tTo+"','1')"; 
                                           String query10= "UPDATE totalinventory SET systembalance='"+fc+"' where itemtype='Staff Bed' and place='"+tFrom+"'";
                                           int n9= stmt.executeUpdate(query9);
                                            int n10= stmt.executeUpdate(query10);
                                            if(n9!=0 && n10!=0){
                                                JOptionPane.showMessageDialog(rootPane,"Item update succefully 2");
                                            }else{
                                                JOptionPane.showMessageDialog(rootPane,"Error while updating 2");
                                            }
                                           
                                        }
                                     
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(rootPane,"Error while updating");
                                }
                }else{
                        String query1 = "INSERT INTO staffbedtransfer (itemid,transferfrom,transferto,transferdate,transferreason) VALUES ('"+arrSplit[i]+"','"+tFrom+"', '"+tTo+"','"+tDate+"','"+tReason+"')";
                        int n2 = stmt.executeUpdate(query1);
                        if(n2!=0){
                            String query3="UPDATE staffbed SET place='"+tTo+"' where itemid ='"+arrSplit[i]+"'";
                            int n3 = stmt.executeUpdate(query3);
                                if(n3!=0){
                                    String query9="select systembalance from totalinventory where itemtype='Staff Bed' and place='"+tFrom+"'";
                                    ResultSet rs9=stmt.executeQuery(query9);
                                    
                                    if(rs9.next()){
                                        String fromCount=rs9.getString("systembalance");
                                        int fc=Integer.parseInt(fromCount);
                                    
                                        String query10="select systembalance from totalinventory where itemtype='Staff Bed' and place='"+tTo+"'";
                                        ResultSet rs10=stmt.executeQuery(query10);
                                        if(rs10.next()){
                                    
                                        String toCount=rs10.getString("systembalance");
                                        int tc=Integer.parseInt(toCount);
                                        fc=fc-1;
                                        tc=tc+1;
                                        String query6= "UPDATE totalinventory SET systembalance='"+fc+"' where itemtype='Staff Bed' and place='"+tFrom+"'";
                                        String query7= "UPDATE totalinventory SET systembalance='"+tc+"' where itemtype='Staff Bed' and place='"+tTo+"'";
                                        int n6= stmt.executeUpdate(query6);
                                        int n7= stmt.executeUpdate(query7);
                                        if(n6!=0 && n7!=0){
                                            JOptionPane.showMessageDialog(rootPane,"Item update succefully 3");
                                        }else{
                                            JOptionPane.showMessageDialog(rootPane,"Error while updating 3");
                                        }
                                    }    
                                    }
                            
                            }else{
                               JOptionPane.showMessageDialog(rootPane,"Error while updating 4");     
                            }
                            
                        }else{
                            JOptionPane.showMessageDialog(rootPane,"Error while updating 5");
                        }
                        
                    }
  
                }
            else{
                    JOptionPane.showMessageDialog(rootPane,"No '"+arrSplit[i]+"' in '"+itemType+"' Inventory ");
                 }
           }    
        } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        }
   
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextArea2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyTyped
        String PATTERN= "^[A-Za-z,]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextArea2.getText());
        if(!match.matches()){
        jLabel13.setText("Please use letters only");
        }else{
        jLabel13.setText(null);
        }
    }//GEN-LAST:event_jTextArea2KeyTyped

    private void jLabel15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseMoved

    }//GEN-LAST:event_jLabel15MouseMoved

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new newplaceregistration().setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseMoved

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseMoved

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
          new newplaceregistration().setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryTransferBedTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryTransferBedTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryTransferBedTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryTransferBedTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryTransferBedTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
