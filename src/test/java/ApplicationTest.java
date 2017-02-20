import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApplicationTest {

    public static void main(String[] asgr) {

        try {
            URL url = new URL("http://localhost:8080/test");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            StringBuffer buffer = new StringBuffer();
            buffer.append("name").append("=").append("zcq").append("&").append("age").append("=").append("18");
            connection.getOutputStream().write(buffer.toString().getBytes());
            connection.getOutputStream().flush();
            connection.getOutputStream().close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}