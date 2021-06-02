/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Asus
 */
public class DBConnection {
    public Connection getConnection(){
        Connection con = null;
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
            //JOptionPane.showMessageDialog(null, "Koneksi Sukses");
            return con;
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(FormPenilaian.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}