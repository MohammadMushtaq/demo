package org.example;

public class GenerateLargeXSD {

    public static void main(String[] args) {
        int repeatBooks = 100000; // Adjust this value to achieve the desired file size

        // Start writing the XSD content to console
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        System.out.println("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">");

        // Create the root element
        System.out.println("    <xs:element name=\"library\">");
        System.out.println("        <xs:complexType>");
        System.out.println("            <xs:sequence>");

        // Write repeated book elements to increase the size
        for (int i = 0; i < repeatBooks; i++) {
            System.out.println("                <xs:element name=\"book" + i + "\" maxOccurs=\"1\">");
            System.out.println("                    <xs:complexType>");
            System.out.println("                        <xs:sequence>");
            System.out.println("                            <xs:element name=\"title\" type=\"xs:string\"/>");
            System.out.println("                            <xs:element name=\"author\" type=\"xs:string\"/>");
            System.out.println("                            <xs:element name=\"publicationYear\" type=\"xs:integer\"/>");
            System.out.println("                            <xs:element name=\"genre\" type=\"xs:string\"/>");
            System.out.println("                        </xs:sequence>");
            System.out.println("                        <xs:attribute name=\"id\" type=\"xs:string\" use=\"required\"/>");
            System.out.println("                    </xs:complexType>");
            System.out.println("                </xs:element>");
        }

        // Close the sequence and complexType
        System.out.println("            </xs:sequence>");
        System.out.println("        </xs:complexType>");
        System.out.println("    </xs:element>");

        // Close the schema tag
        System.out.println("</xs:schema>");
        System.out.println("Large Library XSD content printed successfully.");
    }
}
