import java.util.HashMap;
import java.util.Map;

public class TinyURL {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String BASE_URL = "http://tinyurl.com/";
    private static final int ENCODE_LENGTH = 6;
    private Map<String, String> urlMap;

    public TinyURL() {
        urlMap = new HashMap<>();
    }

    public String encode(String longUrl) {
        String key;
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ENCODE_LENGTH; i++) {
                int index = (int) (Math.random() * ALPHABET.length());
                sb.append(ALPHABET.charAt(index));
            }
            key = sb.toString();
        } while (urlMap.containsKey(key));

        urlMap.put(key, longUrl);
        return BASE_URL + key;
    }

    public String decode(String shortUrl) {
        String key = shortUrl.substring(BASE_URL.length());
        return urlMap.get(key);
    }

    public static void main(String[] args) {
        TinyURL codec = new TinyURL();
        String longUrl = "https://skillcaptain.app/unicorn/course/show/all";
        String tinyUrl = codec.encode(longUrl);
        System.out.println("Encoded URL: " + tinyUrl);
        String decodedUrl = codec.decode(tinyUrl);
        System.out.println("Decoded URL: " + decodedUrl);
    }
}
