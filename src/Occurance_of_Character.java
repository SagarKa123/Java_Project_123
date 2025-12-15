import java.util.*;
public class Occurance_of_Character {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> charCount = countCharacterOccurrences(str);
        System.out.println("Character occurrences in the string \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        return charCount;
    }
}
