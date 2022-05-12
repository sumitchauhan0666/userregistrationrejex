package rejex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rejex  {

    static Pattern pattern = Pattern.compile("^[a-z]{8}$");
        public static void main(String[] args) {
// 1abb23a
        String password = "damamkju";
        Matcher passwordmatcher = pattern.matcher(password);
        if(passwordmatcher.matches()==true ){
            System.out.println("Matches");
        }
        else {
            System.out.println("Not Matching");
        }
    }
}

