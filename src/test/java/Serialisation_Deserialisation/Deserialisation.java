package Serialisation_Deserialisation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class Deserialisation
{
    @Test
    void deserial() throws JsonProcessingException {


        String jsondata = "{\n" +
                "  \"title\" : \"Appium Testing\",\n" +
                "  \"body\" : \"Selenium testing\",\n" +
                "  \"userID\" : 12345,\n" +
                "  \"courses\" : [ \"java\", \"python\" ]\n" +
                "}";

        //convert jasondtaa> javaobject : Deserialsiation

        ObjectMapper obj=new ObjectMapper();
        student value=obj.readValue(jsondata, student.class);

        System.out.println(value.getBody());
        System.out.println(value.getCourses()[0]);
        System.out.println(value.getCourses()[1]);
    }
}
