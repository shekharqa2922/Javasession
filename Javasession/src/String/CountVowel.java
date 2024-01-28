package String;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Harikrishan";
		s=s.toLowerCase();
		int vowel=0;

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
				if((ch=='a')||(ch=='e')||(ch==i)||(ch=='u')||(ch=='o'))
					vowel++;
				
					
		}
			System.out.println("Total vowels:" +vowel ) ;
		
	}
		
	}



