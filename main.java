
public class main {
    public static void main(String args[]) {
        int a = 8; //часов
        int b = 20; //минут
        int c = a * 3600;// переводим часы в секунды
        int d = b * 60;//переводим минуты в секунды
        System.out.println("Время в секундах с начала суток");
        System.out.println(c + d + 35);
    }

    public static void second(String args[]) {
        int a = 9; //часы отправления
        int b = 25; //минуты отправления
        int c = 13; // часы прибытия
        int d = 1; // минуты прибытия
        int e = 60; // количесто минут в 1 часе

        System.out.println((c * e + d) - (a * e + b)); //выводим ответ


    }
}
