import java.util.*;
public class Remove_Numbers_From_Odd {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,20,30};
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                result.add(arr[i]);
            }
        }
        System.out.println(result);
    }
}
