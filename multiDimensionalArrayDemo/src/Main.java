
public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][4];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "mersin";
        sehirler[0][2] = "ankara";
        sehirler[0][3] = "konya";
        sehirler[1][0] = "nevşehir";
        sehirler[1][1] = "bitlis";
        sehirler[1][2] = "izmir";
        sehirler[1][3] = "adana";
        sehirler[2][0] = "siirt";
        sehirler[2][1] = "mardin";
        sehirler[2][2] = "ağrı";
        sehirler[2][3] = "kars";

        for(int i=0;i<3;i++){
            System.out.println("--------------------");
            for (int j=0; j<4;j++){
                System.out.println(sehirler [i] [j]);
            }
        }
    }
}