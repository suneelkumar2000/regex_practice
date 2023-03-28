package password;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class PasswordValidator {

	private Pattern pattern;
	private Matcher matcher;
	private static final String PASSWORD_REGEX = "((?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.[@#$%]).{6,20})";
	public PasswordValidator()
	{
		pattern=pattern.compile(PASSWORD_REGEX);
		
	}
  public boolean validate(final String password)
  {
	  matcher =pattern.matcher(password);
	  return matcher.matches();
  }
}
  public class Regex
  {
	  public static void main(String[]args)
	  {
		  PasswordValidator passwordvalidator=new PasswordValidator();
		  System.out.println("'lavanya1AB@' is valid? = "+ passwordvalidator.validate("lavanya1AB@"));
	  }
  }
