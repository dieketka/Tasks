import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        // Получить строковую нотацию для оценки по пятибалльной системе
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
        if (num > 5) {
            System.out.print("Несуществующая оценка");

        }
    }
}
/*
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5};
        for (int i : array){
            System.out.println(i);

        }
    }
}

    public static void main(String[] args) {
        int[] myArray = {3, 124, 46, 18, 57, 197, 46, 0, 0, -63, 69};
        int[] sortedArray = bubbleSort(myArray);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }
        public static int[] bubbleSort(int[] sortArr) {
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < sortArr.length - 1; i++) {
                    if (sortArr[i] > sortArr[i + 1]) {
                        temp = sortArr[i];
                        sortArr[i] = sortArr[i + 1];
                        sortArr[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
            return sortArr;
        }
}

    public static int[] main(int[] sortArr) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < sortArr.length - 1; i++) {
                if (sortArr[i] > sortArr[i + 1]) {
                    temp = sortArr[i];
                    sortArr[i] = sortArr[i + 1];
                    sortArr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return sortArr;

    }
}
    /*
    public static void main(String args[]) {
        int[] arr = {10, 7, 48, 4, 7, 4, 11};

// Предположим, что нулевой элемент максимальный
        int max = arr[0];

// В цикле начинаем с первой ячейки
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max); // => 11
    }
}

    public static void main(String args[]) {
        int nums[] = new int[6];
        for (int i =0; i < nums.length; i++) {
            nums[i] = i * 10;
            System.out.println("Init:" + nums[i]);
        }
        for (int i = nums.length-1; i>0; i--) {
        System.out.println("reversed:" +nums[i]);
        }
        }
         public static void one(String args[]){
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
            public static void two(String args[]){
         int num = 12353874, reversed = 0;

        while (num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;

        }

        System.out.println("Reversed Number: " + reversed);
    }
    public static void three(String args[]){
        int a = 8; //часов
        int b = 20; //минут
        int c = a * 3600;// переводим часы в секунды
        int d = b * 60;//переводим минуты в секунды
        System.out.println("Время в секундах с начала суток");
        System.out.println(c + d + 35);
    }
    public static void four(String args[]) {
        int a = 9; //часы отправления
        int b = 25; //минуты отправления
        int c = 13; // часы прибытия
        int d = 1; // минуты прибытия
        int e = 60; // количесто минут в 1 часе

        System.out.println((c * e + d) - (a * e + b)); //выводим ответ */



