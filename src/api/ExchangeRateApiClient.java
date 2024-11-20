package api;

import com.google.gson.Gson;
import dto.ExchangeRateResponse;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApiClient {

    private static final String API_URL_TEMPLATE = "https://v6.exchangerate-api.com/v6/%s/latest/%s";
    private static final String API_KEY = "9bc915453c7a460dae39a149";

    public ExchangeRateResponse fetchExchangeRates(String baseCurrency){
        URI uri =  URI.create(String.format(API_URL_TEMPLATE, API_KEY, baseCurrency));
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(uri).build();


        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),ExchangeRateResponse.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch exchange rates", e);
        }

    }



}
