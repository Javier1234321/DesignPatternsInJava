package structural.adapter.example2.jsonToxml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JacksonService {
    public String writeJson(String json) throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        // PASO 1: Leer JSON con jsonMapper (NO con xmlMapper)
        Object jsonObject = jsonMapper.readValue(json, Object.class);

        // PASO 2: Convertir objeto a XML con xmlMapper
        return xmlMapper.writeValueAsString(jsonObject);
    }
}