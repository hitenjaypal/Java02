public class ReverseArray {

    // Function to print array
    //First array ko print krwayenge
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    // Function to reverse array using recursion

    // 3 parametres lemge arr,start,end for reverse
    // temp mai reverse wala store krwayenge 
    // start +1 --> starting se aage badhna 
    // end -1 --> ending se aage badhne ki value
    // at last both merge hojygi then the array will be reverse
    
    public static void RevArr(int arr[], int start, int end) {

        if (start >= end)
            return;

        int temp;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        RevArr(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1 };
        RevArr(arr, 0, n - 1);
        printArray(arr, n);
    }
}
