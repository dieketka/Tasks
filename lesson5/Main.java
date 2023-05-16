import java.util.Scanner;

public class Main {

    public static int  []a = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000}; //массив арабских цифр
    public static String []b = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; //массив римских цифр

    public static String arabic(int num){
        int i = 12;
        String result = "";
        while (num > 0) {
            while (a[i] > num){
                i--;
            }
            result += b[i];
            num -= a[i];  //
        }
        if ( num < 0) { //если число меньше или равно нулю
            System.out.println("Введите корректное число ");
        }
        return result;

    }

    public static void main(String[] args)
    {

        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = in.nextInt();
        String roman = arabic(number);
        System.out.println(roman);
        //вывод результата

    }
}
