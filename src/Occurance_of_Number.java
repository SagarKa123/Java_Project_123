import java.util.*;

public class Occurance_of_Number {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,2};
        Map<Integer, Integer> result = occuranceOfNumbers(arr);
        System.out.println("Number occurrences in the array:");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static Map<Integer, Integer> occuranceOfNumbers(int arr[]){
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        return hashMap;
    }
}
