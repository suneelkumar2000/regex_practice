package regexbasics;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String args[])

	{

		String Sentence = "National income is the measure of total value of goods and services sold for foreign countries";

		Pattern p = Pattern.compile("of");

		Matcher m = p.matcher(Sentence);

		while(m.find())

		{

			System.out.println(m.group());

		}

	}

}
