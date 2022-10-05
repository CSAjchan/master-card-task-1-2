//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{1,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,6,6,6,6,7,8,9,9,9,9,9,9,9,10};
        int[] arr1 = new int[]{1,2,2,2,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,6,6,6,6,7,8,9,9,9,9,9,9,9,10};
        int[] arr2 = new int[]{-2, -2, -2, 2, 3, 4, 4, 4, -2, -2, 20};
        int[] arr3 = new int[]{};
        int[] arr4 = new int[]{0, -2, -2, 2, 3, 4, 4, 4, -2, 0, 20, 5, 0, 6, 9, 0, 0, 6, 9, 0};
        int[] arr5 = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0, -1, Integer.MAX_VALUE};
        int[] arr6 = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0, -1, Integer.MIN_VALUE};
        System.out.println("result = " + mostFrequent(arr) + " expected = 9");
        System.out.println("result = " + mostFrequent(arr1) + " expected = 2");
        System.out.println("result = " + mostFrequent(arr2) + " expected = -2");
        System.out.println("result = " + mostFrequent(arr3) + " expected = -1");
        System.out.println("result = " + mostFrequent(arr4) + " expected = 0");
        System.out.println("result = " + mostFrequent(arr5) + " expected = " + Integer.MAX_VALUE);
        System.out.println("result = " + mostFrequent(arr6) + " expected = " + Integer.MIN_VALUE);
    }

    //O(n) speed as we have to traverse the whole integer array
    //O(n) memory complexity worst case scenario, if all the enties in the integer array are unique
    public static int mostFrequent(int[] arr){
        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        if(arr.length<=0){
            return -1;
        }
        
        Arrays.sort(arr);
        int result = 0;
        int maxEntry = 0;
        //iterate over integer array to find max frequency
        for(int i = 0; i < arr.length; i++){
            //check if the key is already in hashmap if not add it with value 1
            if(!frequencyMap.containsKey(arr[i])){
                frequencyMap.put(arr[i], 1);
            }
            //otherwise add 1 to value and put it back into the hashmap
            else{
                frequencyMap.put(arr[i], (frequencyMap.get(arr[i])+1));
            }

            //if the frequency of this entry is higher than maxEntry so far update maxEntry and result with this entry
            if(maxEntry<frequencyMap.get(arr[i])){
                maxEntry = frequencyMap.get(arr[i]);
                result = arr[i];
            }
        }
        return result;
    }
}
