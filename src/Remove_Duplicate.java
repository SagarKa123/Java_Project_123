public class Remove_Duplicate {
    public static void main(String[] args) {
        String input = "abracadabra";
        int[] c = new int[256];
        for (int i = 0; i < input.length(); i++) {
            c[input.charAt(i)]++;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (c[ch] == 1) {
                System.out.print(ch);
            }
        }
    }
}
