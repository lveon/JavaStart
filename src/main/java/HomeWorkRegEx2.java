import java.util.Arrays;

public class HomeWorkRegEx2 {
    public static void main(String[] args) {

        double d = 15.88;
        int int1 = 0;
        int int2 = 4;
        int int3 = 5;
        int int4 = 15;

        System.out.println(Arrays.toString(resultDivision(d, int1, int2, int3, int4)));


    }


    public static int[] resultDivision(double doubleVar, int... intVariable) {

        int[] arrayResult = new int[intVariable.length];

        for (int i = 0; i < intVariable.length; i++) {
            if (intVariable[i] ==0 ){
                System.out.println();
            }
            int division = (int) (doubleVar / intVariable[i]);

            arrayResult[i] = division;
        }
        return arrayResult;
    }

}
