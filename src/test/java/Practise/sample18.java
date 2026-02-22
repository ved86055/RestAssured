package Practise;

import PostReqPayloadWays.POJO.POJO_Main;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class sample18
{
    @Test
    void practise() throws JsonProcessingException {
        POJO_Main data = new POJO_Main();

        data.setBody("Selenium testing");
        data.setUserID(12345);
        data.setTitle("Appium Testing");

        String[] coursesarr = {"java", "python"};

        data.setCourses(coursesarr);

        ObjectMapper obj=new ObjectMapper();
      String valp= obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
        System.out.println(valp);
    }
}
