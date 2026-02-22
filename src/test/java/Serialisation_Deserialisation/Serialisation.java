package Serialisation_Deserialisation;

import PostReqPayloadWays.POJO.POJO_Main;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//convert java object >>>>> json object >> serialsiation
public class Serialisation {

    public static void main(String[] args) throws JsonProcessingException {

        POJO_Main data = new POJO_Main();

        data.setBody("Selenium testing");
        data.setUserID(12345);
        data.setTitle("Appium Testing");

        String[] coursesarr = {"java", "python"};

        data.setCourses(coursesarr);

        ObjectMapper obj =new ObjectMapper();
        String jsondata=obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
        System.out.println(jsondata);
    }
}