package com.example.DeMau3.service;

import com.example.DeMau3.entity.SinhVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService;
    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
    }

    @Test
    void getSVByMaValid() {
        SinhVien sinhVien = new SinhVien("ma1", "khốn", 19, "asds", "1111112345");
        sinhVienService.add(sinhVien);

//        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sinhVienService.getSVByMa("ma1"));
        assertEquals(sinhVien, sinhVienService.getSVByMa(sinhVien.getMa()));
    }

    @Test
    void getSVByMaNull() {
        SinhVien sinhVien = new SinhVien("ma1", "khốn", 19, "asds", "1111112345");
        sinhVienService.add(sinhVien);

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sinhVienService.getSVByMa(""));
        assertEquals("không tìm thấy", exception.getMessage());
    }

    @Test
    void getSVByMaFalse() {
        SinhVien sinhVien = new SinhVien("ma1", "khốn", 19, "asds", "1111112345");
        sinhVienService.add(sinhVien);

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sinhVienService.getSVByMa(null));
        assertEquals("không tìm thấy", exception.getMessage());
    }

    @Test
    void getSVByMaSai() {
        SinhVien sinhVien = new SinhVien("ma1", "khốn", 19, "asds", "1111112345");
        sinhVienService.add(sinhVien);

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sinhVienService.getSVByMa("ma2"));
        assertEquals("không tìm thấy", exception.getMessage());
    }
}