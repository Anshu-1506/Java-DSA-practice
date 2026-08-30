import java.util.HashMap;
public class Anagram {
    public static void main(String[] args) {
    //     String str1 = "listen";
    //     String str2 = "silent";

    //     if(str1.length() != str2.length()){
    //       System.out.println("Not Anagram");
    //       }
      
    //     HashMap<Character, Integer>map1 = new HashMap<>();
    //     HashMap<Character, Integer>map2 = new HashMap<>();

    //     for(int i=0;i<str1.length();i++){
    //         char ch = str1.charAt(i);
    //         if(map1.containsKey(ch)){
    //             map1.put(ch,map1.get(ch)+1);
    //         }
    //         else{
    //             map1.put(ch,1);
    //         }
    //     }

    //     for(int i=0;i<str2.length();i++){
    //         char ch = str2.charAt(i);
    //         if(map2.containsKey(ch)){
    //             map2.put(ch,map2.get(ch)+1);
    //         }
    //         else{
    //             map2.put(ch,1);
    //         }
    //     }

    //    if(map1.equals(map2)){
    //     System.out.println("Anagram");
    //    }
    //    else{
    //     System.out.println("Not Anagram");
    //    }


    String str1 = "hello";
        String str2 = "world";

        if(str1.length() != str2.length()){
          System.out.println("Not Anagram");
          }
      
        HashMap<Character, Integer>map1 = new HashMap<>();
        HashMap<Character, Integer>map2 = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }
        }

        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }
            else{
                map2.put(ch,1);
            }
        }

       if(map1.equals(map2)){
        System.out.println("Anagram");
       }
       else{
        System.out.println("Not Anagram");
       }
    }
    
}
