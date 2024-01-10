import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApiCall {
    public static void main(String[] args) {
         HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://weatherapi-com.p.rapidapi.com/current.json?q=53.1%2C-0.13"))
		.header("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
		.header("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
	}
    
}
