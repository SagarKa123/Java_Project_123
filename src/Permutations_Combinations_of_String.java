public class Permutations_Combinations_of_String {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Permutations of " + str + ":");
        permute(str, 0, str.length() - 1);

        System.out.println("\nCombinations of " + str + ":");
        for (int i = 1; i <= str.length(); i++) {
            combine(str, "", 0, i);
        }
    }

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void combine(String str, String prefix, int start, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = start; i <= str.length() - k; i++) {
            combine(str, prefix + str.charAt(i), i + 1, k - 1);
        }
    }
}
