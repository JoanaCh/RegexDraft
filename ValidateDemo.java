import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;


public class ValidateDemo {
	public static void main(String[] args) {
		List<String> input = new ArrayList<String>();
		input.add("123");
		input.add("a3Q");
		input.add("9");
		input.add("987 ");
		input.add("xs");

		String usernameOK = "[a-zAz0-9]{3,}";
		Pattern p = Pattern.compile(usernameOK);

		for (String u : input) {
			Matcher m = p.matcher(u);
			if (m.find()) {
				System.out.println("Found good username: " + u);
			} else {
				System.out.println("Found invalid username: " + u);
			}
		}
	}
}