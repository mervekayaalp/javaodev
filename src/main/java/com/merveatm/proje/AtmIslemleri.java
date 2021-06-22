package com.merveatm.proje;

public class AtmIslemleri {

    public static int paraYatirma(int sonuc,int x, int y) {

        sonuc = x + y;
        System.out.println(sonuc);
        return sonuc;

    }

    public static int paraCekme(int sonuc,int x, int y){
        sonuc = x - y;
        System.out.println(sonuc);
        return sonuc;
    }



}
