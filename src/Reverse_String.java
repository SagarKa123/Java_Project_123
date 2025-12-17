public class Reverse_String {
    public static void main(String[] args) {
        String input = "java programming language";
        String result = "";
        for(String word : input.split(" ")) {
            String reversedWord = "";
            for(int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }
        result = result.trim();
        System.out.println("Original: " + input);
        System.out.println("Reversed Words: " + result);
    }
}
