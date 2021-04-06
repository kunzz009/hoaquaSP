/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class AccountDAO {
    public static boolean login(Account account) {
        boolean check = false;
        Connection conn;
        try {
            conn = connectDB.getConnect();
            //thao tac lay du lieu
            String query = "select * from tblUser where Username='" + account.getUser()+ "' and Pass='" + account.getPass() + "'";
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                check = true;
            }
            //dong ket noi
            conn.close();
        } catch (Exception ex) {
            return false;
        }
        return check;
    }

    
}
