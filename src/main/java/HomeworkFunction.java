public class HomeworkFunction {


    public static void main(String[] args) {
        System.out.println(oddOrEven(7));

        int result = whoIsBigger(66, 33);
        System.out.println("Bigger is " + result);

        System.out.println(sumOfNumber(8, 9));
        sumOfNumber2(7, 4);
        triangle(10);
        pensiya(100, 64, 25);
        oddOrEven2(8);
        tenOddNumbers();

        int[] arrayValue = {5, 3, 7, 9, 9, 4};

        arrayAverage(arrayValue);
        arrayMaxValue(arrayValue);
        arrayMinValue(arrayValue);

    }


    public static int whoIsBigger(int c, int d) {
        int result;
        if (c > d) {
            result = c;
        } else {
            result = d;
        }
        return result;
    }
    // _________________________________________________________________________________________________________________


       /* Задача 2

        Есть число a, необходимо опеределить четное ли число и сообщить об этом*/


    public static boolean oddOrEven(int int1) {
        int a = 0;
        byte b = 2;
        int result1;

        result1 = a % b;
        if (result1 == 0) {
            return true;
        } else {
            return false;

        }
    }

    public static void oddOrEven2(int enterNumber) {
        ;
        byte b = 2;
        long c;

        c = enterNumber % b;
        if (c == 0) {
            System.out.println("Вы ввели четное число");
        } else
            System.out.println("Вы ввели нечетное число");
    }
    /*___________________________________________________________________________________________________________*/

    // Задача 4
    //Есть числа а и b. Если сумма чисел больше или равна 15 то одно сообщение, если меньше другое, но если их разница
    //отрицательная сообщить именно об этом


    public static String sumOfNumber(int i, int y) {


        if (i + y >= 15) {
            return "Cумма чисел больше или равна 15 ";

        } else if (i + y < 15 && i + y >= 0) {
            return "Сумма меньше 15 ";

        } else {
            return "Сообщаю, что разница отрицательная (с) Ваш кэп";

        }
    }

    public static void sumOfNumber2(int i, int y) {


        if (i + y >= 15) {
            System.out.println("Cумма чисел больше или равна 15 ");
            ;

        } else if (i + y < 15 && i + y >= 0) {
            System.out.println("Сумма меньше 15 ");
            ;

        } else {
            System.out.println("Сообщаю, что разница отрицательная (с) Ваш кэп");
        }

    }


    public static void triangle(int high) {

        for (
                int i = 0;
                i < high; i++) {

            for (int k = 1; k < high * 2; k++) {

                if (k == high - i || k == high + i || i == high - 1) {
                    System.out.print("*");


                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*  * Работник зарабаывает N денег ежемясячно, от платит в пенсионный фонд 15% своей зп, пенсионный возраст Z лет.
                Его пенсионный фонд расчитан на столько лет выплат, сколько он работал. Какую пенсию он получит после выхода
        на пенсию в первый месяц, если работник начал вкладывать в свой пенсионный фонд на своё 25-тие, в год он
        получает 18% годовых к сумме которая уже лежит на счету и раз в 6 месяцев его зарплата выростала на 5%*/


    public static void pensiya(int salary, int pensVozrast, int startWorking) {
        salary = 1000;
        double pensFond = salary * 0.15;
        int year = 12;
        pensVozrast = 65 * year;
        startWorking = 25 * year;
        int doPensii = pensVozrast - startWorking;
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
        System.out.println("Получим в первом месяце на пенсии  " + pensNachislenie / doPensii);


    }


    public static void tenOddNumbers() {
        int[] arrayOdd = new int[10];
        int index = 0;

        for (int seq = 0; index < arrayOdd.length; seq++) {
            if (seq % 2 != 0) {
                arrayOdd[index] = seq;
                System.out.print(arrayOdd[index] + ",");
                index++;
            }
        }
        System.out.println();
    }

    public static void arrayAverage(int[] arrayValue) {
        //  arrayValue = new int[5];

        int sum = 0;
        for (int index = 0; index < arrayValue.length; index++) {
            sum = sum + arrayValue[index];


        }
        System.out.println("Average array number = " + sum / arrayValue.length);
    }


    public static void arrayMaxValue(int[] arrayMaxValue) {
        int maxValue = arrayMaxValue[0];
        for (int index = 0; index < arrayMaxValue.length; index++) {
            if (arrayMaxValue[index] > maxValue) {
                maxValue = arrayMaxValue[index];

            }
        }
        System.out.println("Maximal array number = " + maxValue);
    }

    public static void arrayMinValue(int[] arrayMinValue) {
        int minValue = arrayMinValue[0];
        for (int index = 0; index < arrayMinValue.length; index++) {
            if (arrayMinValue[index] < minValue) {
                minValue = arrayMinValue[index];

            }
        }
        System.out.println("Minimal array number = " + minValue);
    }
}

