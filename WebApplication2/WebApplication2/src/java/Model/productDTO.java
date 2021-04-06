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
public class productDTO {
    int idSp;
    String tenSp;
    float gia;
    String mota;
    String anh;
    int soLuong;

    public productDTO(int idSp, String tenSp, float gia, String anh) {
        this.idSp = idSp;
        this.tenSp = tenSp;
        this.gia = gia;
        this.anh = anh;
    }

    public productDTO(int idSp, String tenSp, float gia, String mota, String anh, int soLuong) {
        this.idSp = idSp;
        this.tenSp = tenSp;
        this.gia = gia;
        this.mota = mota;
        this.anh = anh;
        this.soLuong = soLuong;
    }

    public productDTO() {
    }

    public productDTO(int idSp, String tenSp, float gia, String mota, String anh) {
        this.idSp = idSp;
        this.tenSp = tenSp;
        this.gia = gia;
        this.mota = mota;
        this.anh = anh;
    }

    public int getidSp() {
        return idSp;
    }

    public void setidSp(int idSp) {
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    
}
