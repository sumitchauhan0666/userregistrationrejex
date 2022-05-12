package rejex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rejex  {

    static Pattern pattern = Pattern.compile("^(?=[^A-Z]*[A-Z][^A-Z]*$)(?=.*\\W+)(?=.*\\d).{8}$");
    static Pattern emailpattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        public static void main(String[] args) {
// 1abb23a
        String password = "amAf@1@u";
            String email= "abc.dfv@bl.com";
        Matcher passwordmatcher = pattern.matcher(password);
            Matcher emailmatcher = emailpattern.matcher(email);
        if(passwordmatcher.matches()==true && emailmatcher.matches()==true){
            System.out.println("Matches");
        }
        else {
            System.out.println("Not Matching");
        }
    }
}

