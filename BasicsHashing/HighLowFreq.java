//Count frequency of each element in the array

import java.util.*;

public class HighLowFreq {

    public static void frequency(int arr[], int n) {

        Map<Integer, Integer> map = new HashMap<>(); // fn bnaya hai Map krwane ka jo ki framework mai hai

        for (int i = 0; i < n; i++) {

            if (map.containsKey(arr[i])) {
                // check krega ki jo array[] mai values di hai voh actual mai hai ki nai
                // hoga toh else mai jakr 1 dedega or repeat hua toh if mai jakr +1 krdega
                map.put(arr[i], map.get(arr[i]) + 1);
                // put ->frequency deta hai
                // get -> frequency leta hai put se usse (or if required increase bhi krta hai)
            }

            else {
                map.put(arr[i], 1); // (key,frequency)
                // agar present nai hai toh put krdega -> frequency (1)
                // if present automatically one dedega (frequency one dedega)
                // agar dubara aaya koi toh yeh nai run hoga
            }
        }

        int maxFreq = 0;
        int minFreq = n;
        int maxEle = 0;
        int minEle = 0;

        // Traverse through map and print frequencies
        // Print krke(upr ki process) user ko dhikana hai
        // hashmap ke through loop

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // entry.get
            // entry.value
            // for user ko dhikane ke liye
           
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
        }

    

    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;

        frequency(arr, n);

    }

}
