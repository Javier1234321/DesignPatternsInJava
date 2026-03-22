package structural.adapter.example2.jsonToxml;

public class JsonToXmlClient {
    private JsonToXmlInterface adapter;

    public JsonToXmlClient(JsonToXmlInterface adapter) {
        this.adapter = adapter;
    }

    public String process(String json) throws Exception {
        // Lógica de negocio existente
        System.out.println("Cliente: Procesando conversión...");
        return adapter.convert(json);
    }
}
