import server.Server;

import java.util.List;

public class Main {
    private static final int SERVER_PORT = 9999;
    private static final List<String> validPaths = List.of("/index.html", "/spring.svg", "/spring.png", "/resources.html", "/styles.css",
            "/app.js", "/links.html", "/forms.html", "/classic.html", "/events.html", "/events.js");


    public static void main(String[] args) {
        Server server = new Server(SERVER_PORT, validPaths);
        server.start();
    }
}