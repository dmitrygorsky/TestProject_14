package by.cdptr.javabasics.l4_2;

import java.util.Random;
import java.util.Scanner;

public class MassivKratnyyK {

    public static int enterNumber() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {

            System.out.println("Введено невалидное число! Попробуйте снова");
            scan.next();

        }

        return scan.nextInt();

    }

    public static int noZerosAllowed(int i) {

        while (i <= 0) {

            System.out.println("Число не может быть меньше нуля либо равно ему! Попробуйте снова");
            i = enterNumber();

        }

        return i;

    }

    public static int[] fillArrayWithRandomNumber(int x) {

        int[] arr = new int[x];

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(100);

        }

        return arr;

    }

    public static int summaKratnyh(int[] arr, int k) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % k == 0) {

                result += arr[i];

            }

        }

        return result;

    }

}

