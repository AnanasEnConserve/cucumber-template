package helpers;

import java.util.Random;

public class RandomGenerator {

    public static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static String generateRandomEmail() {
        return generateRandomString() + "@example.com";
    }

    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt();
    }

}
