package ac7week3.ac0725.collerction_3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.util.List;
import java.util.Map;

public class Ex07 {
    public static void main(String[] args) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();

        URL url = new URL("http://data.ex.co.kr/openapi/restinfo/restWeatherList?key=5094918217&type=json&sdate=20230724&stdHour=10");
        Map<String, Object> jsonMap = objectMapper.readValue(url, new TypeReference<Map<String,Object>>() {
        });

        
//        System.out.println(jsonMap);   한줄로 출력이 되는데 너무 길게 나옴
        // 1. 한줄로 모두 출력 되니 보기가 힘드네 반복으로 간다.
        
//        jsonMap.forEach((String k, Object y) -> System.out.println(k + " : " + y));
//        2. 받은 결과인 Map 의 key 들을 확인해보자
        
        System.out.println(jsonMap.get("list").getClass());
//      3. list 라는 key 에 여러 정보가 담겨 있다
//        4. 자료형을 확인해 보자 .getClass()-> list 였다
        
        List<Map<String,Object>> list = (List<Map<String, Object>>) jsonMap.get("list");

        System.out.println(list.get(0));
        System.out.println(list.get(0).get("unitName"));
        
        // 한줄씩 출력
        for (Map<String ,Object> map : list){
//            System.out.println(map);      전체 출력
            System.out.println(map.get("unitName") + " : "+ map.get("weatherContents"));
        }

    }
}
