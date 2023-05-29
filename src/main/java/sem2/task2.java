//3) Дана json-строка (можно сохранить в файл и читать из файла)
// который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

package sem2;
import lombok.SneakyThrows;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.logging.Logger;


public class task2 {

    public static void main(String[] args)  {

        String jsonString = "["+ "{\"surname\":\"Ivanov\",\"grade\":\"5\",\"subject\":\"Maths\"}" +
                ",{\"surname\":\"Petrov\",\"grade\":\" 4 \",\"subject\":\"IT\"}" +
                ",{\"surname\":\"Krasnov\",\"grade\":\" 5 \",\"subject\":\"Physics\"}"+"]";
        parseStringJson(jsonString);
    }

    @SneakyThrows
    private static void parseStringJson(String jsonString) {

        Object object = new JSONParser().parse(jsonString);
        JSONArray array = (JSONArray) object;

        for (Object obj : array) {
            JSONObject jsonObject = (JSONObject) obj;
            StringBuilder builder = new StringBuilder("Student ");
            builder.append(jsonObject.get(" surname "))
                    .append(" got a grade ")
                    .append(jsonObject.get(" grade "))
                    .append(" on subject ")
                    .append(jsonObject.get(" subject "));
            String sqlQuery = builder.toString();
            System.out.println(sqlQuery);
        }
    }
}

