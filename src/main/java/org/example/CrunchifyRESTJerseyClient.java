package org.example;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.net.URLEncoder;

public class CrunchifyRESTJerseyClient {
    public static void main(String[] args) {
        CrunchifyRESTJerseyClient crunchifyClient = new CrunchifyRESTJerseyClient();
        crunchifyClient.getCtoFResponse();
    }

    private void getCtoFResponse() {
        try {
            Client client = Client.create();
            // URL with query parameters
            String url = "https://oicpmmsstorage.blob.core.windows.net/containersn/123.csv";

            // Adding query parameters
            String versionId = "2024-01-15T08:51:45.4732665Z";
            String encodedVersionId = URLEncoder.encode(versionId, "UTF-8");
            url += "?comp=tags&versionid=" + versionId;

            // Creating WebResource
            WebResource webResource = client.resource(url);
            webResource.header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImtXYmthYTZxczh3c1RuQndpaU5ZT2hIYm5BdyIsImtpZCI6ImtXYmthYTZxczh3c1RuQndpaU5ZT2hIYm5BdyJ9.eyJhdWQiOiJodHRwczovL3N0b3JhZ2UuYXp1cmUuY29tLyIsImlzcyI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0L2I5OTQ1MmM4LTMwOWUtNGJhYS1hMTBmLTMyMWY4ZmEwZWI0ZC8iLCJpYXQiOjE3MDcxOTUzMjUsIm5iZiI6MTcwNzE5NTMyNSwiZXhwIjoxNzA3MTk5MjI1LCJhaW8iOiJFMlZnWUVoMDQwclJqV3FmWjVQODdZcnNzcWM3QVE9PSIsImFwcGlkIjoiODFjYTIxNTAtZWVjYi00MGU4LWIxYTQtNjBiNDYzM2ZlNjcwIiwiYXBwaWRhY3IiOiIxIiwiaWRwIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvYjk5NDUyYzgtMzA5ZS00YmFhLWExMGYtMzIxZjhmYTBlYjRkLyIsIm9pZCI6IjljM2VkMzM1LWVkY2EtNDUwYi04NGFmLWQ1Zjg3NWEwYWY4ZSIsInJoIjoiMC5BWHdBeUZLVXVaNHdxa3VoRHpJZmo2RHJUWUdtQnVUVTg2aENrTGJDc0NsSmV2RzdBQUEuIiwic3ViIjoiOWMzZWQzMzUtZWRjYS00NTBiLTg0YWYtZDVmODc1YTBhZjhlIiwidGlkIjoiYjk5NDUyYzgtMzA5ZS00YmFhLWExMGYtMzIxZjhmYTBlYjRkIiwidXRpIjoic0xDNm9CZ085MEtZcGRZc3NLWGNBQSIsInZlciI6IjEuMCJ9.glEPYARTP5KynvZz3-HgUx6rUh7jBJjMMwewB3QpAoQx4iwBob4Zbt0-MZu6FVdQrNFAwyK5mVpi0hsThNFriSLMqmMKJhwSolloMUtUadEqJmJgudI2o8QphcnQgEsbHmNjsVijXUhjNSdADunIgDJdqs0j0vnBvtJpnIcqA63RCB_99_U6F5lpok1iQC-yOLgA2AkqL8ijYjSlr55yd1TlOngUbsUkGkpEgSLJHCIlx1Mz5K8KNMv31O7AhgDtKP9MiEame-p9vM0W3lPaHR9UsDd1UQdkRuAHVamD4Jv68z7Vo4mmUd3gZmNsypXR-nN3BzIQwIosVHiw1fdK2g");
            webResource.header("x-ms-version", "2023-08-03");


            ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
            String output = response.getEntity(String.class);
            System.out.println("============getCtoFResponse============");
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
