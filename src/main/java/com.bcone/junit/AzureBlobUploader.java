package com.bcone.junit;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AzureBlobUploader {

    public static void main(String[] args) {
        String container = "samplecontainer"; // Hard-code or pass container name
        String blob = "10_03.json";           // Hard-code or pass blob name
        String urlString = "https://oracleoic.blob.core.windows.net/" + container + "/" + blob;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method to PUT
            connection.setRequestMethod("PUT");

            // Set headers
            connection.setRequestProperty("x-ms-version", "2020-04-08");
            connection.setRequestProperty("x-ms-blob-type", "BlockBlob");
            connection.setRequestProperty("Content-Type", "application/octet-stream");
            connection.setRequestProperty("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ik1jN2wzSXo5M2c3dXdnTmVFbW13X1dZR1BrbyIsImtpZCI6Ik1jN2wzSXo5M2c3dXdnTmVFbW13X1dZR1BrbyJ9.eyJhdWQiOiJodHRwczovL3N0b3JhZ2UuYXp1cmUuY29tIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvMDg3NjcxM2QtYTUyMi00YjE1LWE4ODctM2U5ZGFjYjFjNjM1LyIsImlhdCI6MTcyNzk3MjkwMywibmJmIjoxNzI3OTcyOTAzLCJleHAiOjE3Mjc5NzY4MDMsImFpbyI6ImsyQmdZTERSTWZvNmVkNGlwYS83YXVPZEw3R1pBQUE9IiwiYXBwaWQiOiJlNmE3Y2IxZC1lMWJiLTQxOTAtYjFlZS0zMjYzMzUwNmI4YjEiLCJhcHBpZGFjciI6IjEiLCJpZHAiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8wODc2NzEzZC1hNTIyLTRiMTUtYTg4Ny0zZTlkYWNiMWM2MzUvIiwiaWR0eXAiOiJhcHAiLCJvaWQiOiJlOTA3Yjg5OC00MTM4LTQwOTEtYWE4NC1hMWE1ODFmYzA2MGYiLCJyaCI6IjAuQVhJQVBYRjJDQ0tsRlV1b2h6NmRyTEhHTllHbUJ1VFU4NmhDa0xiQ3NDbEpldkZ5QUFBLiIsInN1YiI6ImU5MDdiODk4LTQxMzgtNDA5MS1hYTg0LWExYTU4MWZjMDYwZiIsInRpZCI6IjA4NzY3MTNkLWE1MjItNGIxNS1hODg3LTNlOWRhY2IxYzYzNSIsInV0aSI6Imc4UVZYd2p0TUVPV3VGM2xGRGtfQUEiLCJ2ZXIiOiIxLjAiLCJ4bXNfaWRyZWwiOiI3IDgifQ.cPYHKdo6moYJSq6yIdr54RKMiH1krLxCCXwhYIY4CbBaM2xYady8uIS3qotkO3I-IvtDP4PC7B5pGuOAE0Jvu2Qjg7Qpx-tnNeRaABbk7lLiIWr2AmB1BXAD5_Booz98XuhX7B0BQyq_jOfwgHb252BUVCcTQi__bLL_Cc2gFeba9ujWOJRl6kogzDKNnPnB0HNZpokdIz-owUEC_x4JYWvZ8nAJDZsFVB5ExbUEmuc4hyC40qz0h2LS3iRK-UH0BNAu7diBGzUhzehMHYmLgNwo5msbyWYk06hPr8LZ1ZqQrdq9GUrBnLQ-NuD-xWQ-8Q5uR0gzsih9qbIG6z2eXQ"); // Hard-code the Authorization token here

            // Enable output to send body
            connection.setDoOutput(true);

            // Write the body content (this could be file data or any byte stream)
            byte[] fileContent = "Your file content goes here...".getBytes(); // Replace with actual content
            try (OutputStream os = connection.getOutputStream()) {
                os.write(fileContent);
            }

            // Get response code and check if the request was successful
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_CREATED) {
                System.out.println("Upload successful. Status: " + responseCode);

                // Retrieve and print response headers
                String requestId = connection.getHeaderField("x-ms-request-id");
                System.out.println("Request ID: " + requestId);
            } else {
                System.out.println("Failed to upload. Status: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

