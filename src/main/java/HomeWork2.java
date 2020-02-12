import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class HomeWork2 {

    public static void main(String[] args) {

        //*Вывести последовательность чисел от -5 до + 5 в порядке возрастания.

        /*for (int i = -5; i <= 5; i++) {
            System.out.print(i + " ");
        }*/
        /*   --------------------------------------------------------------------------------------------------------*/
// Вывести последовательность чисел от -10 до + 10 в порядке убывания.

      /*  int i =10;
        for (; i >=-10; i--) {
            System.out.print(i + " ");
        }*/
        /* --------------------------------------------------------------------------------------------------------*/

        ///* Александр очень гостепреимный парень и он знает вкусы своих друзей, а друзей у него много, чтобы
        //         не перепутать ему нужна программа, которая сообщает ему предпочтения друга, когда он вводит его номер в
        //         программе. Макс любит крепкий чай с сахаром, Артем предпочитает кофе с молоком, Юля любит кофе без сахара,
        //         Антон пьет только фреш из апельсинов, Степан пьет зеленый чай с мелисой, остальные друзья не имеют особых
        //         предпочтений. Помогите Саше и напишите программу для него.

/*

      int hotNumber =4;
        switch (hotNumber){
            case 1:
                System.out.println("Крепкий чай с сахаром");
                break;
            case 2:
                System.out.println("Кофе с молоком");
                break;
            case 3:
                System.out.println("Фреш из апельсинов");
                break;
            case 4:
                System.out.println("Зеленый чай с мелисой");
                break;
            default:
                System.out.println("Лошары");
        }
*/

        /*_________________________________________________________________________________________________________________________________*/


        // Нарисовать eбу*** равнобедренный треугольник символом  заполненный и не заполненный.

  /*      int count =10;

            for(int i=1;i<count;++i) {
                for (int j = 1; j < i/2; ++j)
                   System.out.print(" ");
                System.out.print("*");
                System.out.println();

            }*/


/*        int count = 1;
        {
            for (int i = 20; i > count; --i) {
                for (int j = 10; j > i; --j)
                    System.out.print("*");
                System.out.println();


            }
        }*/






       /* int rowCount = 10;

        for (int i = 1; i <= rowCount; i++) {
            for (int spaceCount = rowCount; spaceCount >i; spaceCount--)
                System.out.print(" ");

            for (int starCount = 1; starCount < i*2; starCount++)
                System.out.print("*");
            System.out.println();
        }*/


/*        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 2) {
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 2) {

                continue;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 4; i++) {
            if (i>4 )
           System.out.print("*");
            System.out.print("*");*/


        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3)*/


/*                    System.out.print("#");

                else
                    System.out.print(" ");

            }
            System.out.println("");
        }*/
/*int i= 1;
int n =1;
 for (int j=2;j <2*i-1; j++ )
        System.out.println("*");*/



       /* int n = 3;

        for (int i = 1; i<=n; i++) {

            for (int z = 0; z < n - i; z++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2 * i - 1; j++) {
               System.out.print("*");

            }
            System.out.println("");

        }*/
 /*       int rowCount = 3;

        for (int i = 1; i <= rowCount; i++) {
            for (int spaceCount = 0; spaceCount < rowCount-i; spaceCount++) {
                System.out.print(" ");
            }
            for (int starCount = 1; starCount < i *2; starCount++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


     /*   int rowCount = 3;

        for (int i = 1; i <= rowCount; i++) {
            for (int spaceCount = 0; spaceCount < rowCount - i; spaceCount++) {
                if (spaceCount == rowCount) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");


                }
                for (int starCount = 1; starCount < i * 2; starCount++) {
                    if (starCount == i * 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }*/






       /* int high = 5;
        for (int x = 0; x < high; x++) {
            for (int y = high; y >= x; y--) {
                if (y == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            for (int y = 1; y <= x * 2; y++) {
                if (y == x * 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }*/







     /*   *Работник хочет купить машину. Ему нужно для этого 18000. Его зарплата 2000. Он откладывает по 5% зарплаты
        каждый месяц в депозит под 15% годовых. Сколько времени он будет копить на машину?*/



        int salary = 2000;
        double nichka = salary * 0.05;
        double deposit = nichka * 1.15;
        double goal = 0;
        int carPrice = 18000;
        int monthQuantity = 0;


        while (carPrice > goal) {
            goal = goal + deposit;
            monthQuantity++;
        }

        System.out.println(monthQuantity/12 + " лет в рабстве и Жигуль твой");


   /*     int weight = 6;
        int high = 3;
        int left = 3;
        int right = 3;


        for (int i = 0; i < high; i++) {

            for (int k = 0; k <= weight; k++) {

                if (k >= left & k <= right) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            left = left - 1;
            right = right + 1;
            System.out.println();
        }
*/

/*        int hight = 3;
        int weight = 5;
        int left = 3;
        int right = 3;

        for (int i = 0; i < hight; i++) {
            for (int k = 0; k < weight; k++) {
                if (i>=k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            left = left - 1;

            System.out.println();
        }*/

        // int weight = 6;
        /*int high = 3;

        for (int i =0; i < high; i++) {

            for (int k = 1; k < high * 2; k++) {

                if (k == high - i || k == high +i || i==high -1) {
                    System.out.print("*");


                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


/*  * Работник зарабаывает N денег ежемясячно, от платит в пенсионный фонд 15% своей зп, пенсионный возраст Z лет.
                Его пенсионный фонд расчитан на столько лет выплат, сколько он работал. Какую пенсию он получит после выхода
        на пенсию в первый месяц, если работник начал вкладывать в свой пенсионный фонд на своё 25-тие, в год он
        получает 18% годовых к сумме которая уже лежит на счету и раз в 6 месяцев его зарплата выростала на 5%*/

       /* int salary = 1000;
        double pensFond = salary * 0.15;
        int year = 12;
        int pensVozrast = 65 * year;
        int startWorking = 25 * year;
        int doPensii=pensVozrast-startWorking;
        int monthQuantity = 0;
        double pensNachislenie = 0;

        for (; startWorking < pensVozrast; startWorking++) {

            while (startWorking < pensVozrast) {
                pensNachislenie = pensNachislenie + pensFond;
                monthQuantity++;
                if (monthQuantity == 6) {
                    pensFond = pensFond * 1.05;

                } else if (monthQuantity == 12) {
                    pensFond = pensFond * 1.18;
                    monthQuantity = monthQuantity * 0;
                } else {
                    break;
                }
            }

        }
        System.out.println("Получим в первом месяце на пенсии  " + pensNachislenie/doPensii);


*/
    }


}
