
public class Main {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        int sayi3;
        sayi1 = 25;
        sayi2 = 30;
        sayi3 = 5;

        int enBuyukSayi= 1;

        if (enBuyukSayi<sayi1)
        {
            enBuyukSayi=sayi1;
        }

        if (enBuyukSayi<sayi2)
        {
            enBuyukSayi=sayi2;
        }
        if (enBuyukSayi<sayi3)
        {
            enBuyukSayi=sayi3;
        }
        System.out.println("en büyük sayı: " +enBuyukSayi);
    }
}