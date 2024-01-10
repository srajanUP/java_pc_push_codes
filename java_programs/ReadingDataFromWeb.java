import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URI;
public class ReadingDataFromWeb {
    public static void main(String[] args) throws MalformedURLException {
        try {
            URI url=new URI("https://www.google.com/index.html");
            url.toURL();
            Scanner sc=new Scanner(url.toString());
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
