import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public void addTranslation(String word, String translation) {
        translations.put(word, translation);
    }

    public String translate(String word) {
        return translations.getOrDefault(word, "Word not found in dictionary");
    }
}

