public class TemperatureConverter {
private double fahrenheit;

    public TemperatureConverter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public TemperatureConverter(){
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void toCelsius(){
        double result = (((double) 5 /9)*(fahrenheit-32));
        System.out.println(result);
    }
}
