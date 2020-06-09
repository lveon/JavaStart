import java.util.Scanner;

public class Scannner {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Word: ");
        String word = sc.next();
        System.out.println("Word: " + word);


        String line = sc.nextLine();
        System.out.println("Line: " + line);

    if (sc.hasNextInt()) {
        int sInt = sc.nextInt();
        System.out.println("Int: " + sInt);
    }else {
        word= sc.next();
        double sDouble = sc.nextDouble();
        System.out.println("Double: " + sDouble);
    }

    }
}
