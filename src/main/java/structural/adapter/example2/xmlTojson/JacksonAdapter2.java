package structural.adapter.example2.xmlTojson;

public class JacksonAdapter2 implements XmlToJsonInterface {
    private JacksonService service = new JacksonService();

    @Override
    public String convert(String xml) throws Exception {
        // Llama al método correcto que convierte XML a JSON
        return service.convertXmlToJson(xml);
    }
}