//package org.example;
//
//
//import jakarta.ws.rs.client.Client;
//import jakarta.ws.rs.client.ClientBuilder;
//import jakarta.ws.rs.client.Invocation;
//import jakarta.ws.rs.client.WebTarget;
//import jakarta.ws.rs.core.Response;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.xml.sax.InputSource;
//
//import javax.ws.rs.core.MediaType;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import java.io.StringReader;
//import java.util.Arrays;
//
//
//
//public class GetXmlClient {
//
//    public static void main(String[] args) {
//
//        Client client = ClientBuilder.newClient();
//
//        String apiUrl = "https://rest.sandbox.na.zuora.com/v1/payment-methods/8ac68a6c8bae71c9018bb3bb2fbb4385/profiles/46/cancel";
//
//        WebTarget target = client.target(apiUrl);
//
//        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
//        builder.header("Authorization", "Bearer b8813f8ca797498a85995c74bc8c61dc");
//
//        Response response = builder.get();
//            String responseBody = response.readEntity(String.class);
//            System.out.println("Response Body:\n" + responseBody.length());
//
//            byte[] byte1 = responseBody.getBytes();
//            byte[] bytearray = Arrays.copyOfRange(byte1,3,byte1.length);
//
//            String xmlString = new String(bytearray);
//            System.out.println(xmlString.length());
//
//        Element tagsElement = parseDocument(xmlString);
/// / Check if parsing was successful
//            if (tagsElement != null) {
//                // Access elements and their values
//                String key = getElementValue(tagsElement, "Key");
//                String value = getElementValue(tagsElement, "Value");
//
//                // Print the values
//                System.out.println("Key: " + key);
//                System.out.println("Value: " + value);
//            } else {
//                System.out.println("Failed to parse XML.");
//            }
//    }
//    private static Element parseDocument(String xmlString) {
//        try {
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            InputSource inputSource = new InputSource(new StringReader(xmlString));
//            Document document = builder.parse(inputSource);
//            return document.getDocumentElement();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//    private static String getElementValue(Element parentElement, String elementName) {
//        Element element = (Element) parentElement.getElementsByTagName(elementName).item(0);
//        if (element != null) {
//            return element.getTextContent();
//        } else {
//            return null;
//        }
//    }
//}
