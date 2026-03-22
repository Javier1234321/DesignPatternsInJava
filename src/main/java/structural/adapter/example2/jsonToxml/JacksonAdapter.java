package structural.adapter.example2.jsonToxml;

// Adapter para Jackson
public class JacksonAdapter implements JsonToXmlInterface {
    private JacksonService service = new JacksonService();

    @Override
    public String convert(String json) throws Exception {
        return service.writeJson(json);
    }
}
