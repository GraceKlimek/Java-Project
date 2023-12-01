import java.util.InputMismatchException;
import java.util.Scanner;

class TemperatureConversion {
  public static double CelsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32; // Formula for Celsius to Fahrenheit
  }

  public static double FahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9; // Formula for Fahrenheit to Celsius
  }
}

class Main {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Welcome! Please enter the temperature in C or F: ");

      double userTemperatureInput = 0;
      char scale = ' '; // Initializing the scale variable to a blank space

      try {
        userTemperatureInput = input.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a numeric value.");
        return;
      }

      System.out.println("Enter C for Celsius or F for Fahrenheit: ");
      scale = Character.toUpperCase(input.next().charAt(0));
      // Converting the user's input to uppercase to prevent errors

      if (scale == 'C') {
        double result = TemperatureConversion.CelsiusToFahrenheit(userTemperatureInput);
        System.out.println("The temperature in Fahrenheit is " + result);

      } else if (scale == 'F') {
        double result = TemperatureConversion.FahrenheitToCelsius(userTemperatureInput);
        System.out.println("The temperature in Celsius is " + result);

      } else {
        System.out.println("Invalid scale. Please enter C or F.");
      }
    } catch (Exception e) { // Catching any exceptions that may occur
      e.printStackTrace();
    }
  }
}