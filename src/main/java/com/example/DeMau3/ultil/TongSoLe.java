package com.example.DeMau3.ultil;

public class TongSoLe {

    public int tongSoLe(int mang[]){
        int tong=0;
        for (int n: mang){
            if (n%2!=0 && n<100){
                tong+=n;
            }
        }

        return tong;
    }
}
