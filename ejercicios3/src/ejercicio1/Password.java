package ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String value;
    private String pattern;

    public Password(String pattern) {

        this.pattern = pattern;

    }

    public Password() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String pwd) {
        Pattern pattern = Pattern.compile(this.pattern);
        Matcher matcher = pattern.matcher(pwd);
        boolean matchFound = matcher.find();

        if (matchFound) {

            this.value = pwd;
            System.out.println("ejercicio1.Password saved");
        } else {
            try {
                throw new Exception("Invalid password pattern");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.value = pwd;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
