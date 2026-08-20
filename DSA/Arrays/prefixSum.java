public class prefixSum {
    public static void main(String[] args){
       
        //Question 1

        // int[] arr = {5,2,7,3,6};
        // int[] prefix = new int[arr.length];
        // prefix[0]=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     prefix[i]=prefix[i-1]+arr[i];
        // }
        // for(int i=0;i<prefix.length;i++){
        //     System.out.print(prefix[i]+" ");
        // }
        

        //Question 2
        // int[] arr = {2,4,6,8,10};
        // int[] prefix = new int[arr.length];
        // prefix[0]=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     prefix[i]=prefix[i-1]+arr[i];
        // }
        // int left =1;
        // int right = 3;
        // int sum;
        // if(left==0){
        //     sum=prefix[right];
        // }
        // else{
        //     sum = prefix[right]-prefix[left-1];
        // }
        // System.out.println(sum);

        // int[] arr = {4,7,2,9,5};
        // int sum =0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        // System.out.println(sum);

        //Find Equilibrium index

        int[] arr = {2,3,-1,8,4};
        int totalSum = 0;
        
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        int leftSum=0;

        for(int i=0;i<arr.length;i++){
            int rightSum = totalSum-leftSum-arr[i];
            if(leftSum==rightSum){
                System.out.println("Equilibrium Index: " +i);
                break;
            }
            leftSum += arr[i];
        }
    }
}
