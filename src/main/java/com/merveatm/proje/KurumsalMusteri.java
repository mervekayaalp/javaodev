package com.merveatm.proje;

public class KurumsalMusteri {

    public String TCKimlikNo;
    public String adSoyad;
    public String sirketAdı;
    public int hesapBakiyesi;

    @Override
    public String toString() {
        return "KurumsalMusteri{" +
                "TCKimlikNo='" + TCKimlikNo + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", sirketAdı='" + sirketAdı + '\'' +
                ", hesapBakiyesi=" + hesapBakiyesi +
                '}';
    }
    public String mevcutBakiye() {
        return "mevcutBakiye=" + hesapBakiyesi;
    }
}
