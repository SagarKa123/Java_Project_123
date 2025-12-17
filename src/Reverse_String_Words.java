public class Reverse_String_Words {
    public static void main(String[] args) {
        String input = "java programming language";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed Words Order: " + result.toString());
    }
}
