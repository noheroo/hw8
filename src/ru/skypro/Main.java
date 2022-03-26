package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Задача 1");
        years(1990);

        System.out.println("Задача 2");
        chooseApp(1, 2022);

        System.out.println("Задача 3");
        int deliveryDays = delivery(105);
        System.out.println("Дней на доставку " + deliveryDays);

        System.out.println("Задача 4");
        String s = "aabccddefgghiijjkk";
        doubles(s);

        System.out.println("Задача 5");
        int[] array = {3, 2, 1, 6, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Задача 6"); //надеюсь я правильно понял условия задачи в плане декомпозиции
        int[] array1 = generateRandomArray();
        meanOfMonth(array1);
    }


    public static void years(int year) {
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным\n");
        } else {
            System.out.println(year + " год не является високосным\n");
        }
    }

    public static void chooseApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке...\n");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке...\n");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке...\n");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке...\n");
            }
        }
    }

    public static int delivery(int distance) {
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        if (distance > 100) {
            days++;
        }
        return days;
    }


    public static void reverseArray (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int buffer = arr[start];
            arr[start++] = arr[end];
            arr[end--] = buffer;
        }
    }

    public static void doubles(String s1) {
        char[] arr = s1.toCharArray();
        for (int i = 0; i < arr.length - 1 ; i++) {
            if (arr[i] == arr[i + 1]) {
                char symbol = s1.charAt(i);
                System.out.println("Дубль есть, это символ " + symbol);
                return;
            }
        }
        System.out.println("Дублей нет");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int summaryOfMonth (int[] arr1){
        int summary = 0;
        for (int i : arr1) {
            summary += i;
        }
        return summary;
    }

    public static int arrayLength (int[] arr2){
        return arr2.length;
    }

    public static void meanOfMonth(int[] array1) {
        int days = arrayLength(array1);
        int sum = summaryOfMonth(array1);
        float mean = (float)sum/days;
        System.out.println("Средняя сумма трат за месяц "+mean+" рублей");
    }
}



