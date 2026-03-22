package structural.adapter.example2.xmlTojson;

public class XmlToJsonClient {
    private XmlToJsonInterface adapter;

    public XmlToJsonClient(XmlToJsonInterface adapter) {
        this.adapter = adapter;
    }

    public String process(String xml) throws Exception {
        // Lógica de negocio existente
        System.out.println("Cliente: Procesando conversión XML a JSON...");
        return adapter.convert(xml); // Recibe XML, devuelve JSON
    }
}