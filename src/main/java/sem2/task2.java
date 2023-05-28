//3) Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физик
package sem2;
import lombok.SneakyThrows;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class task2 {
    public static void main(String[] args)  {

        String jsonString = "[{\"surname\":\"Ivanov\",\"grade\":\"5\",\"subject\":\"Maths\"}" +
                ",{\"surname\":\"Petrov\",\"grade\":\"4\",\"subject\":\"IT\"}" +
                ",{\"surname\":\"Krasnov\",\"grade\":\"5\",\"subject\":\"Physics\"}]";
        parseStringJson(jsonString);
    }

    @SneakyThrows
    private static void parseStringJson(String jsonString) {

        Object object = new JSONParser().parse(jsonString);
        JSONArray array = (JSONArray) object;

        for (Object obj : array) {
            JSONObject jsonObject = (JSONObject) obj;
            StringBuilder builder = new StringBuilder();
            builder.append("Student").append(jsonObject.get("Surname"))
                    .append("grade").append(jsonObject.get("grade"))
                    .append("on subject")
                    .append(jsonObject.get("on subject"));
            String sqlQuery = builder.toString();
            System.out.println(sqlQuery);
        }
    }}
}
