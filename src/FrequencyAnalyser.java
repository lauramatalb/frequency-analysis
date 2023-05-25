import java.util.Map;
import java.util.HashMap;

public class FrequencyAnalyser {

    public Map<Character, Integer> frequencies;
    public String cipherText;

    public FrequencyAnalyser(Message message) {
        this.frequencies = new HashMap<>();
        this.cipherText = message.getCipherText();
        initialiseFrequencies();
    }

    private void initialiseFrequencies() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<alphabet.length(); i++) {
            frequencies.put(alphabet.charAt(i), 0);
        }
    }

    public void analyse() {
        for (int i=0; i<cipherText.length(); i++) {
            Character letter = cipherText.charAt(i);
            Integer count = frequencies.get(letter) + 1;
            frequencies.put(letter, count);
        }
    }

    public Map<Character, Integer> getFrequencies() {
        return this.frequencies;
    }
}
