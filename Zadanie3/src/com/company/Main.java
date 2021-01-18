package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел для ввода");
        int NumbersOfElementsInArray = scan.nextInt();
        int[] arr = new int[NumbersOfElementsInArray];
        int CountOfLengthNumbers = 0;
        int MiddleLength = 0;

        for (int i = 0; i <= NumbersOfElementsInArray - 1; i++) {
            System.out.println("Введите число");
            int number = scan.nextInt();
            String NumberToString = Integer.toString(number);
            int NumberLength = NumberToString.length();
            CountOfLengthNumbers= CountOfLengthNumbers + NumberLength;
            arr[i]=number;
        }
        MiddleLength = CountOfLengthNumbers / NumbersOfElementsInArray;
        System.out.println( "Средняя длинна чисел-"+MiddleLength );
        for (int i = 0; i <= NumbersOfElementsInArray - 1; i++) {

            String NumberToString = Integer.toString(arr[i]);
            int NumberLength = NumberToString.length();
if(NumberLength>=MiddleLength){
    System.out.print(arr[i]+" ");
        }
    }


}
}