//void operasyonlar bir şeyi yap demek :)
public class Main {
    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 2);
        String newMesaj = sehirVer();
        System.out.println(yeniMesaj);

        int sayi = topla(5, 7);
        System.out.println(sayi);

        int toplam = topla2(4, 5, 8, 1, 78);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("güncellendi");
    }

    public static int topla(int sayi1, int sayi2) { //bu sadece 2 adet sayı için izin veriyor.Daha fazla sayı için variable args  kullanılır

        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) { //birden fazla sayı göndermek için ... kullanmak gerekir. Buna variable args deniyor :) Bu sayılar bir int array gibi çalışıyor

        int toplam2=0;
        for(int sayi:sayilar){
            toplam2+=sayi;
        }
        return toplam2;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}