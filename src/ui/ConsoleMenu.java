package ui;

import model.CurrencyConversion;
import service.CurrencyConverterService;

import java.io.PrintStream;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
    private final CurrencyConverterService converterService;
    private List<CurrencyConversion> conversionHistory = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleMenu(CurrencyConverterService converterService) {
        this.converterService = converterService;
    }

    public void start(){
        int option;
        do {
            displayMainMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> performConversion();
                case 2 -> displayHistory();
                case 3 -> System.out.println("Thank you for using the currency converter!");
                default -> System.out.println("Invalid option. Please choose again.");

            }
        } while (option != 3);
    }

    private void displayMainMenu(){
        System.out.println("1) Converter currency");
        System.out.println("2) View conversion history");
        System.out.println("3) Exit");

    }

    private void performConversion(){
        System.out.println("Enter base currency: ");
        String baseCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Enter target currency: ");
        String targetCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        CurrencyConversion conversion = converterService.convertCurrency(baseCurrency, targetCurrency, amount);
        conversionHistory.add(conversion);
        System.out.printf("%f %s = %f %s%n", amount, baseCurrency, conversion.getConvertedAmount(),targetCurrency);
    }

    private void displayHistory(){
        if (conversionHistory.isEmpty()){
            System.out.println("No conversion found.");
        }else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            for(CurrencyConversion conversion: conversionHistory){
                System.out.printf("%s -> %s: %.2f %s -> %.2f %s at %s%n",
                        conversion.getBaseCurrency(),
                        conversion.getTargetCurrency(),
                        conversion.getAmount(),
                        conversion.getBaseCurrency(),
                        conversion.getConvertedAmount(),
                        conversion.getTargetCurrency(),
                        conversion.getTimestamp().format(formatter));

            }
        }
    }
}
