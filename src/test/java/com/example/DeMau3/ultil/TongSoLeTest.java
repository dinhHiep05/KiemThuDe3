package com.example.DeMau3.ultil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongSoLeTest {
    private TongSoLe tongSoLe;
    @BeforeEach
    void setUp() {
        tongSoLe = new TongSoLe();
    }

    @Test
    void tongSoLe() {
        int mang[]={1,2,3,4,5};
        assertEquals(9, tongSoLe.tongSoLe(mang));
    }
    @Test
    void tongSoLe1() {
        int mang[]={1,2,3,4,5,99};
        assertEquals(108, tongSoLe.tongSoLe(mang));
    }

    @Test
    void tongSoLe0() {
        int mang[]={0,2,3,4,5,99};
        assertEquals(107, tongSoLe.tongSoLe(mang));
    }

    @Test
    void tongSoLe3() {
        int mang[]={1,2,3,4,5,100};
        assertEquals(9, tongSoLe.tongSoLe(mang));
    }

}