
public class Main {
    public static void main(String[] args) {
        double total = 0;

        double[] myNumber = {1.2, 2.3, 3.4, 4.5, 5.6};
        double max = myNumber[0];
        for (double number : myNumber) {
            total = total + number;
            System.out.println(number);
            if (max<number){
                max=number;
            }
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);
    }
}