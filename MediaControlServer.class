import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class MediaControlServer {

    private MediaPlayer player;

    public MediaControlServer(MediaPlayer player) {
        this.player = player;
    }

    public void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/play", (exchange -> {
            if ("GET".equals(exchange.getRequestMethod())) {
                player.play(exchange.getRequestURI().getQuery());
                String response = "Playing media";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }));

        // Define more contexts for pause, stop, etc.

        server.setExecutor(null);
        server.start();
    }
    
    public static void main(String[] args) throws IOException {
        MediaPlayer mediaPlayer = new MediaPlayer();
        MediaControlServer server = new MediaControlServer(mediaPlayer);
        server.startServer();
        System.out.println("Server started on port 8000");
    }
}
