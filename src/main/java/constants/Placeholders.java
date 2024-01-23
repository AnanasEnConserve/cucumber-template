package constants;

import java.util.Map;

public class Placeholders {
    public final String typeString = "randString";
    public final String typeInt = "randInt";
    public final String firstName = "<FIRSTNAME>";
    public final String lastName = "<LASTNAME>";
    public final String password = "<PASSWORD>";
    public final String email = "<EMAIL>";
    public final String age = "<AGE>";
    public final Map<String, String> listOfPlaceHoldersToBeReplacedAtSetup = Map.of(firstName, typeString, lastName, typeString, password, typeString, email, typeString, age, typeInt);

}
