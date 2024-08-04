package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class XmlParserExample {

    public static void main(String[] args) {
        String xmlStringNotworking = "\uFEFF<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<Tags><TagSet><Tag><Key>tag-name-1 tag-name-2</Key><Value>24 34</Value></Tag></TagSet></Tags>";
        System.out.println(xmlStringNotworking.length());

        String xmlworking="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<Tags><TagSet><Tag><Key>tag-name-1 tag-name-2</Key><Value>24 34</Value></Tag></TagSet></Tags>";
        System.out.println(xmlworking.length());

        // Parse the XML string
        Element tagsElement = parseXml(xmlStringNotworking);

        // Check if parsing was successful
        if (tagsElement != null) {
            // Access elements and their values
            String key = getElementValue(tagsElement, "Key");
            String value = getElementValue(tagsElement, "Value");

            // Print the values
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        } else {
            System.out.println("Failed to parse XML.");
        }
    }

    private static Element parseXml(String xmlString) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource inputSource = new InputSource(new StringReader(xmlString));
            Document document = builder.parse(inputSource);
            return document.getDocumentElement();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String getElementValue(Element parentElement, String elementName) {
        Element element = (Element) parentElement.getElementsByTagName(elementName).item(0);
        if (element != null) {
            return element.getTextContent();
        } else {
            return null;
        }
    }
}
