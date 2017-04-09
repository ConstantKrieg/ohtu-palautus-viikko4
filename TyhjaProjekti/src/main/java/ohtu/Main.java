package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan, ÄLÄ kuitenkaan laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String maxUrl = "https://ohtustats2017.herokuapp.com/courses/1.json";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
        String maxBodyText = Request.Get(maxUrl).execute().returnContent().asString();

        System.out.println("json-muotoinen data:");
        System.out.println( maxBodyText );

        Gson mapper = new Gson();
        
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        Course ohtu = mapper.fromJson(maxBodyText, Course.class);
        
        System.out.println("Kurssi: " + ohtu.getName() + ", " + ohtu.getTerm());
        System.out.println("opiskelijanumero: " + studentNr);
        for (Submission submission : subs) {
            submission.setCouse(ohtu);
            submission.initTasks();
            System.out.println(submission);
        }

    }
}
