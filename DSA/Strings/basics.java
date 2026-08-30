public class basics{
    public static void main (String[] args){
    
        // String str = "hello";

        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }

        // String str = "Java";

        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }

        //Palindrome

        // String str = "level";
        // String reverse = "";

        // for(int i=str.length()-1;i>=0;i--){
        //     reverse = reverse + str.charAt(i);
        // }
        // if(str.equals(reverse)){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }

        //Reverse words in a string

        String str = "I am learning java";
        String[] words = str.split(" ");

        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}