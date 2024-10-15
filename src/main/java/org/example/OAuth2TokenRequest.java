package org.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class OAuth2TokenRequest {

    public static void main(String[] args) {
        try {
            // Set your Tenant ID, Client ID, Client Secret, and Scope/Resource here
            String tenantId = "0876713d-a522-4b15-a887-3e9dacb1c635";
            String clientId = "e6a7cb1d-e1bb-4190-b1ee-32633506b8b1";
            String clientSecret = "q";
            String resource = "https://storage.azure.com"; // For Azure Storage

            // Build the URL for the token request
            String url = "https://login.microsoftonline.com/" + tenantId + "/oauth2/token";

            // Open a connection to the URL
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // Set the request method to POST
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            // Build the request body
            String urlParameters = "grant_type=client_credentials" +
                    "&client_id=" + URLEncoder.encode(clientId, "UTF-8") +
                    "&client_secret=" + URLEncoder.encode(clientSecret, "UTF-8") +
                    "&resource=" + URLEncoder.encode(resource, "UTF-8");

            // Send POST request
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();

            // Get the response code
            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the access token (JSON response)
            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

