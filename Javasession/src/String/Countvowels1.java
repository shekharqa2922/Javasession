package String;

public class Countvowels1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Harikrishan";
		str=str.toLowerCase();
		int[] counters = new int[5];
		 
        for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' ) 
                {
                        counters[0]++;
                } 
                else if (ch == 'e') 
                {
                        counters[1]++;
                } 
                else if (ch == 'i' ) 
                {
                        counters[2]++;
                } 
                else if (ch == 'o') 
                {
                        counters[3]++;
                }
                else if (ch == 'u') 
                {
                        counters[4]++;
                }
        }
        System.out.println("Count of 'a' = " + counters[0]);
        System.out.println("Count of 'e' = " + counters[1]);
        System.out.println("Count of 'i' = " + counters[2]);
        System.out.println("Count of 'o' = " + counters[3]);
        System.out.println("Count of 'u' = " + counters[4]);
	}

}
