package Lesson6;
import java.util.Arrays;
import java.util.Scanner;

public class TheSameNumbers {

   /*
    Найти в массиве самую длинную последовательность, состоящую из одинаковых элементов.
    Вывести на экран количество элементов самой длиной последовательности и номер элемента,
    который является ее началом.
    */

    public static void main(String[] args) {
        System.out.println("Введите последовательность повторяющихся чисел: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] array = str.toCharArray();
        int firstNumber = 0;
        int countNumbers = 1;
        int maxStarNumber = 0;
        int maxLength = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]){
                countNumbers++;
            }else {
                countNumbers = 1;
                firstNumber = i;
            }
            if (countNumbers > maxLength){
                maxLength = countNumbers;
                maxStarNumber = firstNumber;
            }
        }
        System.out.println("Самая длиная последовательность состоит из " + maxLength + " элементов");
        System.out.println("Повторяющийся элемент : " + array[maxStarNumber] + "");
    }
}
