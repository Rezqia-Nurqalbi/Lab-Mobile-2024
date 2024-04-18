package com.example.praktikum4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Deku","AdekKucing"
                ,"Halooooo",R.drawable.post2,R.drawable.post2));

        instagrams1.add(new Instagram("Mochi", "cing"
                ,"Kenalin aku gambar kucing yang diambil di pinterest"
                ,R.drawable.post3,R.drawable.post3));

        instagrams1.add(new Instagram("Belang", "hui"
                ,"Haloo aku peri dari langit liat nih aku punya sayap"
                ,R.drawable.post4, R.drawable.post4));

        instagrams1.add((new Instagram("Bening","Neng"
                ,"Haloo aku kucing putih yang bersih dan pintar"
                ,R.drawable.post5,R.drawable.post5)));

        instagrams1.add(new Instagram("Si Baby", "cute"
                    ,"Hai Aku anak kucing yang cute nya minta ampun"
                ,R.drawable.post6,R.drawable.post6));

        instagrams1.add(new Instagram("Kembar","U&I"
                ,"Haiii kenalin kembaran aku yang namanya Ipin"
                ,R.drawable.post7, R.drawable.post7));

        instagrams1.add(new Instagram("Oyen","Sikucing Orange"
                , "Kami berdua bersaudara yang akur"
                ,R.drawable.post8,R.drawable.post8));

        instagrams1.add(new Instagram("Sibucin","Bucin"
                ,"Kenalin ini pasangan ku, pasangan mu mana"
                ,R.drawable.post9, R.drawable.post9));

        instagrams1.add(new Instagram("KucingLucu", "Socute"
                ,"Aku pake kacamata baru ni boss"
                ,R.drawable.post10, R.drawable.post10));

        instagrams1.add(new Instagram("kucing_official", "Kucing"
                ,"Tidur enak ni, udah lelah sama THR(TUGAS HARI RAYA)"
                ,R.drawable.kucing, R.drawable.kucing));
        return instagrams1;
    }
}