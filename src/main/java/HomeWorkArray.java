import java.sql.SQLOutput;

public class HomeWorkArray {
    public static void main(String[] args) {

           /*1. Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну
        строку, разделяя запятой.
        2. Дан массив размерности N,  найти наименьший элемент массива и вывести на консоль (если наименьших
        элементов несколько — вывести их все).
        3. В массиве из задания 2. найти наибольший элемент.
        4. Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.
        После замены будет выглядеть {4, 8, 0, 6, -5}.
        5. Найти среднее арифметическое всех элементов массива.*/


/*               int[] ArrayOdd = new int[10];
        int index = 0;

        for (int seq = 0; index < ArrayOdd.length; seq++) {
            if (seq % 2 != 0) {
                ArrayOdd[index] = seq;
                System.out.print(ArrayOdd[index] + ",");
                index++;
            }
        }
        }*/
/*
_________________________________________________________________________________________________________________________________________
*/
/*
        int[] ArrayMinValue = {1, 6, 9, -5,-6,-5,-5,-6};
        int minValue = ArrayMinValue[0];
        for (int index = 0; index < ArrayMinValue.length; index++) {
            if (ArrayMinValue[index] < minValue) {
                minValue = ArrayMinValue[index];

            }
        }
        System.out.println(minValue);

        int[] ArrayMaxValue = {1, 6,9,-5,-6,-5,-5,-6};
        int maxValue = ArrayMaxValue[0];
        for (int index = 0; index < ArrayMaxValue.length; index++) {
            if (ArrayMaxValue[index] > maxValue) {
                maxValue = ArrayMaxValue[index];

            }
        }
        System.out.println(maxValue);*/


        int[] ArrayMaxValue = {1, 2, 3};

        int sum = 0;
        for (int index = 0; index < ArrayMaxValue.length; index++) {
            sum = sum + ArrayMaxValue[index];


        }

        System.out.println(sum / ArrayMaxValue.length);


    }
}


