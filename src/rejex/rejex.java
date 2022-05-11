package rejex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rejex  {

    static Pattern pattern = Pattern.compile("^[A-Z][a-z]{2}$");
    static Pattern emailpattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    static Pattern Mobilepattern = Pattern.compile("(?:\\+?(\\d{2}))?+[\s]+[897]{1}+[0-9]{9}");
    public static void main(String[] args) {
// 1abb23a
        String Firstname = "Ram";
        String Secondname= "San";
        String Email= "abc.dfv@bl.com";
        String Mobilenumber="91 9033388878";

        Matcher Fnamematcher = pattern.matcher(Firstname);
        Matcher Snamematcher = pattern.matcher(Secondname);
        Matcher Emailmatcher = emailpattern.matcher(Email);
        Matcher Mobilematcher = Mobilepattern.matcher(Mobilenumber);

        if(Fnamematcher.matches()==true && Snamematcher.matches()  && Emailmatcher.matches()==true  &&Mobilematcher.matches()==true ){
            System.out.println("Matches");
        }
        else {
            System.out.println("Not Matching");
        }
    }}

