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
        int[] NumberOfUniqueDigitsInnumber = new int[NumbersOfElementsInArray];
        int flag = 0;
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

            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k < NumberOfDigitsinAnumber.length; k++) {
                    if (j == NumberOfDigitsinAnumber[k]) {
                        flag++;
                        break;
                    }

                }

            }
            NumberOfUniqueDigitsInnumber[i] = flag;
            flag = 0;
        }
        int min = NumberOfUniqueDigitsInnumber[0];
        for (int i = 0; i < NumberOfUniqueDigitsInnumber.length; i++) {
            if (min > NumberOfUniqueDigitsInnumber[i]) {
                min = NumberOfUniqueDigitsInnumber[i];
            }
        }

        for(int i = 0; i < NumberOfUniqueDigitsInnumber.length; i++){
            if(min==NumberOfUniqueDigitsInnumber[i]){
                System.out.println(arr[i]);
                break;
            }
        }
    }


}
