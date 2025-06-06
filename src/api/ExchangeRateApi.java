package api;

import com.google.gson.Gson;
import io.github.cdimascio.dotenv.Dotenv;
import model.ExchangeRateResponse;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class ExchangeRateApi {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String API_KEY = dotenv.get("EXCHANGE_RATE_API_KEY");
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public ExchangeRateResponse obterTaxas(String moedaBase) throws Exception {
        URI uri = new URI("https", "v6.exchangerate-api.com", "/v6/" + API_KEY + "/latest/" + moedaBase, null);
        URL url = uri.toURL();
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        InputStreamReader reader = new InputStreamReader(conexao.getInputStream());
        Gson gson = new Gson();
        ExchangeRateResponse response = gson.fromJson(reader, ExchangeRateResponse.class);
        reader.close();

        return response;
    }
}

