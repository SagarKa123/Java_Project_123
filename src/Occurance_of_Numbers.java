public class Occurance_of_Numbers {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 2};
        int[] count = new int[10]; // Assuming numbers are in the range 0-9
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        System.out.println("Number occurrences in the array:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + ": " + count[i]);
            }
        }
    }
}