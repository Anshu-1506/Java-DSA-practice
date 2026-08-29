public class extraQuestions {
    public static void main(String[] args){

        //Find missing number

        // int[] arr = {1,2,3,5,6};
        // int n = 6;

        // int expectedSum = n*(n+1)/2;
        // int actualSum = 0;

        // for(int i=0;i<arr.length;i++){
        //     actualSum += arr[i];
        // }
        // int missing = expectedSum - actualSum;

        // System.out.println(missing);

        //Find Maximum Difference
        
        // int[] arr = {7,1,5,3,6,4};
        // int min = arr[0];
        // int maxDifference = 0;
        // for(int i=1;i<arr.length;i++){
        //     int difference = arr[i]-min;
        //     if(difference > maxDifference){
        //         maxDifference = difference;
        //     }
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        //     }
        // System.out.println(maxDifference);

        //Find maximum sum of subarray(Kadane's Algorithm)

        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        // int currentSum = arr[0];
        // int maxSum = arr[0];

        // for(int i=1;i<arr.length;i++){
        //     currentSum = Math.max(arr[i], currentSum + arr[i]);
        //     maxSum = Math.max(maxSum, currentSum);
        // }
        // System.out.println(maxSum);

        //Rotate Array

        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        left = 0;
        right = k-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
    }

         left = k;
         right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
          }
          
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
          }

    }
}