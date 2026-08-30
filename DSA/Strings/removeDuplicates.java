import java.util.HashMap;
public class removeDuplicates{
    public static void main(String[] args){
     String str = "banana";

     HashMap<Character, Integer>map = new HashMap<>();

     for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);

        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
     }
     for (int i = 0; i <str.length(); i++) {
        char ch = str.charAt(i);
         if(map.get(ch)>0){
            System.out.println(ch);
            map.put(ch,0);
         }
     }
    }
}