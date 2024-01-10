package java_programs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

public class ApiCAllInJava {
    public static void main(String[] args) {

        var url="https://api.github.com/users/srajanUP";

        var request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var client =HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            System.out.println(response.statusCode());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
