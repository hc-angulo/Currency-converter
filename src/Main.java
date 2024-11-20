import api.ExchangeRateApiClient;
import service.CurrencyConverterService;
import ui.ConsoleMenu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExchangeRateApiClient apiClient = new ExchangeRateApiClient();
        CurrencyConverterService converterService = new CurrencyConverterService(apiClient);
        ConsoleMenu menu = new ConsoleMenu(converterService);
        menu.start();
    }
}