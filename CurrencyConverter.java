import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasa de cambio (puedes actualizar estas tasas según las más recientes)
        double usdToEur = 0.92;
        double usdToCop = 4000.0;
        double eurToUsd = 1.09;
        double eurToCop = 4350.0;
        double copToUsd = 0.00025;
        double copToEur = 0.00023;

        System.out.println("Bienvenido al Conversor de Monedas");
        System.out.println("Opciones disponibles:");
        System.out.println("1. USD a EUR");
        System.out.println("2. USD a COP");
        System.out.println("3. EUR a USD");
        System.out.println("4. EUR a COP");
        System.out.println("5. COP a USD");
        System.out.println("6. COP a EUR");
        System.out.print("Elige una opción (1-6): ");
        int option = scanner.nextInt();

        System.out.print("Ingresa la cantidad a convertir: ");
        double amount = scanner.nextDouble();
        double result = 0;

        switch (option) {
            case 1:
                result = amount * usdToEur;
                System.out.printf("%.2f USD son %.2f EUR%n", amount, result);
                break;
            case 2:
                result = amount * usdToCop;
                System.out.printf("%.2f USD son %.2f COP%n", amount, result);
                break;
            case 3:
                result = amount * eurToUsd;
                System.out.printf("%.2f EUR son %.2f USD%n", amount, result);
                break;
            case 4:
                result = amount * eurToCop;
                System.out.printf("%.2f EUR son %.2f COP%n", amount, result);
                break;
            case 5:
                result = amount * copToUsd;
                System.out.printf("%.2f COP son %.2f USD%n", amount, result);
                break;
            case 6:
                result = amount * copToEur;
                System.out.printf("%.2f COP son %.2f EUR%n", amount, result);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
