package com.bcone.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AzurePutBlobUploader {

    public static void main(String[] args) {
        String container = "samplecontainer"; // Hard-code or pass container name
        String blob = "sample1.xml";           // Hard-code or pass blob name
        String urlString = "https://oracleoic.blob.core.windows.net/" + container + "/" + blob;
        String filePath = "C:/Users/mushtaq.ahamad/Downloads/sample1.xml.";  // Path to the file you want to upload

        try {
            // Create a URL connection to the Azure Blob Storage URL
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method to PUT
            connection.setRequestMethod("PUT");

            // Set headers
            connection.setRequestProperty("x-ms-version", "2020-04-08");
            connection.setRequestProperty("x-ms-blob-type", "BlockBlob");
            connection.setRequestProperty("Content-Type", "application/octet-stream");
            connection.setRequestProperty("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ik1jN2wzSXo5M2c3dXdnTmVFbW13X1dZR1BrbyIsImtpZCI6Ik1jN2wzSXo5M2c3dXdnTmVFbW13X1dZR1BrbyJ9.eyJhdWQiOiJodHRwczovL3N0b3JhZ2UuYXp1cmUuY29tIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvMDg3NjcxM2QtYTUyMi00YjE1LWE4ODctM2U5ZGFjYjFjNjM1LyIsImlhdCI6MTcyODAyMjE5NiwibmJmIjoxNzI4MDIyMTk2LCJleHAiOjE3MjgwMjYwOTYsImFpbyI6ImsyQmdZSmk2UCsxQnVYUnIycmsxa250NHY4VStCUUE9IiwiYXBwaWQiOiJlNmE3Y2IxZC1lMWJiLTQxOTAtYjFlZS0zMjYzMzUwNmI4YjEiLCJhcHBpZGFjciI6IjEiLCJpZHAiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8wODc2NzEzZC1hNTIyLTRiMTUtYTg4Ny0zZTlkYWNiMWM2MzUvIiwiaWR0eXAiOiJhcHAiLCJvaWQiOiJlOTA3Yjg5OC00MTM4LTQwOTEtYWE4NC1hMWE1ODFmYzA2MGYiLCJyaCI6IjAuQVhJQVBYRjJDQ0tsRlV1b2h6NmRyTEhHTllHbUJ1VFU4NmhDa0xiQ3NDbEpldkZ5QUFBLiIsInN1YiI6ImU5MDdiODk4LTQxMzgtNDA5MS1hYTg0LWExYTU4MWZjMDYwZiIsInRpZCI6IjA4NzY3MTNkLWE1MjItNGIxNS1hODg3LTNlOWRhY2IxYzYzNSIsInV0aSI6InFPR1VQNnhIU1VxUEVEd2J6d3hqQUEiLCJ2ZXIiOiIxLjAiLCJ4bXNfaWRyZWwiOiI3IDE2In0.fk7GuXzZg07qXGV0h6hQlvg6TDbpIfJA6s-rSrHqb1gvRznqAqNxRUJxuSgADHIkH-CheXkVkPyMZZ40uuzMPyJt4_ZrKc2UPR1QoXTBvjVYPnizcWqonhl1cSUBK5wNwBir4I3YYy6-2SX12qld-2l582mFAuGZYAqpqlptDFHL4AZ3J4UtNjFKLFMsHaXO_fiCcZAYalHN9TNhk8XeRRL_KUa2ROeeqJpfzwvCcbiLzRRu_2Lk-8N3vnuisL1CbFxQKPdC-h0LHU-yaeT97v8z8Lr2rP0chawbUYiQfWyIuz1k3tSyJ1lFD7QA8KPNuQ9K-VcPyzQLTIVN_qfOxQ"); // Hard-code the Authorization token here

            // Enable output to send body
            connection.setDoOutput(true);

            // Open the file you want to upload
            File file = new File(filePath);
            try (FileInputStream fis = new FileInputStream(file);
                 OutputStream os = connection.getOutputStream()) {
                // Read file contents and send it to Azure Blob Storage
                byte[] buffer = new byte[4096]; // Buffer to read file chunks
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }
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
