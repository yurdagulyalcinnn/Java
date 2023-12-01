// ctrl+shift+alt+l tüm kodu doğru formata düzeltir.
public class Main {
    public static void main(String[] args) {
        char grade = 'G';

        switch (grade) {
            case 'A':
                System.out.println("mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("çok güzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("güzel: Geçtiniz");
                break;
            case 'D':
                System.out.println("fena değil: Geçtiniz");
                break;
            case 'F':
            case 'G': // aynı çıktıyı almak için böyle yaparız
                System.out.println("çok güzel: Kaldınız");
                break;
            default:
                System.out.println("gerçersiz not girdiniz ");
        }

    }
}