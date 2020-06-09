import java.util.Scanner;

public class CheckHome {
    public static void main(String[] args) {
        int lengh = 8;
        int[] userArray = {-1,-1,-1,-1,-1,-1,-1,-1};
        int[] victoryArray = {1, 2, 3, 4, 5, 6, 7, 8};

        //writeRandomNumbersToArray(victoryArray);

        printInfoMessage();

        createUserArray(userArray);

        System.out.println("Победная комбинация: ");
        printArray(victoryArray);

        System.out.println("\nВаша комбинация: ");
        printArray(userArray);

        int victoryNumbers = matchingNumbers(userArray, victoryArray);
        int victorySequence = sequenceLength(userArray, victoryArray);

        if(victorySequence == lengh){
            System.out.println("\nВаша награда: 1 000 000!");
        }else if(victoryNumbers == lengh){
            System.out.println("\nВаша награда: 500 000!");
        }else if(victorySequence == 3){
            System.out.println("\nВаша награда: 500!");
        }else if(victoryNumbers == 3){
            System.out.println("\nВаша награда: 200!");
        }else{
            System.out.println("\nВы проиграли =( Но всегда можно купить еще один билетик и попробовать снова!");
        }
    }

    public static int sequenceLength(int[] userArray, int[] victoryArray) {
        int victory = 0;
        int lengh = userArray.length;
        for (int victoryIndex = 0; victoryIndex < lengh; victoryIndex++) {
            for (int userIndex = 0; userIndex < lengh; userIndex++) {
                if (victoryArray[victoryIndex] == userArray[userIndex]) {
                    int tempVictoryIndex = victoryIndex;
                    int tempUserIndex = userIndex;
                    while (tempVictoryIndex < lengh && tempUserIndex < lengh && victoryArray[tempVictoryIndex] == userArray[tempUserIndex]) {
                        victory++;
                        tempVictoryIndex++;
                        tempUserIndex++;
                        if (victory > 2 && tempVictoryIndex != tempUserIndex || victory == lengh) {
                            return victory;
                        }
                    }
                }
            }
        }
        return victory;
    }

    public static int matchingNumbers(int[] userArray, int[] victoryArray) {
        int victoryPoint = 0;
        for (int userIndex = 0; userIndex < userArray.length; userIndex++) {
            for (int victoryIndex = 0; victoryIndex < victoryArray.length; victoryIndex++) {
                if (userArray[userIndex] == victoryArray[victoryIndex]) {
                    victoryPoint++;
                }
            }
        }
        return victoryPoint;
    }

    public static int[] writeRandomNumbersToArray(int[] array) {
        int index = 0;
        while (index < array.length) {
            int number = (int) (Math.random() * 100);
            if (isNotExistSameNumber(number, index, array)) {
                array[index] = number;
                index++;
            }
        }
        return array;
    }

    public static int nextNumber() {
        Scanner sc = new Scanner(System.in);
        int number = -1;
        while (number == -1) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (!(number >= 0 && number <= 100)) {
                    printErrorMessage(number);
                    number = -1;
                }
            } else {
                printErrorMessage(sc.next());
            }
        }
        return number;
    }

    public static boolean isNotExistSameNumber(int number, int index, int[] array) {
        for (int tempIndex = 0; tempIndex <= index; tempIndex++) {
            if (array[tempIndex] == number) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] array){
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index] + "  ");
        }
    }

    public static void printErrorMessage(int value) {
        System.out.println("Число должно быть уникальным  и в диапазоне от 0 до 100. Не правильное число: " + value);
    }

    public static void printErrorMessage(String value) {
        System.out.println("Не правильное значение. Это не число: " + value);
    }

    public static void printSuccessMessage(int value) {
        System.out.println("Отлично! Вы ввели: " + value);
    }

    public static void printInfoMessage(){
        System.out.println("Для участия в лотерее необходимо ввести 8 целых чисел от 0 до 100. \n" +
                "Если совпадет больше трех, но меньше восьми чисел с числами в выигрышной комбинации, награда - 200 долларов, \n" +
                "если совпадет последовательность чисел больше трех но меньше восьми - награда 500 долларов, \n" +
                "если совпадут все числа но без последовательности - награда 500 000,\n" +
                "если совпадут все числа и вся последовательность - награда миллион.");
    }

    public static int[] createUserArray(int[] array) {
        int index = 0;
        while (index < array.length) {
            System.out.print("Пожалуйста, введите следующее число: ");
            int number = nextNumber();
            if (isNotExistSameNumber(number, index, array)) {
                printSuccessMessage(array[index] = number);
                index++;
            } else {
                printErrorMessage(number);
            }
        }
        return array;
    }

}
