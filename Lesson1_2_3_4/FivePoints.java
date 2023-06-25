package Lesson1_2_3_4;

import java.util.Scanner;

public class FivePoints {

    //1. Получить строковую нотацию для оценки по пятибалльной системе

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int num = in.nextInt();

        if (num == 5) {
            System.out.print("Отлично");
        }
        if (num == 4) {
            System.out.print("Хорошо");
        }
        if (num == 3) {
            System.out.print("Удовлетворительно");
        }
        if (num == 2) {
            System.out.print("Неудовлетворительно");
        }
        if (num == 1) {
            System.out.print("Это провал)");
        }
        if (num > 5) {
            System.out.print("Несуществующая оценка");
        }
    }
}

