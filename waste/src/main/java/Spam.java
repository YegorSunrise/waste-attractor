import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;

public class Spam {
    public static void send() throws IOException, InterruptedException {
        String body = spamBuilder();
        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(buildUri())
                        .headers("Content-Type", "text/plain;charset=UTF-8")
                        .POST(HttpRequest.BodyPublishers.ofString(body))
                        .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(body);
    }

    private static URI buildUri(){
        String attrIp = System.getenv("ATTR_IP");
        URI uri = URI.create("http://" + attrIp + ":8181/waste");
        System.out.println(uri);
        return uri;
    }

    private static String spamBuilder(){
        String now = LocalDateTime.now().toString();
        String uuid  = UUID.randomUUID().toString().toUpperCase(Locale.ROOT).substring(0,5);
        return uuid + " " + now;
    }

}
