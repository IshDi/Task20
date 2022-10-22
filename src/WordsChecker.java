import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String textCheck;

    public WordsChecker(String textCheck) {
        this.textCheck = textCheck;
    }

    public boolean hasWord(String textUser) {
        Set<String> set = new HashSet<>();
        String[] words = textCheck.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
        if (set.contains(textUser)) {
            return true;
        }
        return false;
    }
}
