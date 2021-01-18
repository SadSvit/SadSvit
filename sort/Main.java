package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел для ввода");
        int NumbersOfElementsInArray = scan.nextInt();
        int[] arr = new int[NumbersOfElementsInArray];
        int count=0;
        for (int i = 0; i <= NumbersOfElementsInArray-1; i++) {
            System.out.println("Введите число");
            int number = scan.nextInt();
            arr[i] = number;
        }

        while(NumbersOfElementsInArray>=count){
            count++;
            for(int i =0;i<=NumbersOfElementsInArray-2;i++){
                int number=arr[i+1];
                if(arr[i]<arr[i+1]){
                    arr[i+1]=arr[i];
                    arr[i]=number;
                }
            }
        }

        for(int i =0;i<=NumbersOfElementsInArray-1;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
}
