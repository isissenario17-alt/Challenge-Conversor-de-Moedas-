package challenge.conversor.de.Moeda.Conversao;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversoes {
    public double realizarConversao(String moeda1, String moeda2, double valorConversao) {
        String url1 = "https://v6.exchangerate-api.com/v6/";
        String chave = "0f91550e22a05c20a23b2d94";
        String urlBonus = "/pair/";
        String urlCompleta = url1 + "/" + chave + "/" + urlBonus + "/" + moeda1 + "/" + moeda2;
        double valorConvertido = 0;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(urlCompleta)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonElement element = JsonParser.parseString(response.body());
            JsonObject object = element.getAsJsonObject();
            if (object.has("conversion_rate")){
              double conversionRate = object.get("conversion_rate").getAsDouble();
              valorConvertido = valorConversao * conversionRate;
              return valorConvertido;
            } else {
                System.out.println("Erro na conversão!");
                return 0.0;
            }
        } catch (Exception e) {
            System.out.println("Aconteceu um erro.");
            return 0.0;
        }
    }
}
