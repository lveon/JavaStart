import java.util.Scanner;
public class LotteryMethod {
    public static void main (String [] args) {


        Scanner in = new Scanner (System.in);

        int [] user =new int [6];
        int i;
        //Fill user array

        System.err.println("Welcome to Miwand Lottery");
        System.out.println("Please enter your 6 desiered number to enter the lottery");
        System.out.println("Pick from 1 to 49");

        for (  i=0;i<user.length;i++) // gets numbers until it equals 6
        {
            System.out.println("Number:");

            user[i]= in.nextInt(); // Gets numbers from user

            while  (user[i] < 0 ) // if its a negative number tell user to enter again
            {
                System.err.println("Negative number, please enter again:");
                user[i]=in.nextInt();
            }

            if (user[i] > 49) // if the number goes past 49 prompt again
            {
                System.err.println("Please enter numbers from 1 - 49");
            }
        }


    }



}
