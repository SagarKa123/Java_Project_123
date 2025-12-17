public class Reverse_Whole_String {
    public static void main(String[] args) {
        String input = "java programming language";
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }
}