import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

    static Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    public static void main(String[] args) {
// 1abb23a
        String testString = "abc.xyz@bl.co.in";
        Matcher matcher = pattern.matcher(testString);
        if (matcher.matches()) {
            System.out.println("Matches");
        } else {
            System.out.println("Not Matching");
        }
    }
}
