package regexbasics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemoCharacter {
	public static void main(String[]args)
	{
		String sentence ="abcaabbccaaAaabbbcabC3255612150*/-+@#$%%^";
		
		System.out.println("all a,b and c:");
		Pattern p=Pattern.compile("[abc]");
		Matcher m=p.matcher(sentence);	
		while(m.find())
		{
			System.out.print(m.group());			
		}
		
		System.out.println();
		System.out.println("Except a and b:");
		Pattern p1=Pattern.compile("[^ab]");
		Matcher m1=p1.matcher(sentence);	
		while(m1.find())
		{
			System.out.print(m1.group());			
		}
		
		System.out.println();
		System.out.println("All alphabets capital and small letters:");
		Pattern p2=Pattern.compile("[a-zA-Z]");
		Matcher m2=p2.matcher(sentence);	
		while(m2.find())
		{
			System.out.print(m2.group());			
		}
		
		System.out.println();
		System.out.println("All Alphanumerical Value:");
		Pattern p3=Pattern.compile("[a-zA-Z0-9]");
		Matcher m3=p3.matcher(sentence);	
		while(m3.find())
		{
			System.out.print(m3.group());			
		}
		
		System.out.println();
		System.out.println("Except All AlphaNumerical values:");
		Pattern p4=Pattern.compile("[^a-zA-Z)0-9]");
		Matcher m4=p4.matcher(sentence);	
		while(m4.find())
		{
			System.out.print(m4.group());			
		}
	}
}
