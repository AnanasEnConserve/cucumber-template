package constants;

import java.util.Map;

public class Placeholders {
    public static final String typeString = "randString";
    public static final String typeInt = "randInt";
    public static final String typeEmail = "randEmail";
    public static final String firstName = "<FIRSTNAME>";
    public static final String lastName = "<LASTNAME>";
    public static final String password = "<PASSWORD>";
    public static final String email = "<EMAIL>";
    public static final String age = "<AGE>";
    public static final Map<String, String> listOfPlaceHoldersToBeReplacedAtSetup = Map.of(firstName, typeString, lastName, typeString, password, typeString, email, typeEmail, age, typeInt);

}
