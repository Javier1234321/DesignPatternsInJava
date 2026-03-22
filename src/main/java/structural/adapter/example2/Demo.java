package structural.adapter.example2;

import structural.adapter.example2.jsonToxml.JacksonAdapter;
import structural.adapter.example2.jsonToxml.JsonToXmlClient;
import structural.adapter.example2.xmlTojson.JacksonAdapter2;
import structural.adapter.example2.xmlTojson.XmlToJsonClient;

public class Demo {
    public static void main(String[] args) throws Throwable {
        String json = "{\"nombre\":\"Juan\",\"edad\":30}";
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<persona>\n" +
                "  <nombre>Juan Pérez</nombre>\n" +
                "  <edad>30</edad>\n" +
                "  <email>juan@example.com</email>\n" +
                "</persona>";
        try{
        JsonToXmlClient client1 = new JsonToXmlClient(new JacksonAdapter());
        System.out.println("Convertir  a XML \n" + client1.process(json));
        XmlToJsonClient client2 = new XmlToJsonClient(new JacksonAdapter2());
        System.out.println("Convertir  a JSON \n" + client2.process(xml));}
        catch (Exception e){
            throw e.fillInStackTrace();
        }
    }
}
