package Lesson9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Goods {

    /*
         * Строка содержит названия товаров и цены на них в формате вида
         * "Хлеб 39.9; Молоко 62; Курица 184.0; Конфеты 89.9".
         * То есть, название товара отделено от цены пробелом,
         * а цена отделена от названия следующего товара точкой с запятой и пробелом.
         * Вернуть название самого дорогого товара в списке (в примере это Курица),
         * или пустую строку при нарушении формата строки.
         * Все цены должны быть больше нуля либо равны нулю.
         * В случае неверной строки выкинуть свое исключение.
 */

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String Goods1;
        String Goods2;
        String Goods3;
        System.out.println("Введите наименования товаров и цены");
        Goods1 = scanner.nextLine();
        Goods2 = scanner.nextLine();
        Goods3 = scanner.nextLine();
        System.out.println();

        String String1 = Goods1 + Goods2 + Goods3;

        String string1 = String1;
        String input = Arrays.toString(string1.toCharArray());
        double maxPrice = 0.0;
        Pattern pattern = Pattern.compile(String1);
        Matcher matcher = pattern.matcher(String1);
        String maxProduct = "";

        if (matcher.find()) {
            String[] lineText = String1.split(";");
            for (String l : lineText) {
                String[] textArray = l.trim().split(" ");
                if (Double.parseDouble(textArray[1]) > maxPrice) {
                    maxPrice = Double.parseDouble(textArray[1]);
                    maxProduct = textArray[0];
                }
            }
            System.out.println("Самый дорогой товар в вашем списке: " + maxProduct + ", цена:  " + maxPrice);
        } else {
            throw new Exception("Ошибка!");
        }
    }

}
