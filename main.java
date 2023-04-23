
public class main{
    public static void main(String args[]){
        int a = 8; //часов
        int b = 20; //минут
        int c = a * 3600;// переводим часы в секунды
        int d = b * 60;//переводим минуты в секунды
        System.out.println("Время в секундах с начала суток");
        System.out.println(c+d+35);
    }
    }