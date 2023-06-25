package Lesson1_2_3_4;

import java.util.Scanner;

public class Train {

    /*
     *Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
      прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
      Определите время поезда в пути в минутах (в данном случае 216).
     */
    // Вариант 1 со сканером

    public static void main(String[] args)  {
        int h1;
        int m1;
        int h2;
        int m2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите час отправления");
        h1 = in.nextInt();
        System.out.println("Введите минуты отправления");
        m1 = in.nextInt();
        System.out.println("Введите час прибытия");
        h2 = in.nextInt();
        System.out.println("Введите минуты прибытия");
        m2 = in.nextInt();
        double result;
        double result1;
        result = ((h2 * 60 + m2) - (h1 * 60 + m1));
        result1 = (((h2 + 24) * 60 + m2) - (h1 * 60 + m1));
        if (h2 > h1) {
            System.out.println("Время в пути составит = " + result);
        } else {
            System.out.println("Время в пути со сменой даты составит = " + result1);
        }
    }

    //Вариант 2 с уже существубщими данными
   public class Train2 {

    public static void main(String[] args)  {

    int a = 9; //часы отправления
    int b = 25; //минуты отправления
    int c = 13; // часы прибытия
    int d = 1; // минуты прибытия
    int e = 60; // количесто минут в 1 часе

     System.out.println((c * e + d) - (a * e + b)); //выводим ответ
         }
    }
}
