public class loops {
    public static void main(String[] args) {



/*
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");

// for (innit var; condition; action)

        int var = 1;
        while (var >1) {
            System.out.print("*\n");
            var = var -1 ;
        }
                do {
                    System.out.print("*");
                    var = var-1;
                }while (var>5);
*/





       /* for(int counter = 0; counter < 10; counter ++){
            for(int counter2 = 0; counter2 < 10; counter2++){
                if(counter2 <= counter) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }*/
/*
        int a = 10;
        for(int i = 0; i < 10; i++){
            for (int j = 1; j <= a; j++){
                System.out.print(" ");
            }
            a--;
            int h = 0;
            for(int k = 0; k <= a; k++){
                System.out.print("*");

            }
            System.out.print("\n");*/

        int a = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            a--;
            int h = 9;

            for (int k = 0; h >= a; k++) {
                System.out.print("*");
                h--;
            }
            System.out.print("\n");


        }
    }
}















