package HostelManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Piyumi
 */
public class connectiondb {
Connection con;
    
    public Connection getConnectiondb(){
        try {
            String driver = "com.mysql.jdbc.Driver";
            String URL = "jdbc:mysql://localhost:3306/uwuhosteldb";
               String UNAME = "root";
               String PSW ="";
            
            //Loading the driver
            Class.forName(driver);
            //Creating the connection
            con = DriverManager.getConnection(URL,UNAME,PSW);
            //statement
                Statement stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
    
    public void closeConnectiondb(){
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
}

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



  