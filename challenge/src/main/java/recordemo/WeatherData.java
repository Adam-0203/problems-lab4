package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*(9.0/5) +32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f°C (%.1f°F) and %s", temperatureCelsius, temperatureFahrenheit(),conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        return new WeatherData(5./9*(tempFahrenheit-32),conditions);
    }

    public static void main(String[] args) {
        WeatherData waether1 = new WeatherData(12, "Rainy");
        System.err.println(waether1.getSummary());

        WeatherData waether2 = fromFahrenheit(53.6, "Cloudy");
        System.err.println(waether2.getSummary());
    }
}