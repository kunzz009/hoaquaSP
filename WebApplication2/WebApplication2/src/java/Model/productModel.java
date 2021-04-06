/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class productModel {

    public static List<productDTO> getAll() {
        List<productDTO> arr = new ArrayList<>();
        Connection conn;
        try {
            conn = connectDB.getConnect();

            String query = "select * from tblSanPham";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = Integer.valueOf(rs.getString("IdSP"));
                String ten = rs.getString("TenSP");
                float gia = Float.valueOf(rs.getString("Gia"));
                String anh = rs.getString("anh");
                String mota = rs.getString("mota");
                productDTO obj = new productDTO(id, ten, gia, mota, anh);
                arr.add(obj);
            }
            //dong ket noi
            conn.close();
        } catch (SQLException ex) {
            return null;
        }
        return arr;

    }

    public static productDTO getById(int id) {
        productDTO dsHoaQua = new productDTO();
        Connection conn;
        try {
            conn = connectDB.getConnect();
            String query = "select * from tblSanPham where IdSP = " + id + ";";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                int idSp = Integer.valueOf(rs.getString("IdSP"));
                String ten = rs.getString("TenSP");
                int gia = Integer.valueOf(rs.getString("Gia"));
                String mota = rs.getString("mota");
                String anh = rs.getString("anh");
                int soLuong = Integer.valueOf(rs.getString("soLuong"));
                productDTO tmp = new productDTO(idSp, ten, gia, mota, anh, soLuong);
                dsHoaQua = tmp;
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(productModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsHoaQua;
    }

    public static List<productDTO> getAll(int page) {
        int from = page * 4;
        List<productDTO> arr = new ArrayList<>();
        Connection conn;
        try {
            conn = connectDB.getConnect();

            String query = "select * from tblSanPham order by IdSP OFFSET " + from + " ROWS FETCH NEXT 4 ROWS ONLY";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = Integer.valueOf(rs.getString("IdSP"));
                String ten = rs.getString("tenSP");
                float gia = Float.valueOf(rs.getString("Gia"));
                String anh = rs.getString("anh");
                String mota = rs.getString("mota");
                productDTO obj = new productDTO(id, ten, gia, mota, anh);
                arr.add(obj);
            }
            //dong ket noi
            conn.close();
        } catch (SQLException ex) {
            return null;
        }
        return arr;
    }

    public static int countSp() {
        int count = 0;
        //mo ket noi
        Connection conn;
        try {
            conn = connectDB.getConnect();
            //thao tac lay du lieu
            String query = "select count(*) as tongSp from tblSanPham";
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                count = Integer.valueOf(result.getString("tongSp"));
            }
            //dong ket noi
            conn.close();
        } catch (Exception ex) {
            return 0;
        }
        return count;
    }
}
