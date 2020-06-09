

public class BasicLibrary {
    public static void main(String[] args) {

        Math.random();
        System.out.println(Math.random());

        /*Схема диапазона: [a;b). То есть нижняя граница а, верхняя b. Тогда для генерации вещественных чисел в заданном
        диапазоне нужно записать следующее:
        ( Math.random() * (b-a) ) + a
        Где (b-a) - размер диапазона
        + a - смещение от 0;
        */

        double sDouble;
        for (int i = 0; i < 5; i++) {
            sDouble = Math.random() * 60 - 20;
            System.out.println(sDouble);
        }
    }
}