package ac7week3.ac0726.file_1;

/*
        1. 현재 프로젝트에 있는 Person.json 을 읽어온다
        2. 그대로 콘솔에 출력해 본다
        3. Map 으로 변환시켜 출력한다. 라이브러리 추가하고
 */

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Quiz01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("Person.Json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String inLine = "";

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            inLine += line;

        }

        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, Object> jsonMap
                = objectMapper.readValue(inLine, new TypeReference<Map<String, Object>>() {
        });

        System.out.println(jsonMap + "\n");

        System.out.println("여기까지는 json 파일 출력");
        // 여기 까지는 json 파일을 읽고 출력


        FileReader fileReader1 = new FileReader("Person.xml");
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

        JSONObject jsonObject = XML.toJSONObject(bufferedReader1);

        String json = jsonObject.toString(4);

        System.out.println(json + "\n");

        ObjectMapper objectMapper1 = new ObjectMapper();
        Map<String, Object> objectMap;
        objectMap = objectMapper1.readValue(json, new TypeReference<Map<String, Object>>() {
        });

        System.out.println(objectMap + "\n");

        System.out.println(jsonObject.get("person"));

        System.out.println("XML 파일 출력");

        
        bufferedReader.close();
        bufferedReader1.close();
    }
}
