import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TemperatureConverter t1 = new TemperatureConverter();
        System.out.println("Введите:");
        System.out.println("1 - если хотите перевести из градусов Фаренгейт в градусы Цельсия");
        System.out.println("2 - если хотите перевести из градусов Цельсия в градусы Фаренгейт");
        String s = scan.nextLine();
        if (s.equals("1")) {
            System.out.println("Введите значение в градусах Фаренгейта");
            double f1 = scan.nextDouble();
            t1.setFahrenheit(f1);
            t1.toCelsius();
        } else if (s.equals("2")) {
            System.out.println("Введите значение в градусах Цельсия");
            double c1 = scan.nextDouble();
            t1.setCelsius(c1);
            t1.toFahrenheit();
        } else {
            System.out.println("ERROR");
        }
    }
}