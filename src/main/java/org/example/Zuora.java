package org.example;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Zuora {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();

        String apiUrl = "https://rest.sandbox.na.zuora.com/v1/payment-methods/8ac68a6c8bae71c9018bb3bb2fbb4385/profiles/83/cancel";

        WebTarget target = client.target(apiUrl);

        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        builder.header("Authorization", "Bearer b8813f8ca797498a85995c74bc8c61dc");

        Response response = builder.post(null);
//        builder.header("Accept","null");
        String responseBody = response.readEntity(String.class);
        System.out.println("Response Body:\n" + responseBody);

        response.close();
        client.close();
    }
}
