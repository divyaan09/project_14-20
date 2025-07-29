import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class URLShortener {
    private static final String BASE_URL = "http://short.ly/";
    private static HashMap<String, String> urlMap = new HashMap<>();

    // Generate short URL using hashCode
    public static String shortenURL(String originalURL) {
        String shortCode = Integer.toHexString(originalURL.hashCode());
        String shortURL = BASE_URL + shortCode;
        urlMap.put(shortCode, originalURL);
        logToFile(originalURL, shortURL);
        return shortURL;
    }

    // Get original URL from short code
    public static String expandURL(String shortURL) {
        String shortCode = shortURL.replace(BASE_URL, "");
        return urlMap.getOrDefault(shortCode, "URL not found.");
    }

    // Log each shortening operation
    public static void logToFile(String original, String shortened) {
        try (FileWriter fw = new FileWriter("shortener_log.txt", true)) {
            fw.write("Original: " + original + " | Shortened: " + shortened + "\n");
        } catch (IOException e) {
            System.out.println("Logging failed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter URL to shorten: ");
        String originalURL = sc.nextLine();

        String shortURL = shortenURL(originalURL);
        System.out.println("Short URL: " + shortURL);

        System.out.print("\nEnter Short URL to expand: ");
        String inputShort = sc.nextLine();
        System.out.println("Original URL: " + expandURL(inputShort));
        
        sc.close();
    }
}
