public class Remove_Duplicate_Character {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";
        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            boolean isDuplicate = false;
            for (int j=0;j<result.length();j++){
                if (result.charAt(j) == ch){
                    isDuplicate = true;
                    break;
                }
            }
            if (result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println("Original: " + input);
        System.out.println("Without Duplicates: " + result);
    }
}
