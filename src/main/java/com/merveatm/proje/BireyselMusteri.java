package com.merveatm.proje;

public class BireyselMusteri {

    public String TCKimlikNo;
    public String adSoyad;
    public String evAdresi;
    public int hesapBakiyesi;


    @Override
    public String toString() {
        return "BireyselMusteri{" +
                "TCKimlikNo='" + TCKimlikNo + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", evAdresi='" + evAdresi + '\'' +
                ", hesapBakiyesi=" + hesapBakiyesi +
                '}';
    }

    public String mevcutBakiye() {
        return "mevcutBakiye=" + hesapBakiyesi;
    }


}
