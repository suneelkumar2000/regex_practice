package regexbasics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	public static void main(String args[])
	{
		String Sentence = "Tamil is the oldest Language";
		Pattern p = Pattern.compile("^Tamil");
		Matcher m = p.matcher(Sentence);
		while(m.find())
		{
			System.out.println(m.group() + " Starts at " +m.start() + " and Ends with " +m.end());
		}
		Pattern p1 = Pattern.compile("Language$");
		Matcher m1 = p1.matcher(Sentence);
		while(m1.find())
		{
			System.out.println(m1.group() + " Starts at " +m1.start() + " and Ends with " +m1.end());
		}
		Pattern p2 = Pattern.compile("old|est");
		Matcher m2 = p2.matcher(Sentence);
		while(m2.find())
		{
			System.out.println(m2.group() + " Starts at " +m2.start() + " and Ends with " +m2.end());
		}
	}
}