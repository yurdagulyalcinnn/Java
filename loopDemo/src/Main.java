
public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 1; i < 10; i = i + 2) {
            System.out.println(i);

        }
        System.out.println("for döngüsü bitti");
        //while
        int i = 0;
        while (i < 10) {

            System.out.println(i++);
            // ya parantezinin içine ++ ile yazılır ya da altına şartı belirtilir.
            // i++; ile alta belirtilir.
            //sadece i yazarsak sonsuz defa 0 yazar :)

        }

        System.out.println("while döngüsü bitti");

        //do-while
        int j = 0;
        do {

            System.out.println(j);
            j++;

        }
        while (j < 10) ;
        System.out.println("do-while döngüsü bitti");

    }
}

