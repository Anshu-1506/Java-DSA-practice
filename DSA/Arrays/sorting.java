public class sorting {
    public static void main(String[] args) {
        
        //Bubble Sort

        // int[] arr = {5,1,4,2,8};

        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
    //     }

        //Selection Sort

        // int[] arr = {64,25,12,22,11};

        
        // for(int i=0;i<arr.length-1;i++){
        //  int minIndex = i;
        //  for(int j=i+1;j<arr.length;j++){
        //     if(arr[j]<arr[minIndex]){
        //        minIndex = j;
        //     }
        //  }
        //  int temp = arr[minIndex];
        //  arr[minIndex] = arr[i];
        //  arr[i] = temp;
        // }
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }

        //Insert Sort

        int[] arr = {12,11,13,5,6};
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
