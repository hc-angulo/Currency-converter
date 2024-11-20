package dto;

import java.util.Map;

public record ExchangeRateResponse(
        String base_code,
        Map<String,Double>conversion_rates)
{
    public Double getRateForCurrency(String targetCurrency){
        return conversion_rates.get(targetCurrency);
    }
}

