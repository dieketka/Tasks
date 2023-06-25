
package Lesson11;

import java.util.ArrayList;
import java.util.LinkedList;


/*2) Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.*/
public class Time {

    public static void main(String[] args) {
        compare2Lists();
    }
    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();//создаем новый ArrayList
        LinkedList<Double> linkedList = new LinkedList<>(); //создаем новый LinkedList
        final int N = 1000000; //добавляем 1000000 элементов
        final int M = 400;//отложенное время?
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random()); //генерируется случайное число(макс значение переменная N)
            linkedList.add(Math.random()); //генерируется случайное число(макс значение переменная N)
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1))); //замер потраченного временив ArrayList
        }
        System.out.println(System.currentTimeMillis() - startTime); //вывод на экран

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1))); //замер потраченного временив LinkedList
        }
        System.out.println(System.currentTimeMillis() - startTime); //вывод на экран
    }
}
