import species.*;

public class Main {
    public static void main(String[] args) {

        Maple myMaple = new Maple("Green", "Samaras", 2023, 1880, 2.8);
        //плод клена на англ - samaras
        Oak myOak = new Oak("Dark-Green", "Acorn", 2023, 1905, 1.9);
        System.out.println(myMaple);
        System.out.println(myOak);

    }
}