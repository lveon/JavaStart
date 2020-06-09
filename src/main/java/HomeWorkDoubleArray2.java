public class HomeWorkDoubleArray2 {
    public static void main(String[] args) {

        maxValueInString(irregulArray(5));
    }


    public static int[][] irregulArray(int size) {    // создание неровной матрицы
        int[][] array = new int[size][];

        int index = 0;
        for (; index < size; index++) {

            array[index] = new int[index + 1];


        }
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                int value = (int) (Math.random() * 10);
                array[i][x] = value;
                System.out.print(array[i][x] + " ");
            }
            System.out.println();
        }
        return array;
    }


    public static void maxValueInString(int[][] ints) {      //метод для выобрки из матрицы наимбольших значений из каждой строки +
                                                                 // копирование этих max значений в масси


        int maxStringValue[] = new int[ints.length];

        for (int i = 0; i < ints.length; i++) {
            int max = ints[0][0];
            for (int x = 0; x < ints[i].length; x++) {


                if (max <= ints[i][x]) {
                    max = ints[i][x];

                  //  System.out.println(max);
                    maxStringValue[i] = max;

                }
            }

        }
        System.out.println();
        for (int perebor : maxStringValue)
            System.out.println(perebor);


        System.out.println();

        int minValue = maxStringValue[0];                          // цикл для нахождения минимального значения из массива
        for (int i = 0; i < maxStringValue.length; i++) {
            if (maxStringValue[i] < minValue) {
                minValue = maxStringValue[i];


            }
        }
        System.out.println("Наименьшее число из наибольших чисел в строке = " + minValue);
    }
}

