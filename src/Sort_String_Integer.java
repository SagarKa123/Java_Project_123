public class Sort_String_Integer {
    public static void main(String[] args) {
        String input = "123-789-456";
        String[] parts = input.split("-");
        for (int i=0;i<parts.length-1;i++){
            for (int j=i+1;j<parts.length;j++){
                if (Integer.parseInt(parts[i])>Integer.parseInt(parts[j])){
                    String temp = parts[i];
                    parts[i] = parts[j];
                    parts[j] = temp;
                }
            }
        }
        String result = String.join("-", parts);
        System.out.println("Original: " + input);
        System.out.println("Sorted: " + result);
    }
}
