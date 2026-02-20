package Practise;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class sample6
{
    void testp() throws FileNotFoundException {


        File f=new File("src/test/createPost.json");

        FileReader fr=new FileReader(f);

        JSONTokener jt=new JSONTokener(fr);

        JSONObject data=new JSONObject(jt);








    }
}
