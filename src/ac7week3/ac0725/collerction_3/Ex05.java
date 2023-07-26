package ac7week3.ac0725.collerction_3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Ex05 {
    public static void main(String[] args) throws Exception{
        String jsonStr  = "{" +
                "    \"person\" : {" +
                "        \"name\" : \"홍길동\"," +
                "        \"age\" : 20 " +
                "        " +
                "    }" +
                "}";

        // 객체를 매핑 해줌
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, Object> jsonMap
                = objectMapper.readValue(jsonStr, new TypeReference<Map<String, Object>>() {
        });



        System.out.println(jsonMap);
        System.out.println(jsonMap.get("person"));
        System.out.println(jsonMap.get("person").getClass());
        System.out.println(((Map<String,Object>)jsonMap.get("person")).get("name"));
        System.out.println(((Map)jsonMap.get("person")).get("age"));

    }
}
