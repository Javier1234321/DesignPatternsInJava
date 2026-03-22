package structural.adapter.example2.xmlTojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JacksonService {
    public String convertXmlToJson(String xml) throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        // PASO 1: Leer XML con xmlMapper
        Object xmlObject = xmlMapper.readValue(xml, Object.class);

        // PASO 2: Convertir a JSON con jsonMapper
        return jsonMapper.writeValueAsString(xmlObject);
    }
}