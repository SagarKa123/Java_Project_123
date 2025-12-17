public class Remove_Duplicate_Words {
    public static void main(String[] args) {
        String input = "java is programming and java is widely used";
        String result = "";
        String[] words = input.split(" ");
        for (String s : words) {
            boolean isDuplicate = false;
            String[] word = result.split(" ");
            for (String string : word) {
                if (s.equals(string)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                if (result.isEmpty()) {
                    result += s;
                } else {
                    result += " " + s;
                }
            }
        }
        System.out.println("Original: " + input);
        System.out.println("Without Duplicate Words: " + result);
    }
}
