import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова
        //new.
        System.out.println("Задача 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] fractions = {1.57, 7.654, 9.986};
        int[] apples = new int[2];
        apples[0] = 2;
        apples[1] = 3;

        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        System.out.println("Задача 2");
        System.out.println(arr[0] + " , " + arr[1] + " , " + arr[2]);
        System.out.println(fractions[0] + " , " + fractions[1] + " , " + fractions[2]);
        System.out.println(apples[0] + " , " + apples[1]);

        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        System.out.println("Задача 3");
        System.out.println(arr[2] + " , " + arr[1] + " , " + arr[0]);
        System.out.println(fractions[2] + " , " + fractions[1] + " , " + fractions[0]);
        System.out.println(apples[1] + " , " + apples[0]);

        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        System.out.println("Задача 4");
        arr[0] = 1 + 1;
        arr[2] = 3 + 1;
        System.out.println(Arrays.toString(arr));
    }
}