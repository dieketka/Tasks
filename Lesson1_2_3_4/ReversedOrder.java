package Lesson1_2_3_4;

public class ReversedOrder {

    //4. Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.

    public static void main(String[] args)  {
        int[] reversedArray = {1, 3, 4, 7, 8};
        for(int i = reversedArray.length-1; i >= 0; i--) {
            System.out.print(reversedArray[i]);
        }
    }
}
