package Lesson14;

public class PhilosophersAreEating {

    /*
     Сделать задачу с философами, при условии, что за столом может сидеть только 1 философ,
     синхронизировать доступ к критической секции через synchronized
     (см описание задачи: https://metanit.com/java/tutorial/8.6.php)
    */

    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {

            Thread t = new Thread(new Philosopher());
            t.setName(String.valueOf(i));
            t.start();
        }
    }
    static class Philosopher extends Thread {
        public void run() {
            int num = 0;
            while (num < 4) {
                Dinner();
                num++;
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    System.out.println("у философа " + Thread.currentThread().getName() + " проблемы со здоровьем");
                }
            }
        }
        synchronized static public void Dinner() {

            try {
                System.out.println(Thread.currentThread().getName() + " садится за стол");
                Thread.sleep(600);

                System.out.println(Thread.currentThread().getName() + " выходит из-за стола");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " ошибка");
            }
        }
    }
}
