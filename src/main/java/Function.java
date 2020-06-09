import java.sql.SQLOutput;

public class Function {
    public static void main(String[] args) {

        /*Синтаксис метода:
         * public static <тип возвращаемого значения> названиеМетода (параметры){
         * тело метода;
         * return <тип возвращаемого значения> название(результат выражения);
         * }
         *
         * - <тип возвращаемого значения> - тип переменной, которую вернёт метод.
         *
         * - названиеМетода - название метода, которое кратко описывает работу метода.
         *
         * - параметры - перечень значений через запятую с указанием конктреного типа каждого из значений, которые
         * последовательно будет принимать метод в качестве своих локальных переменных.
         *
         * - тело метода; - логика заложенная в метод
         *
         * - return <тип возвращаемого значения> название; - после оператора return указывается возвращаемое значение,
         * которое является результатом метода и заканчивает его работу. Это может быть литеральное значение, значение
         * переменной или какого-то сложного выражения. Конструкция "return <тип возвращаемого значения> название
         * (результат выражения)" не используется только в функциях с <тип возвращаемого значения> == void*/

        int sInt1 = 5;
        int sInt2 = 6;
        double sDouble = 12.2;
        int[] array = {1, 2, 3, 4, 5};

        printStr("sInt1" + sInt1);
        printArray(array);
        printStr("Sum =" + sum(sInt1, sInt2));
        numbPlusOne(sInt1);
        numbPlusOne(sDouble);

        printStr("sInt1" + sInt1);
        printStr("numbPlusOne " + numbPlusOne(sInt1));
        printStr("sInt1" + sInt1);
    }

    public static void printStr(String i) {
        System.out.println(i);
    }

    public static void printArray(int[] a) {
        for (int index = 0; index < a.length; index++) {
            System.out.print(" " + a[index]);
        }
        System.out.println();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double numbPlusOne(double a) {
        a++;
        return a;

    }

    public static int numbPlusOne (int i){
        return i++;
    }




}

