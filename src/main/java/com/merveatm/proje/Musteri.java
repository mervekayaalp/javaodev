package com.merveatm.proje;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.merveatm.proje.AtmIslemleri.paraCekme;
import static com.merveatm.proje.AtmIslemleri.paraYatirma;

public class Musteri extends BireyselMusteri {

    public static void main(String[] args)  {

        System.out.println("ATM projesi");

        // Bireysel müşteri bilgileri

        BireyselMusteri bireyselmusteri1 = new BireyselMusteri();
        BireyselMusteri bireyselmusteri2 = new BireyselMusteri();
        BireyselMusteri bireyselmusteri3 = new BireyselMusteri();
        BireyselMusteri bireyselmusteri4 = new BireyselMusteri();
        BireyselMusteri bireyselmusteri5 = new BireyselMusteri();

        bireyselmusteri1.TCKimlikNo = "16478982576";
        bireyselmusteri1.adSoyad = "Kübra Kayaalp";
        bireyselmusteri1.evAdresi = "Maltepe";
        bireyselmusteri1.hesapBakiyesi = 10000;

        bireyselmusteri2.TCKimlikNo = "14567832459";
        bireyselmusteri2.adSoyad = "Merve Kayaalp";
        bireyselmusteri2.evAdresi = "Ayvalık";
        bireyselmusteri2.hesapBakiyesi = 10000;

        bireyselmusteri3.TCKimlikNo = "98536728761";
        bireyselmusteri3.adSoyad = "Kadir Aktar";
        bireyselmusteri3.evAdresi = "Şanlıurfa";
        bireyselmusteri3.hesapBakiyesi = 10000;

        bireyselmusteri4.TCKimlikNo = "62795836473";
        bireyselmusteri4.adSoyad = "Emre Söner";
        bireyselmusteri4.evAdresi = "Bursa";
        bireyselmusteri4.hesapBakiyesi = 10000;

        bireyselmusteri5.TCKimlikNo = "94563728561";
        bireyselmusteri5.adSoyad = "Muammer Kayaalp";
        bireyselmusteri5.evAdresi = "Gümüşhane";
        bireyselmusteri5.hesapBakiyesi = 10000;


        // Kurumsal Müşteri Bilgileri

        KurumsalMusteri kurumsalmusteri1 = new KurumsalMusteri();
        KurumsalMusteri kurumsalmusteri2 = new KurumsalMusteri();
        KurumsalMusteri kurumsalmusteri3 = new KurumsalMusteri();
        KurumsalMusteri kurumsalmusteri4 = new KurumsalMusteri();
        KurumsalMusteri kurumsalmusteri5 = new KurumsalMusteri();

        kurumsalmusteri1.TCKimlikNo = "76894156876";
        kurumsalmusteri1.adSoyad = "Mahmut Tuncer";
        kurumsalmusteri1.sirketAdı = "Zirve";
        kurumsalmusteri1.hesapBakiyesi = 20000;

        kurumsalmusteri2.TCKimlikNo = "83624559702";
        kurumsalmusteri2.adSoyad = "Nigar Sağlam";
        kurumsalmusteri2.sirketAdı = "Sağlam";
        kurumsalmusteri2.hesapBakiyesi = 10000;

        kurumsalmusteri3.TCKimlikNo = "94038600216";
        kurumsalmusteri3.adSoyad = "Ceren Koç";
        kurumsalmusteri3.sirketAdı = "Fizyokent";
        kurumsalmusteri3.hesapBakiyesi = 10000;

        kurumsalmusteri4.TCKimlikNo = "80025185746";
        kurumsalmusteri4.adSoyad = "Sinem Demirbilek";
        kurumsalmusteri4.sirketAdı = "Demirbilek";
        kurumsalmusteri4.hesapBakiyesi = 10000;

        kurumsalmusteri5.TCKimlikNo = "40074842226";
        kurumsalmusteri5.adSoyad = "Yılmaz Akkan";
        kurumsalmusteri5.sirketAdı = "Akkanlar";
        kurumsalmusteri5.hesapBakiyesi = 10000;

        Map<String , BireyselMusteri> bireyselMusteriMap = new HashMap<>();

        bireyselMusteriMap.put("62782563420" , bireyselmusteri1);
        bireyselMusteriMap.put("62782563421" , bireyselmusteri2);
        bireyselMusteriMap.put("62782563422" , bireyselmusteri3);
        bireyselMusteriMap.put("62782563423" , bireyselmusteri4);
        bireyselMusteriMap.put("62782563424" , bireyselmusteri5);

        Map<String, KurumsalMusteri> kurumsalMusteriMap = new HashMap<>();

        kurumsalMusteriMap.put("62782563425" , kurumsalmusteri1);
        kurumsalMusteriMap.put("62782563426" , kurumsalmusteri2);
        kurumsalMusteriMap.put("62782563427" , kurumsalmusteri3);
        kurumsalMusteriMap.put("62782563428" , kurumsalmusteri4);
        kurumsalMusteriMap.put("62782563429" , kurumsalmusteri5);



            Scanner musterinumarasi = new Scanner(System.in);

            Scanner musteri = new Scanner(System.in);
            System.out.println("Banka Müşteri No Giriniz: ");
            String musteriNo = musteri.nextLine();
            System.out.println("Banka Müşteri No: " + musteriNo);

            if (bireyselMusteriMap.containsKey(musteriNo)) {
            System.out.println("Müşteri Bilgileri : " + bireyselMusteriMap.get(musteriNo).toString());
                bireyselMusteriMap.get(musteriNo);

            }else if (kurumsalMusteriMap.containsKey(musteriNo)){
                System.out.println("Müşteri Bilgileri : " + kurumsalMusteriMap.get(musteriNo).toString());
            }else {
                System.out.println( musteriNo +" Müşteri Nolu Kullanıcı Bulunamadı! ");
            }

            Scanner IslemSeciniz = new Scanner(System.in);

            Scanner Islem = new Scanner(System.in);
            System.out.println("İşlem Numarası Giriniz:");
            int islemNo = Islem.nextInt();
            System.out.println("İşlem Numarası " + islemNo);


            if(islemNo==1) {
                if (bireyselMusteriMap.containsKey(musteriNo)) {
                    System.out.println("Bireysel Mevcut Bakiye : " + bireyselMusteriMap.get(musteriNo).mevcutBakiye());
                    bireyselMusteriMap.get(musteriNo);
                    System.out.println("Para Yatırma İşlemi");
                    System.out.println("Yatırılacak Para Miktarı");
                    int para = Islem.nextInt();
                    int x = bireyselMusteriMap.get(musteriNo).hesapBakiyesi;
                    int sonuc=0;
                    paraYatirma(0,x,para);

                }else if (kurumsalMusteriMap.containsKey(musteriNo)) {
                    System.out.println("Kurumsal Mevcut Bakiye : " + kurumsalMusteriMap.get(musteriNo).mevcutBakiye());
                    kurumsalMusteriMap.get(musteriNo);
                    int x = kurumsalMusteriMap.get(musteriNo).hesapBakiyesi;
                    System.out.println("Para Yatırma İşlemi");
                    System.out.println("Para Yatırılacak Miktarı");
                    int para = Islem.nextInt();
                    int sonuc = 0;
                    paraYatirma(0,x,para);
                }




            }else if(islemNo==2){


                if (bireyselMusteriMap.containsKey(musteriNo)) {
                    System.out.println("Bireysel Mevcut Bakiye : " + bireyselMusteriMap.get(musteriNo).mevcutBakiye());
                    bireyselMusteriMap.get(musteriNo);
                    int x = bireyselMusteriMap.get(musteriNo).hesapBakiyesi;
                    System.out.println("Para Çekme İşlemi");
                    System.out.println("Çekilecek Para Miktarı");
                    int para = Islem.nextInt();
                    int sonuc = 0;
                    paraCekme(0,x,para);
                    System.out.println(sonuc);

                }else if (kurumsalMusteriMap.containsKey(musteriNo)) {
                    System.out.println("Kurumsal Mevcut Bakiye : " + kurumsalMusteriMap.get(musteriNo).mevcutBakiye());
                System.out.println("Para Çekme İşlemi");
                System.out.println("Çekilecek Para Miktarı");
                int para = Islem.nextInt();
                int x = kurumsalMusteriMap.get(musteriNo).hesapBakiyesi;
                int sonuc = 0;
                paraCekme(0,x,para);
                System.out.println(sonuc);

            }
            else {
                    System.out.println("Geçersiz İşlem");
                }
            }





    }


}
