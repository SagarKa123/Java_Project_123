public class Occurance_of_Characters {
    public static void main(String[] args) {
        String str = "programming";
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Print characters and their occurrences
        System.out.println("Character occurrences in the string \"" + str + "\":");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char)i + ": " + charCount[i]);
            }
        }
    }
}
