package String;

import java.util.HashMap;
import java.util.Map;

public class VowelCounterHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Harikrishan";
		 str=str.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        map.put("e", 0);
        map.put("i", 0);
        map.put("o", 0);
        map.put("u", 0);

        for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' )
                {
                        map.put("a", map.get("a") + 1);
                } 
                else if (ch == 'e') 
                {
                        map.put("e", map.get("e") + 1);
                } 
                else if (ch == 'i') 
                {
                        map.put("i", map.get("i") + 1);
                } 
                else if (ch == 'o')
{
                        map.put("o", map.get("o") + 1);
                } 
                else if (ch == 'u' ) {
                        map.put("u", map.get("u") + 1);
                }
        }

        // print the frequency of each vowel
        System.out.println("Count of 'a' = " + map.get("a"));
        System.out.println("Count of 'e' = " + map.get("e"));
        System.out.println("Count of 'i' = " + map.get("i"));
        System.out.println("Count of 'o' = " + map.get("o"));
        System.out.println("Count of 'u' = " + map.get("u"));
        
   
	}

}
