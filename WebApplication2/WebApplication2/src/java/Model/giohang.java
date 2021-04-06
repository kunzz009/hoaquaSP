/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class giohang {
    int idSp;
    String tenSp;
    float gia;
    String anh;
    int soLuong;
    
    public static ArrayList<giohang> themSp(int idSp, ArrayList<giohang> listGioHang) {
        System.out.println("item:" + listGioHang.size());
        //thong tin san pham
        productDTO product = productModel.getById(idSp);
        if (product != null) {
            giohang item = new giohang(idSp, product.getTenSp(), product.getGia(), product.getAnh(), 1);
            if (listGioHang == null || listGioHang.size() == 0) {
                listGioHang = new ArrayList<giohang>();
                listGioHang.add(item);
            } else {
                boolean checkExit = false;
                for (int i = 0; i < listGioHang.size(); i++) {
                    if (listGioHang.get(i).getIdSp()== idSp) {
                        giohang objGioHang = listGioHang.get(i);
                        objGioHang.setSoLuong(objGioHang.getSoLuong() + 1);
                        listGioHang.set(i, objGioHang);
                        checkExit = true;
                    }
                }
                if (!checkExit) {
                    listGioHang.add(item);
                }
            }
        }
        return listGioHang;
    }

    public giohang(int idSp, String tenSp, float gia, String anh, int soLuong) {
        this.idSp = idSp;
        this.tenSp = tenSp;
        this.gia = gia;
        this.anh = anh;
        this.soLuong = soLuong;
    }

    public int getIdSp() {
        return idSp;
    }

    public void setIdSp(int idSp) {
        this.idSp = idSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
