package com.company;

import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел для ввода");
        int NumbersOfElementsInArray = scan.nextInt();
        int[] arr = new int[NumbersOfElementsInArray];
        int flag = 0;
        int flag2 = 0;
        ArrayList<Integer> massiv = new ArrayList<>();
        ArrayList<Integer> massiv2 = new ArrayList<>();
        for (int i = 0; i <= NumbersOfElementsInArray - 1; i++) {

            System.out.println("Введите число");

            int Numbers = scan.nextInt();
            arr[i] = Numbers;
            String NumbersToString = Integer.toString(Numbers);
            int[] NumberOfDigitsinAnumber = new int[NumbersToString.length()];

            for (int j = 0; j < NumbersToString.length(); j++) {
                int irden = Numbers % 10;
                Numbers = Numbers / 10;
                NumberOfDigitsinAnumber[j] = irden;
            }

            for (int j = 0; j < NumberOfDigitsinAnumber.length; j++) {

                if ((NumberOfDigitsinAnumber[j] % 2) == 0) {
                    flag++;
                }
                if ((NumberOfDigitsinAnumber[j] % 2) != 0) {
                    flag2++;
                }

            }
            if (flag == NumberOfDigitsinAnumber.length) {

                massiv.add(arr[i]);
            }
            if (flag == flag2) {

                massiv2.add(arr[i]);
            }
            flag = 0;
            flag2 = 0;
        }
        System.out.println("Числа только с четными цифрами");

        for (int i = 0; i <= massiv.size() - 1; i++) {

            System.out.println(massiv.get(i));
        }

        System.out.println("Конец");
        System.out.println("Числа, где равное количество четных и нечетных цифр");

        for (int i = 0; i <= massiv2.size() - 1; i++) {

            System.out.println(massiv2.get(i));
        }

        System.out.println("Конец");
    }


}
