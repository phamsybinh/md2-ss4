import java.util.Scanner;

public class fahrenheitToCelsius {
    public static double celsiusToFahrenheit(double celsius){
        System.out.println("Fahrenheit is " + (celsius*9/5.0+32));
        return celsius*9/5.0+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        System.out.println("Celsius is " + (5.0/9*(fahrenheit-32)));
        return 5.0/9*(fahrenheit-32);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature conversion");
        do {
            System.out.println("=====MENU=====" +
                    "\n1. Fahrenheit to Celsius\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "0. Exit");
            System.out.println("Enter your chose");
            int chose = sc.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Enter Fahrenheit's value ");
                    double celsius = sc.nextDouble();
                    fahrenheitToCelsius(celsius);
                    break;
                case 2:
                    System.out.println("Enter Celsius's value ");
                    double fahrenheit = sc.nextDouble();
                    celsiusToFahrenheit(fahrenheit);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input value is wrong");
            }
        } while (true);

    }
}
