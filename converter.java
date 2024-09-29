abstract class Converter {
    abstract void convert(double value);
}

class CurrencyConverter extends Converter {
    @Override
    void convert(double value) {
        // Implement your conversion logic here
        // For example, to convert dollars to INR:
        double inrValue = value * 82.5; // Assuming the current exchange rate
        System.out.println("INR: " + inrValue);
    }
}

class DistanceConverter extends Converter {
    @Override
    void convert(double value) {
        // Implement your conversion logic here
        // For example, to convert meters to kilometers:
        double kmValue = value / 1000;
        System.out.println("Kilometers: " + kmValue);
    }
}

class TimeConverter extends Converter {
    @Override
    void convert(double value) {
        // Implement your conversion logic here
        // For example, to convert hours to minutes:
        int minutes = (int) (value * 60);
        System.out.println("Minutes: " + minutes);
    }
}

public class ConverterApp {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        DistanceConverter distanceConverter = new DistanceConverter();
        TimeConverter timeConverter = new TimeConverter();

        currencyConverter.convert(100); // Convert 100 dollars to INR
        distanceConverter.convert(2000); // Convert 2000 meters to kilometers
        timeConverter.convert(3.5); // Convert 3.5 hours to minutes
    }
}
