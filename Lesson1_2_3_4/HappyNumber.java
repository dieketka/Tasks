package Lesson1_2_3_4;

import java.util.Scanner;

public class HappyNumber {

    /*
    3.Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
     Определить, счастливое ли заданное число, вернуть true, если это так.
    */

    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int num = in.nextInt();

        int b = num / 100;
        int one = b / 10 % 10;
        int two = b % 10;
        int c = num % 100;
        int three = c / 10 % 10;
        int four = c % 10;

        if ((one + two) != ( three + four)) {
            System.out.println("Это число несчастливое");
        }
        if ((one + two) == ( three + four)) {
        System.out.println("Это число счастливое");
        }
    }
    }


