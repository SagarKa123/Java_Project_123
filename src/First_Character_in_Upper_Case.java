public class First_Character_in_Upper_Case {
    public static void main(String[] args) {
        String input = "java programming language";
        String result = capitalizeFirstCharacter(input);
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + result);
    }
    public static String capitalizeFirstCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
