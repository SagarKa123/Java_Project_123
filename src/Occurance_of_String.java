import java.util.*;
public class Occurance_of_String {
    public static void main(String[] args) {
        String str = "Java is a programming language. Java is widely used. java is best programming language.";
        Map<String, Integer> wordCount = countStringOccurrences(str);
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static Map<String, Integer> countStringOccurrences(String str) {
        String[] words = str.split("[ .]+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            if(wordCount.containsKey(word)){
                wordCount.put(lowerCaseWord, wordCount.get(lowerCaseWord) + 1);
            } else {
                wordCount.put(lowerCaseWord, 1);
            }
        }
        return wordCount;
    }
}
