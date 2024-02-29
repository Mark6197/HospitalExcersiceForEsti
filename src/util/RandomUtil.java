package util;

import enums.DiseaseDescription;

import java.util.Random;

public class RandomUtil {

    private static final Random random = new Random();
    public static int getRandomDay(int min, int max) {
        return random.nextInt(max - min) + min;
    }
    public static DiseaseDescription generateRandomDiseaseDescription() {
        DiseaseDescription[] descriptions = DiseaseDescription.values();
        return descriptions[random.nextInt(descriptions.length)];
    }
    public static int getRandomAge(int min, int max) {
        return random.nextInt(max - min) + min;
    }

}
