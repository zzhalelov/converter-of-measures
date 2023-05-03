public class Main {
    public static void main(String[] args) {
        TemperatureConverter t1 = new TemperatureConverter();
        t1.setFahrenheit(100);
        t1.toCelsius();

        t1.setCelsius(0);
        t1.toFahrenheit();
    }
}