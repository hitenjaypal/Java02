//Count frequency of each element in the array

import java.util.*;

public class CountFrequency {

    public static void frequency(int arr[],int n) {

        Map<Integer, Integer> map = new HashMap<>(); // fn bnaya hai Map krwane ka jo ki framework mai hai

        for (int i =0;i<n;i++){
            
            if(map.containsKey(arr[i]))
            { 
                // check krega ki jo array[] mai values di hai voh actual mai hai ki nai
                // hoga toh else mai jakr 1 dedega or repeat hua toh if mai jakr +1 krdega 
                map.put(arr[i],map.get(arr[i])+1);  
                //put ->frequency deta hai 
                //get -> frequency leta hai put se usse (or if required increase bhi krta hai)
            }

            else
            {
                map.put(arr[i],1);  //(key,frequency)
                // agar present nai hai toh put krdega -> frequency (1)
                // if present automatically one dedega (frequency one dedega)
                // agar dubara aaya koi toh yeh nai run hoga 
            }
            } 

         // Traverse through map and print frequencies   
         // Print krke(upr ki process) user ko dhikana hai
         //hashmap ke through loop

         for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
            //entry.get 
            //entry.value
            // for user ko dhikane ke liye 
            System.out.println(entry.getKey() + ": " + entry.getValue());

         }

         }




    public static void main(String[] args) {
        int[] arr = {1,4,5,9,7,7,1,4,5};
        int n = arr.length;

        frequency(arr,n);


    }

}
