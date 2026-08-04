import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.*;

public class HumanTypingSearch {

    private static final int SEARCH_COUNT = 3;
    private static final int WORD_LENGTH = 5;

    private static final List<String> WORDS = new ArrayList<>();
    private static final Random RANDOM = new Random();

    public static void repeat() throws Exception{
        populateWords();

        if (WORDS.isEmpty()) {
            System.out.println("Failed to load words.");
            return;
        }

        System.out.println("Loaded " + WORDS.size() + " words.");

        launchEdge();

        Robot robot = new Robot();

        Thread.sleep(1500);

        performSearches(robot);
    }
    public static void main(String[] args) throws Exception {

        for(int i=1;i<=3;i++){
            repeat();
        }
    }

    private static void populateWords() throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://en.wikipedia.org/wiki/Main_Page"))
                .header("User-Agent", "Mozilla/5.0")
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, 
                    HttpResponse.BodyHandlers.ofString());

        String html = response.body();

        // Remove scripts/styles
        html = html.replaceAll("(?is)<script.*?>.*?</script>", " ");
        html = html.replaceAll("(?is)<style.*?>.*?</style>", " ");

        // Remove HTML tags
        html = html.replaceAll("<[^>]+>", " ");

        // Remove HTML entities
        html = html.replaceAll("&[A-Za-z#0-9]+;", " ");

        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : html.split("[^A-Za-z]+")) {

            word = word.toLowerCase();

            if (word.length() >= WORD_LENGTH) {
                uniqueWords.add(word);
            }
        }

        WORDS.clear();
        WORDS.addAll(uniqueWords);
    }

    private static void launchEdge() throws IOException {
        new ProcessBuilder("cmd", "/c", "start", "msedge").start();
    }

    private static void performSearches(Robot robot) throws Exception {

        for (int i = 0; i < SEARCH_COUNT; i++) {

            String query = getRandomWord();

            focusAddressBar(robot);

            Thread.sleep(100);

            typeText(robot, query);

            Thread.sleep(100);

            pressEnter(robot);

            System.out.println("Search " + (i + 1) + ": " + query);

            waitRandom(1000, 3000);
        }
    }

    private static String getRandomWord() {
        return WORDS.get(RANDOM.nextInt(WORDS.size()));
    }

    private static void focusAddressBar(Robot robot) {

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);

        robot.keyRelease(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    private static void typeText(Robot robot, String text)
            throws InterruptedException {

        for (char c : text.toCharArray()) {
            type(robot, c);
            Thread.sleep(80 + RANDOM.nextInt(170));
        }
    }

    private static void pressEnter(Robot robot) {

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    private static void waitRandom(int minMillis, int maxMillis)
            throws InterruptedException {

        Thread.sleep(minMillis + RANDOM.nextInt(maxMillis - minMillis + 1));
    }

    private static void type(Robot robot, char c) {

        if (c == ' ') {
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            return;
        }

        boolean upper = Character.isUpperCase(c);

        int keyCode =
                KeyEvent.getExtendedKeyCodeForChar(Character.toUpperCase(c));

        if (keyCode == KeyEvent.VK_UNDEFINED) {
            return;
        }

        if (upper) {
            robot.keyPress(KeyEvent.VK_SHIFT);
        }

        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);

        if (upper) {
            robot.keyRelease(KeyEvent.VK_SHIFT);
        }
    }
}