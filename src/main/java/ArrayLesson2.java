
public class ArrayLesson2 {
    public static void main(String[] args) {

/*
       *//* int[] arr = new int[5];
        int num = 5;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
            num++;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int index : arr) {
            index = num;
            num++;
            System.out.print(index + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*//*


        int array[][] = new int[3][];
        array[0] = new int[1];
        array[1] = new int[3];
        array[2] = new int[5];
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                System.out.print(array[i][x] + " ");
            }
            System.out.println();
        }
        int size =3;
        int num=4;
        int arr1 [][] = new int [size][size];
        for ( int i=0; i<size;i++){
            for (int x=0; x< size  ;x++){
                arr1[i][x] =num;
                System.out.print(arr1[i][x] + " ");

            }
            System.out.println();
        }
int arr2 [][] = new int [size][size];
        for(int value[] : arr2){
            for(int value2 : value){
                value2 = num;
                System.out.print(value2 + " ");
            }
            System.out.println();
        }*/

        double sD1 = 10000.00/3;
        double sD2 = -1000.00/3;
        
    }

}


