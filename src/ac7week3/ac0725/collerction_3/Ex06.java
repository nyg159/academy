package ac7week3.ac0725.collerction_3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;

import java.util.Map;

public class Ex06 {
    public static void main(String[] args) throws JsonProcessingException {
        String xmlStr = "<?xml version\"1.0\" encoding=\"UTF-8\" ?>" +
                "" +
                "<person>" +
                "    <name>홍길동</name>" +
                "    <age>20</age>" +
                "</person>";

        JSONObject jsonObject = XML.toJSONObject(xmlStr);

        String json = jsonObject.toString(1);

        System.out.println(json);

        ObjectMapper objectMapper = new ObjectMapper();

        Map<String,Object> objectMap;
        objectMap = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
        });


        System.out.println(jsonObject.get("person"));
        System.out.println(((Map)objectMap.get("person")).get("name"));





    }
}
