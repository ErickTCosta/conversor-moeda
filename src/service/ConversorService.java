package service;

import api.ExchangeRateApi;
import model.ExchangeRateResponse;

public class ConversorService {
    private ExchangeRateApi api = new ExchangeRateApi();

    public double converter(String moedaOrigem, String moedaDestino, double valor) {
        try {
            ExchangeRateResponse response = api.obterTaxas(moedaOrigem);
            if ("success".equals(response.getResult())) {
                double taxa = response.getConversion_rates().get(moedaDestino);
                return valor * taxa;
            } else {
                System.out.println("Erro na resposta da API.");
                return 0;
            }
        } catch (Exception e) {
            System.out.println("Erro na conversão: " + e.getMessage());
            return 0;
        }
    }
}
