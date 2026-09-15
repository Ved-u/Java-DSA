import java.net.URLEncoder;
import java.util.Random;

public class BingSearchBot {

    // Generate a different random search term each time
    public static String generateRandomQuery(int i) {
        String[] topics = {
            "AI", "Java", "OpenAI", "ChatGPT", "Quantum Computing", "SpaceX", "NASA",
            "Neural Networks", "Cryptocurrency", "Cybersecurity", "Machine Learning",
            "Climate Change", "Famous Movies", "Latest Tech News", "Programming Tips",
            "Android Development", "Web 3.0", "Cloud Computing", "Deep Learning", "C++",
            "Python", "Rust language", "Linux commands", "Edge browser", "Hacking tools"
        };

        Random rand = new Random();
        String topic = topics[rand.nextInt(topics.length)];
        return topic + " " + i;
    }

    public static void main(String[] args) {
        int totalSearches = 10;
        int delaySeconds = 2;

        for (int i = 1; i <= totalSearches; i++) {
            try {
                String query = generateRandomQuery(i);
                String encodedQuery = URLEncoder.encode(query, "UTF-8");
                String searchUrl = "https://www.bing.com/search?q=" + encodedQuery;

                // Windows-specific Edge path (check location on your system)
                String edgePath = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";

                ProcessBuilder pb = new ProcessBuilder(edgePath, searchUrl);
                pb.start();

                System.out.println("[" + i + "] Searching: \"" + query + "\" in Microsoft Edge");

                Thread.sleep(delaySeconds * 1000L);
            } catch (Exception e) {
                System.out.println("[" + i + "] Error: " + e.getMessage());
            }
        }
    }
}
