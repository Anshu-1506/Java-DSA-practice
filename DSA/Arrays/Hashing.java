import java.util.HashMap;
public class Hashing{
    public static void main(String[] args) {
        // int[] arr = {1,2,2,3,1,4,2};

        // HashMap<Integer, Integer> map = new HashMap<>();
        
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])){
        //     map.put((arr[i]), map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i],1);
        //     }
        // }
        // System.out.println(map);

        //Find duplicates elements in an array

    //     int[] arr = {1,2,3,2,4,5,1,3};

    //     HashMap<Integer, Integer> map = new HashMap<>();

    //    // frequency
    //     for(int i=0;i<arr.length;i++){
    //         if(map.containsKey(arr[i])){
    //             map.put((arr[i]), map.get(arr[i])+1);

    //         }
    //         else{
    //             map.put(arr[i],1);
    //         }
    //     }
    //     // find duplicates

    //     for(int i=0;i<arr.length;i++){
    //        if(map.get(arr[i])>1){
    //         System.out.println(arr[i]);
    //         map.put(arr[i], 1);
    //        }
    //     }
    

    //Find Frequency of Array Elements

    // int[] arr = {4,5,4,2,5,5,1};

    // HashMap<Integer, Integer>map = new HashMap<>();

    // for(int i=0;i<arr.length;i++){
    //     if(map.containsKey(arr[i])){
    //         map.put(arr[i],map.get(arr[i])+1);
    //     }
    //     else{
    //         map.put(arr[i], 1);
    //     }
    // }
    // System.out.println(map);

    //Find common elements in two arrays:-

    int[] arr1={1,2,4,5,7};
    int[] arr2={2,3,5,6,7};

    HashMap<Integer, Integer>map = new HashMap<>();

   //store elements of first array
    for(int i=0;i<arr1.length;i++){
        map.put(arr1[i], 1);
    }

    //check second array
     for(int i=0;i<arr2.length;i++){
        if(map.containsKey(arr2[i])){
           System.out.println(arr2[i]);
           map.put(arr2[i], 0);
        }
     }
    }
}