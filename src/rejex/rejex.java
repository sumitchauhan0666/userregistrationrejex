package rejex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rejex  {

    static Pattern pattern = Pattern.compile("^[A-Z][a-z]{2}$");
    static Pattern emailpattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    public static void main(String[] args) {
// 1abb23a
        String Firstname = "Ram";
        String Secondname= "San";
        String Email= "abc.dfv@bl.com";

        Matcher Fnamematcher = pattern.matcher(Firstname);
        Matcher Snamematcher = pattern.matcher(Secondname);
        Matcher Emailmatcher = emailpattern.matcher(Email);
        if( Fnamematcher.matches()==true && Snamematcher.matches()  && Emailmatcher.matches()==true){
            System.out.println("Matches");
        }
        else {
            System.out.println("Not Matching");
        }
    }}

