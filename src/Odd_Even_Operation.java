public class Odd_Even_Operation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[left] = j;
                left++;
            } else {
                result[right] = j;
                right--;
            }
        }
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
