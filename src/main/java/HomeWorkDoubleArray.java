public class HomeWorkDoubleArray {

    public static void main(String[] args) {


       // summDiagonali(createArray(4));

        createArray(1);

    }

    public static double[][] createArray(int size) {
        double[][] array = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int x = 0; x < size; x++) {
                double  value =  (Math.random() * 10);
               array[i][x] =value;

                System.out.print(value + " ");
            }
            System.out.println();
        }
        return array;
    }


    public static void summDiagonali(double[][] array) {
        int x = array.length;
        int j = array.length - 1;

        double diagonal = 0;
        for (int i = 0; i < x; i++) {
            diagonal += array[i][i];
        }
            System.out.printf("Сумма 1ой диагонали: %.2f\n" , diagonal);
        double diagonal2=0;

       for (int i=0;i<x;i++){
            diagonal2+=array[i][j];
            j--;
        }
        System.out.printf("Сумма 2ой диагонали:  %.2f\n" , diagonal2);

    }
}

