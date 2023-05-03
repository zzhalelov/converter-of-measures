public class TemperatureConverter {
    private double fahrenheit;
    private double celsius;

    public TemperatureConverter(double fahrenheit, double celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public TemperatureConverter() {
    }

    public void toCelsius() {
        double result = (((double) 5 / 9) * (fahrenheit - 32));
        System.out.println(result + " градусов по Цельсию");
    }

    public void toFahrenheit() {
        double result = (((double) 9 / 5) * celsius) + 32;
        System.out.println(result + " градусов по Цельсию");
    }
}