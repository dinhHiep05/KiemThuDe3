package com.example.DeMau3.entity;

public class SinhVien {
    private String ma;
    private String ten;
    private int tuoi;
    private String email;
    private String sdt;

    public SinhVien(String ma, String ten, int tuoi, String email, String sdt) {
        setMa(ma);
        setTen(ten);
        setTuoi(tuoi);
        setEmail(email);
        setSdt(sdt);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if (ma.isEmpty() || ma == null){
            throw new IllegalArgumentException("mã không để trống");
        }
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()){
            throw new IllegalArgumentException("tên không được trống");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi < 18){
            throw new IllegalArgumentException("tuổi phải lớn hơn 18");
        }
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty() || email==null){
            throw new IllegalArgumentException("email không để trống");
        }
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        if (sdt == null|| sdt.isEmpty()){
            throw new IllegalArgumentException("sdt không được trống");
        }
        this.sdt = sdt;
    }
}
