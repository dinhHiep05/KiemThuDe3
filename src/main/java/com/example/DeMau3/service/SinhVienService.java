package com.example.DeMau3.service;

import com.example.DeMau3.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    List<SinhVien> sinhViens = new ArrayList<>();

    public void add (SinhVien sinhVien){
        sinhViens.add(sinhVien);
    }

    public SinhVien getSVByMa (String ma){
        for (SinhVien sinhVien: sinhViens){
            if (sinhVien.getMa() == ma){
                return sinhVien;
            }
            else {
                throw new IllegalArgumentException("không tìm thấy");
            }
        }
        return null;
    }


}
