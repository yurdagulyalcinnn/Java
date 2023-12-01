import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       String message = "bugün hava çok güzel";
       /* System.out.println(message);
        System.out.println("eleman sayısı :" +message.length());
        System.out.println("5. eleman :" +message.charAt(4));
        System.out.println(message.concat(" yaşasın!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.startsWith("b"));
        System.out.println(message.endsWith("l"));
        char[] karakterler =new char[5];
        message.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf("a"));*/


        String newMessage =message.replace(' ','-');
        System.out.println(message.replace(' ','-'));
        System.out.println(message.substring(2));
        System.out.println(message.substring(2,4));
        for(String kelime : message.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.trim());
    }
}