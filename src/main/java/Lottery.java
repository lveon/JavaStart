import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Вы учавствуете в лотерее!!!");
        System.out.println("Введите 8 целых чисел в диапазоне от 0 до 100:");


        int[] arrayNumbers = new int[8];
        for (int index = 0; index < arrayNumbers.length; index++) {
            if (!sc.hasNextInt()) {
                System.out.println("Вы допустили ошибку при вводе чисел");
                sc.nextLine();

            } else {
                arrayNumbers[index] = sc.nextInt();
            }
        /*    if (arrayNumbers[index] < 0 || arrayNumbers[index] > 100) {
                System.out.println("Вы допустили ошибку при вводе чисел");
                sc.next();
            }*/


        }
        System.out.println("Ваша комбинация:");
        for (int vivodArray : arrayNumbers) {
            System.out.print(vivodArray + " ");
        }
        System.out.println();

        int[] arrayLottery = new int[8];
        for (int index = 0; index < arrayLottery.length; index++) {
            int numbersLottery = (int) (Math.random() * 101);
            for (int check = 0; check < index; check++) {
                while (arrayLottery[index] == numbersLottery) {
                    numbersLottery = (int) (Math.random() * 101);
                }
            }
        }
           /* arrayLottery[index] = numbersLottery;
            System.out.print("Выигрышные числа");
            System.out.println(" " + arrayLottery[index]);*/


        int matchNumber = 0;
        int matchBingo2 = 0;


        for (int i = 0; i < 8; i++) {
            for (int y = 0; y < 8; y++) {

                if (arrayNumbers[i] == arrayLottery[y]) {

                    int tempi = i;
                    int temoy = y;
                    for (; tempi < 8 && temoy < 8 && arrayNumbers[tempi] == arrayLottery[temoy]; tempi++, temoy++) {
                        matchBingo2++;
                    }
                } else if (matchBingo2 < 3) {
                    matchBingo2 = 0;

                } else {
                    break;
                }

            }
            if (matchBingo2 > 3) {
                break;
            }
        }
        for (int i = 0; i < arrayLottery.length; i++) {
            for (int y = 0; y < arrayNumbers.length; y++) {
                if (arrayLottery[y] == arrayNumbers[i]) {
                    matchNumber++;


                }
            }
        }


        if (matchBingo2 == 8) {
            System.out.println("Вы выйграли 1 000 000$");
        } else if (matchBingo2 >= 3) {
            System.out.println("Вы выйграли 500$");

        } else if (matchNumber >= 3 && matchNumber < 8) {
            System.out.println("Вы выйграли 200$");
        } else if (matchNumber == 8) {
            System.out.println("Вы выйграли 500 000$");
        } else {
            System.out.println("Нет выигрышных комбинаций, не пробуйте больше");
        }

    }

}

