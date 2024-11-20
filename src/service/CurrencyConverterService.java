package service;

import api.ExchangeRateApiClient;
import dto.ExchangeRateResponse;
import model.CurrencyConversion;

public class CurrencyConverterService {
    private final ExchangeRateApiClient apiClient;

    public CurrencyConverterService(ExchangeRateApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public CurrencyConversion convertCurrency(String baseCurrency, String targetCurrency, double amount){
        ExchangeRateResponse rates = apiClient.fetchExchangeRates(baseCurrency);
        Double rate = rates.getRateForCurrency(targetCurrency);

        if (rate == null){
            throw new IllegalArgumentException("Invalid target currency: " + targetCurrency);
        }

        double convertedAmount = amount * rate;
        return new CurrencyConversion(baseCurrency,targetCurrency, amount, convertedAmount);
    }
}
