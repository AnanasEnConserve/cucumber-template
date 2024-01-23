package helpers;

import constants.Paths;
import general.BaseClass;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestdataHelper extends BaseClass {

    public static JsonNode loadTestdata(String scenarioName) throws JsonProcessingException {
        String[] scenarioNameSplit = scenarioName.split("\\[");
        String[] testcaseNameSplit = scenarioNameSplit[1].split("]");
        testcaseNumber = testcaseNameSplit[0];
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = new String(Files.readAllBytes(Path.of(System.getProperty("user.dir") + Paths.Testdata + testcaseNumber + ".json")));
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
        return objectMapper.readTree(jsonString);
    }

    public static JsonNode readTestdata(String route) {
        String[] fullPath = route.split("\\.");
        JsonNode retrievedData = testdata;
        for (String partialPath : fullPath) {
            retrievedData = retrievedData.get(partialPath);
        }
        return retrievedData;
    }

    //Replaces specific placeholders
    public static void replacePlaceholder(String target, String value) {
        String testdataAsString = testdata.toString();
        testdataAsString = testdataAsString.replace(target, value);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            testdata = objectMapper.readTree(testdataAsString);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
    }

    //Should be run at the start to generate all required data to run the test (e.g. names, ages..)
    public static void initializeData() {

    }


}
