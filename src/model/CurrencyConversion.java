package model;

import java.time.LocalDateTime;

public class CurrencyConversion {
    private  String baseCurrency;
    private String targetCurrency;
    private double amount;
    private double convertedAmount;
    private LocalDateTime timestamp;

    public CurrencyConversion(String baseCurrency, String targetCurrency, double amount, double convertedAmount) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.amount = amount;
        this.convertedAmount = convertedAmount;
        timestamp = LocalDateTime.now();
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getAmount() {
        return amount;
    }
}
